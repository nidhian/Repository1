package pages.SM457;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/d7800073-405f-44f3-9eba-f59a4ab4cb01
@TestModellerModule(guid = "d7800073-405f-44f3-9eba-f59a4ab4cb01")
public class mails extends BasePage
{
	public mails (WebDriver driver)
	{
		super(driver);
	}
	String st1= null;
String template = null;
private By Select_InvoiceTempElem = By.xpath("//*[@id='ctl00_cPH_ddlTemplate']");
	//private By Select_InvoiceTempElem = By.xpath("//label[contains(.,'Invoice Template')]/../../div[2]/div/select");

	private By Email_TemplateElem = By.xpath("//label[contains(.,'Email Template')]/../../div[2]/select");

	private By Enter_mailidElem = By.xpath("//INPUT[@class='form-control el-selection']");

	private By Enter_SubjectElem = By.xpath("//label[contains(.,'Subject')]/../../div[2]/input");

	private By Sendbtn_clickedElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By confirmation_msgesElem = By.xpath("//DIV[@class='alert alert-danger alert-dismissible']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=52444&CompanyCode=13236&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select Select_InvoiceTemp
	 * @throws InterruptedException 
     * @name Select Select_InvoiceTemp
     */
    public void Select_Select_InvoiceTemp(String Select_InvoiceTemp) throws InterruptedException
 	{
    	//Select_InvoiceTempElem
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Select_InvoiceTempElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_InvoiceTemp", "Select_Select_InvoiceTemp failed. Unable to locate object: " + Select_InvoiceTempElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_InvoiceTemp", "Select_Select_InvoiceTemp failed. Unable to locate object: " + Select_InvoiceTempElem.toString());

 			Assert.fail("Unable to locate object: " + Select_InvoiceTempElem.toString());
         }
 		String st = elem.getText();
 		System.out.println("sdsadsad"+st);
// 		if(st.equalsIgnoreCase("Standard Invoice Template"))
// 		{
// 			m_Driver.findElement(By.xpath("//*[contains(text(), 'Portal Invoice Template#1')]")).click();
// 		}
// 		else if(st.equalsIgnoreCase("Portal Invoice Tamplate#1"))
// 		{
 		//	m_Driver.findElement(By.xpath("//*[contains(text(), 'Portal Invoice Tamplate#1')]")).click();
// 		}
 		elem.click();
 		//template= Select_InvoiceTemp;
 		Select dropdown = new Select(elem);
 		st1 = Select_InvoiceTemp;
 		System.out.println("ST1   "+st1);

 		System.out.println("//*[starts-with(text(),'"+st1+"')]");
 		
 		
 		m_Driver.findElement(By.xpath("//*[starts-with(text(), '"+st1+"')]")).click();
 		//jsExec.executeScript("arguments[0].click();", m_Driver.findElement(By.xpath("//*[starts-with(text(), '"+st1+"')]")));
 	//	m_Driver.findElement(By.xpath("//*[contains(text(), 'Portal Invoice Template#1')]")).click();
 	//	elem.sendKeys(Keys.TAB);
 		Thread.sleep(1000);
 		m_Driver.switchTo().defaultContent();
		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_InvoiceTemp " + Select_InvoiceTemp);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_InvoiceTemp " + Select_InvoiceTemp);
 	}

    
	/**
 	 * Select Email_Template
	 * @throws InterruptedException 
     * @name Select Email_Template
     */
    public void Select_Email_Template(String Email_Template) throws InterruptedException
 	{
 	    ///html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Email_TemplateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Email_Template", "Select_Email_Template failed. Unable to locate object: " + Email_TemplateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Email_Template", "Select_Email_Template failed. Unable to locate object: " + Email_TemplateElem.toString());

 			Assert.fail("Unable to locate object: " + Email_TemplateElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Email_Template);
 		
		m_Driver.switchTo().defaultContent();
	
       Thread.sleep(3000);
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Email_Template " + Email_Template);

 		TestModellerLogger.PassStep(m_Driver, "Select_Email_Template " + Email_Template);
 	}

      
	/**
 	 * Enter Enter_mailid
     * @name Enter Enter_mailid
     */
 	//public void Enter_Enter_mailid(String Enter_mailid)
 	public void Enter_Enter_mailid()
 	{
 	
		//m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[4]/div/div/div[2]/iframe")));
 		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[5]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_mailidElem);

// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_mailid", "Enter_Enter_mailid failed. Unable to locate object: " + Enter_mailidElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_mailid", "Enter_Enter_mailid failed. Unable to locate object: " + Enter_mailidElem.toString());
//
// 			Assert.fail("Unable to locate object: " + Enter_mailidElem.toString());
//         }

 	     WebElement emailid = jsWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//INPUT[@class='form-control el-selection']")));


 		elem.sendKeys("nidhi.sharma@nomisma.co.uk");
 		
		m_Driver.switchTo().defaultContent();

 		
//  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_mailid " + Enter_mailid);
//
//  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_mailid " + Enter_mailid);
 	}

      
	/**
 	 * Enter Enter_Subject
     * @name Enter Enter_Subject
     */
 	public void Enter_Enter_Subject(String Enter_Subject)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Enter_SubjectElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Enter_Subject", "Enter_Enter_Subject failed. Unable to locate object: " + Enter_SubjectElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Enter_Subject", "Enter_Enter_Subject failed. Unable to locate object: " + Enter_SubjectElem.toString());

 			Assert.fail("Unable to locate object: " + Enter_SubjectElem.toString());
         }

 		elem.sendKeys(Enter_Subject);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Enter_Subject " + Enter_Subject);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Enter_Subject " + Enter_Subject);
 	}

     
	/**
 	 * Click Sendbtn_clicked
     * @name Click Sendbtn_clicked
     */
	public void Click_Sendbtn_clicked()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Sendbtn_clickedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sendbtn_clicked", "Click_Sendbtn_clicked failed. Unable to locate object: " + Sendbtn_clickedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sendbtn_clicked", "Click_Sendbtn_clicked failed. Unable to locate object: " + Sendbtn_clickedElem.toString());

			Assert.fail("Unable to locate object: " + Sendbtn_clickedElem.toString());
        }

		//elem.click();
		jsExec.executeScript("arguments[0].click();", elem);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Sendbtn_clicked");

		TestModellerLogger.PassStep(m_Driver, "Click_Sendbtn_clicked");
	}

     
	/**
 	 * Click confirmation_msges
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
	 * @throws InterruptedException 
     * @name Click confirmation_msges
     */
	public void Click_confirmation_msges() throws HeadlessException, IOException, AWTException, InterruptedException
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/header/div/div[4]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(confirmation_msgesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_confirmation_msges", "Click_confirmation_msges failed. Unable to locate object: " + confirmation_msgesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_confirmation_msges", "Click_confirmation_msges failed. Unable to locate object: " + confirmation_msgesElem.toString());

			Assert.fail("Unable to locate object: " + confirmation_msgesElem.toString());
        }
			Thread.sleep(1000);
		 			GetScreenShot.captureAsImage(m_Driver, st1);
	
      
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_confirmation_msges");

		TestModellerLogger.PassStep(m_Driver, "Click_confirmation_msges");
	}
}