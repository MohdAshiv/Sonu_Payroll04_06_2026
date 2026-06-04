package pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class TableOfTaxPayment extends BasePage
{
	public TableOfTaxPayment(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public float EE_NI()
	{
		
		String EmployeeNI=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[6]/td[2]/table/tbody/tr[2]/td[6]/div/div")).getText();
      	//System.out.println(EmployeeNI);
  		String EmployeeNIstr=EmployeeNI.replaceAll("[^0-9]", "");
      	
  		double number1 = Double.parseDouble(EmployeeNIstr);
  		number1=number1/100;
		
		return 0;
		
	}
}
