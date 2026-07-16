package PasswordPage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.codeborne.selenide.ex.TimeoutException;

import net.lingala.zip4j.ZipFile;
import pages.BasePage;

public class VerifyPage extends BasePage{

	public VerifyPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void verifyPDFPasswordProtection( String fileName,String expectedPassword) throws Exception {

	 //   String fileName = "Employer's Summary";
	    File pdfFile = null;
	    boolean testPassed = false;

	    // Step 1: Capture timestamp before click — to detect only newly downloaded file
	    long beforeDownload = System.currentTimeMillis();
	    File downloadDir = new File(System.getProperty("user.home") + "/Downloads");

	    // Step 2: Click on Employer Summary attachment link dynamically
	    try {
	        WebElement attachmentLink = m_Driver.findElement(
	            By.xpath("//a[contains(., \"" + fileName + "\") and contains(., '_pp')]")
	        );
	        attachmentLink.click();
	        Reporter.log("Clicked attachment: " + attachmentLink.getText(), true);

	    } catch (NoSuchElementException e) {
	        // Attachment link not found on page — FAIL
	        Reporter.log("FAIL: Employer Summary attachment link not found on page", true);
	        Assert.fail("Attachment link not found — XPath did not match any element");
	    }

	    // Step 3: Wait until NEW PDF is fully downloaded (max 300 seconds)
	    // Uses beforeDownload timestamp — ignores pre-existing files in Downloads folder
	    WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(180));
	    try {
	        wait.until(d -> {
	            File[] files = downloadDir.listFiles(
	                (dir, name) -> name.contains(fileName)
	                            && name.endsWith(".pdf")
	                            && !name.endsWith(".crdownload") // Chrome — download still in progress
	                            && !name.endsWith(".tmp")         // Edge — download still in progress
	                            && new File(dir, name).lastModified() >= beforeDownload // only new file
	            );
	            return files != null && files.length > 0;
	        });
	        Reporter.log("PDF download complete", true);

	    } catch (TimeoutException e) {
	        // PDF did not download within 300 seconds — FAIL
	        Assert.fail("PDF download timed out — file not found after 300 seconds");
	    }

	    // Step 4: Pick the newly downloaded Employer Summary PDF
	    File[] pdfFiles = downloadDir.listFiles(
	        (dir, name) -> name.toLowerCase().endsWith(".pdf")
	                    && name.contains(fileName)
	                    && new File(dir, name).lastModified() >= beforeDownload // session specific
	    );

	    Assert.assertNotNull(pdfFiles, "No PDF found in Downloads folder");
	    Assert.assertTrue(pdfFiles.length > 0, "Employer Summary PDF not found after download");

	    pdfFile = Arrays.stream(pdfFiles)
	                    .max(Comparator.comparingLong(File::lastModified))
	                    .orElseThrow(() -> new RuntimeException("PDF not found"));

	    Reporter.log("PDF found: " + pdfFile.getName(), true);

	    // Step 5: Verify PDF is encrypted — should NOT open without password
	    try (PDDocument doc = PDDocument.load(pdfFile)) {
	        // If PDF opens without password, encryption is missing — FAIL
	        Reporter.log("FAIL: PDF is not password protected", true);
	        Assert.fail("PDF opened without password — encryption is missing");
	    } catch (InvalidPasswordException e) {
	        // Expected — PDF is encrypted, proceed to next step
	        Reporter.log("PDF encryption confirmed", true);
	    } catch (IOException e) {
	        Assert.fail("PDF load error: " + e.getMessage());
	    }

	 // Step 6: Verify PDF opens successfully with the correct password
	    Reporter.log("Expected Password: " + expectedPassword, true);

	    try (PDDocument doc = PDDocument.load(pdfFile, expectedPassword)) {
	        Reporter.log("PASS: " + pdfFile.getName() +
	                     " opened with correct password: " + expectedPassword, true);
	        Assert.assertTrue(doc.isEncrypted(), "PDF should be encrypted");
	        testPassed = true;

	    } catch (InvalidPasswordException e) {
	        Assert.fail("FAIL: Incorrect password. Expected Password: " + expectedPassword +
	                    " — " + pdfFile.getName() + " could not be opened");

	    } catch (IOException e) {
	        Assert.fail("PDF load error: " + e.getMessage());
	    }

	    // Step 7: Delete PDF regardless of pass or fail
	    if (pdfFile != null && pdfFile.exists()) {
	        if (pdfFile.delete()) {
	            Reporter.log("PDF deleted successfully: " + pdfFile.getName(), true);
	        } else {
	            Reporter.log("WARNING: PDF could not be deleted — please delete manually: " + pdfFile.getName(), true);
	        }
	    }

	    // Step 8: Log final result
	    if (testPassed) {
	        Reporter.log("PASS:  PDF password verification successful", true);
	    } else {
	        Reporter.log("FAIL:  PDF password verification failed", true);
	    }
	}

	
	
	//For zip case please uncommentS
	public void verifyZipPasswordProtection(String fileName, String expectedPassword) throws Exception {

	    File zipFile = null;
	    boolean testPassed = false;

	    // Step 1: Capture timestamp before click — to detect only newly downloaded file
	    long beforeDownload = System.currentTimeMillis();
	    File downloadDir = new File(System.getProperty("user.home") + "/Downloads");

	    // Step 2: Click on attachment link dynamically
	    try {
	        WebElement attachmentLink = m_Driver.findElement(
	            By.xpath("//a[contains(., \"" + fileName + "\")]")
	        );
	        attachmentLink.click();
	        Reporter.log("Clicked attachment: " + attachmentLink.getText(), true);

	    } catch (NoSuchElementException e) {
	        Reporter.log("FAIL: Attachment link not found on page", true);
	        Assert.fail("Attachment link not found — XPath did not match any element");
	    }

	    // Step 3: Wait until NEW ZIP is fully downloaded (max 180 seconds)
	    WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(180));
	    try {
	        wait.until(d -> {
	            File[] files = downloadDir.listFiles(
	                (dir, name) -> name.contains(fileName)
	                            && name.toLowerCase().endsWith(".zip")
	                            && !name.endsWith(".crdownload") // Chrome — download still in progress
	                            && !name.endsWith(".tmp")         // Edge — download still in progress
	                            && new File(dir, name).lastModified() >= beforeDownload // only new file
	            );
	            return files != null && files.length > 0;
	        });
	        Reporter.log("ZIP download complete", true);

	    } catch (TimeoutException e) {
	        Assert.fail("ZIP download timed out — file not found after 180 seconds");
	    }

	    // Step 4: Pick the newly downloaded ZIP
	    File[] zipFiles = downloadDir.listFiles(
	        (dir, name) -> name.toLowerCase().endsWith(".zip")
	                    && name.contains(fileName)
	                    && new File(dir, name).lastModified() >= beforeDownload
	    );

	    Assert.assertNotNull(zipFiles, "No ZIP found in Downloads folder");
	    Assert.assertTrue(zipFiles.length > 0, "ZIP not found after download");

	    zipFile = Arrays.stream(zipFiles)
	                    .max(Comparator.comparingLong(File::lastModified))
	                    .orElseThrow(() -> new RuntimeException("ZIP not found"));

	    Reporter.log("ZIP found: " + zipFile.getName(), true);

	    // Step 5: Verify ZIP is password protected
	    net.lingala.zip4j.ZipFile zf = new net.lingala.zip4j.ZipFile(zipFile);
	    try {
	        if (!zf.isEncrypted()) {
	            Reporter.log("FAIL: ZIP is not password protected", true);
	            Assert.fail("ZIP is not encrypted — password protection missing");
	        }
	        Reporter.log("ZIP encryption confirmed", true);
	    } catch (net.lingala.zip4j.exception.ZipException e) {
	        Assert.fail("ZIP read error: " + e.getMessage());
	    }

	    // Step 6: Verify wrong/no password fails
	    File extractDirWrong = new File(downloadDir, "zip_extract_check_wrong");
	    try {
	        net.lingala.zip4j.ZipFile zfNoPass = new net.lingala.zip4j.ZipFile(zipFile);
	        zfNoPass.extractAll(extractDirWrong.getAbsolutePath());
	        Reporter.log("FAIL: ZIP extracted without password — encryption missing", true);
	        Assert.fail("ZIP extracted without password — encryption is missing");
	    } catch (net.lingala.zip4j.exception.ZipException e) {
	        // Expected — needs password
	        Reporter.log("Confirmed: ZIP cannot be extracted without password", true);
	    } finally {
	        deleteDirectoryQuietly(extractDirWrong);
	    }

	 // Step 7: Verify ZIP extracts successfully with correct password
	    File extractDir = new File(downloadDir, "zip_extract_check_" + System.currentTimeMillis());

	    Reporter.log("Expected Password: " + expectedPassword, true);
	    //System.out.println("Expected Password: " + expectedPassword);

	    try {
	        net.lingala.zip4j.ZipFile zfWithPass =
	                new net.lingala.zip4j.ZipFile(zipFile, expectedPassword.toCharArray());

	        zfWithPass.extractAll(extractDir.getAbsolutePath());

	        File[] extracted = extractDir.listFiles();
	        Assert.assertNotNull(extracted, "Extraction produced no files");
	        Assert.assertTrue(extracted.length > 0, "Extracted folder is empty — password may be wrong");

	        Reporter.log("PASS: " + zipFile.getName()
	                + " extracted with correct password: " + expectedPassword, true);
	        testPassed = true;

	    } catch (net.lingala.zip4j.exception.ZipException e) {
	        Assert.fail("FAIL: Incorrect password. Expected Password: "
	                + expectedPassword + " — " + zipFile.getName()
	                + " could not be extracted. " + e.getMessage());
	    } finally {
	        deleteDirectoryQuietly(extractDir);
	    }
	    // Step 8: Delete ZIP regardless of pass or fail
	    if (zipFile != null && zipFile.exists()) {
	        if (zipFile.delete()) {
	            Reporter.log("ZIP deleted successfully: " + zipFile.getName(), true);
	        } else {
	            Reporter.log("WARNING: ZIP could not be deleted — please delete manually: " + zipFile.getName(), true);
	        }
	    }

	    // Step 9: Log final result
	    if (testPassed) {
	        Reporter.log("PASS:  ZIP password verification successful", true);
	    } else {
	        Reporter.log("FAIL:  ZIP password verification failed", true);
	    }
	}

	// Helper to clean up extraction folders
	private void deleteDirectoryQuietly(File dir) {
	    if (dir != null && dir.exists()) {
	        File[] files = dir.listFiles();
	        if (files != null) {
	            for (File f : files) {
	                f.delete();
	            }
	        }
	        dir.delete();
	    }
	}
	
	
//	public void verifyZipPasswordProtection(String fileName, String expectedPassword) throws Exception {
//
//	    File zipFile = null;
//	    boolean testPassed = false;
//
//	    // Step 1: Capture timestamp before click — to detect only newly downloaded file
//	    long beforeDownload = System.currentTimeMillis();
//	    File downloadDir = new File(System.getProperty("user.home") + "/Downloads");
//
//	    // Step 2: Click on attachment link dynamically
//	    try {
//	        WebElement attachmentLink = m_Driver.findElement(
//	            By.xpath("//a[contains(., \"" + fileName + "\")]")
//	        );
//	        attachmentLink.click();
//	        Reporter.log("Clicked attachment: " + attachmentLink.getText(), true);
//
//	    } catch (NoSuchElementException e) {
//	        Reporter.log("FAIL: Attachment link not found on page", true);
//	        Assert.fail("Attachment link not found — XPath did not match any element");
//	    }
//
//	    // Step 3: Wait until NEW ZIP is fully downloaded (max 180 seconds)
//	    WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(180));
//	    try {
//	        wait.until(d -> {
//	            File[] files = downloadDir.listFiles(
//	                (dir, name) -> name.contains(fileName)
//	                            && name.toLowerCase().endsWith(".zip")
//	                            && !name.endsWith(".crdownload") // Chrome — download still in progress
//	                            && !name.endsWith(".tmp")         // Edge — download still in progress
//	                            && new File(dir, name).lastModified() >= beforeDownload // only new file
//	            );
//	            return files != null && files.length > 0;
//	        });
//	        Reporter.log("ZIP download complete", true);
//
//	    } catch (TimeoutException e) {
//	        Assert.fail("ZIP download timed out — file not found after 180 seconds");
//	    }
//
//	    // Step 4: Pick the newly downloaded ZIP
//	    File[] zipFiles = downloadDir.listFiles(
//	        (dir, name) -> name.toLowerCase().endsWith(".zip")
//	                    && name.contains(fileName)
//	                    && new File(dir, name).lastModified() >= beforeDownload
//	    );
//
//	    Assert.assertNotNull(zipFiles, "No ZIP found in Downloads folder");
//	    Assert.assertTrue(zipFiles.length > 0, "ZIP not found after download");
//
//	    zipFile = Arrays.stream(zipFiles)
//	                    .max(Comparator.comparingLong(File::lastModified))
//	                    .orElseThrow(() -> new RuntimeException("ZIP not found"));
//
//	    Reporter.log("ZIP found: " + zipFile.getName(), true);
//
//	    // Step 5: Verify ZIP is password protected
//	    net.lingala.zip4j.ZipFile zf = new net.lingala.zip4j.ZipFile(zipFile);
//	    try {
//	        if (!zf.isEncrypted()) {
//	            Reporter.log("FAIL: ZIP is not password protected", true);
//	            Assert.fail("ZIP is not encrypted — password protection missing");
//	        }
//	        Reporter.log("ZIP encryption confirmed", true);
//	    } catch (net.lingala.zip4j.exception.ZipException e) {
//	        Assert.fail("ZIP read error: " + e.getMessage());
//	    }
//
//	    // Step 6: Verify wrong/no password fails
//	    File extractDirWrong = new File(downloadDir, "zip_extract_check_wrong");
//	    try {
//	        net.lingala.zip4j.ZipFile zfNoPass = new net.lingala.zip4j.ZipFile(zipFile);
//	        zfNoPass.extractAll(extractDirWrong.getAbsolutePath());
//	        Reporter.log("FAIL: ZIP extracted without password — encryption missing", true);
//	        Assert.fail("ZIP extracted without password — encryption is missing");
//	    } catch (net.lingala.zip4j.exception.ZipException e) {
//	        // Expected — needs password
//	        Reporter.log("Confirmed: ZIP cannot be extracted without password", true);
//	    } finally {
//	        deleteDirectoryQuietly(extractDirWrong);
//	    }
//
//	    // Step 7: Verify ZIP extracts successfully with correct password
//	    File extractDir = new File(downloadDir, "zip_extract_check_" + System.currentTimeMillis());
//	    try {
//	        net.lingala.zip4j.ZipFile zfWithPass = new net.lingala.zip4j.ZipFile(zipFile, expectedPassword.toCharArray());
//	        zfWithPass.extractAll(extractDir.getAbsolutePath());
//
//	        File[] extracted = extractDir.listFiles();
//	        Assert.assertNotNull(extracted, "Extraction produced no files");
//	        Assert.assertTrue(extracted.length > 0, "Extracted folder is empty — password may be wrong");
//
//	        Reporter.log("PASS: " + zipFile.getName() + " extracted with correct password", true);
//	        testPassed = true;
//
//	    } catch (net.lingala.zip4j.exception.ZipException e) {
//	        Assert.fail("FAIL: Incorrect password — " + zipFile.getName() + " could not be extracted. " + e.getMessage());
//	    } finally {
//	        deleteDirectoryQuietly(extractDir);
//	    }
//
//	    // Step 8: Delete ZIP regardless of pass or fail
//	    if (zipFile != null && zipFile.exists()) {
//	        if (zipFile.delete()) {
//	            Reporter.log("ZIP deleted successfully: " + zipFile.getName(), true);
//	        } else {
//	            Reporter.log("WARNING: ZIP could not be deleted — please delete manually: " + zipFile.getName(), true);
//	        }
//	    }
//
//	    // Step 9: Log final result
//	    if (testPassed) {
//	        Reporter.log("PASS:  ZIP password verification successful", true);
//	    } else {
//	        Reporter.log("FAIL:  ZIP password verification failed", true);
//	    }
//	}
//
//	// Helper to clean up extraction folders
//
//	private void deleteDirectoryQuietly(File dir) {
//	    if (dir != null && dir.exists()) {
//	        File[] files = dir.listFiles();
//	        if (files != null) {
//	            for (File f : files) {
//	                f.delete();
//	            }
//	        }
//	        dir.delete();
//	    }
//	}
	
	 
	 public void verifyLastActivityLogField(String expectedField) throws InterruptedException {

		 
		     m_Driver.findElement(By.xpath("//*[@id=\"dvPasswordProtectionPopup2\"]/div/div/div[1]/div/button")).click();
		     
		     Thread.sleep(2000);
		     
		     
		    WebDriverWait wait = new WebDriverWait(m_Driver, Duration.ofSeconds(10));

		    WebElement lastField = wait.until(ExpectedConditions.visibilityOfElementLocated(
		            By.xpath("//*[@id='activityLogBody']/tr[last()]/td[1]")));

		    String actualField = lastField.getText().trim();

		    Reporter.log("Expected Field: " + expectedField, true);
		    Reporter.log("Actual Field: " + actualField, true);

		    Assert.assertEquals(actualField, expectedField,
		            "Last activity log field does not match.");
		     m_Driver.findElement(By.xpath("//*[@id=\"FAAddEmailClose\"]/span")).click();

		    

		    Reporter.log("Last Activity Log Field verified successfully.", true);
		}
	 
}
