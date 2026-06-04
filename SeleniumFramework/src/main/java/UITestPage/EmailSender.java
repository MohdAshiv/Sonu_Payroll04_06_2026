package UITestPage;
 
 
import jakarta.mail.*;
import jakarta.mail.internet.*;
import pages.BasePage;

import java.util.Properties;
 
import org.openqa.selenium.WebDriver;
 
import java.io.File;
 
import java.io.*;
import java.util.zip.*;
 
public class EmailSender extends BasePage{
 
    public EmailSender(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
 
	public static void sendReportEmail(String toEmail, String reportFilePath) {
 
        final String fromEmail = "Sonu.Kumar@nomi.co.uk";
        final String password = "smdtjwxzqlsmwgpn";
        final String subject = "Automation Test Report";
        final String bodyText = "Please find the attached test report.";
 
        // SMTP Configuration
        Properties props = new Properties();
        props.put("mail.smtp.host", "outlook.office365.com"); // Replace with your SMTP host
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
 
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });
 
        try {
            // Create a new email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(subject);
 
            // Email body part
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(bodyText);
 
            // Attachment part
            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(new File(reportFilePath)); // Path to your report

 
            // Combine parts
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachmentPart);
 
            // Set the content
            message.setContent(multipart);
 
            // Send the message
            Transport.send(message);
 
            System.out.println("Report email sent successfully!");
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
//    // Example call
//    public static void main(String[] args) {
//        String recipient = "Sonu.Kumar@nomi.co.uk";
//        String reportPath = "C:\\Users\\ashiv\\git\\UITest\\SeleniumFramework\\report\\index.html";
//        String FolderZip  ="";
//		sendReportEmail(recipient, reportPath);
//    }



 
        public static void zipFolder(String sourceFolderPath, String zipFilePath) throws IOException {
            FileOutputStream fos = new FileOutputStream(zipFilePath);
            ZipOutputStream zipOut = new ZipOutputStream(fos);
            File sourceFile = new File(sourceFolderPath);
            zipFile(sourceFile, sourceFile.getName(), zipOut);
            zipOut.close();
            fos.close();
        }
 
        private static void zipFile(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {
            if (fileToZip.isHidden()) return;
 
            if (fileToZip.isDirectory()) {
                if (!fileName.endsWith("/")) fileName += "/";
                zipOut.putNextEntry(new ZipEntry(fileName));
                zipOut.closeEntry();
                File[] children = fileToZip.listFiles();
                if (children != null) {
                    for (File childFile : children) {
                        zipFile(childFile, fileName + childFile.getName(), zipOut);
                    }
                }
                return;
            }
 
            FileInputStream fis = new FileInputStream(fileToZip);
            ZipEntry zipEntry = new ZipEntry(fileName);
            zipOut.putNextEntry(zipEntry);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
            fis.close();
        }







}