package pages.VAT3;

import pages.BasePage;
import pages.Library;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6301a16c-b95f-49b5-af86-c20989465bf6
@TestModellerModule(guid = "6301a16c-b95f-49b5-af86-c20989465bf6")
public class VATReturnSubmitVAT extends BasePage
{
	public VATReturnSubmitVAT (WebDriver driver)
	{
		super(driver);
	}


	
	//private By VATReturnsTABElem = By.xpath("/html/body/form/main/div[11]/div[2]/ul/li[5]/a/span");
	//private By VATReturnsTABElem = By.xpath("//*[text()='VAT Return']");
	
private By VATReturnsTABElem = By.xpath("//span[contains(text(),'VAT Returns')]");
	private By SettingTABElem = By.xpath("//A[@class='toggleSettings']");
	

	private By VATReturnReportElem = By.xpath("//A[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkVATReturnReport']");

	private By DownloadReturnReportPDFElem = By.xpath("//A[@title='Export drop down menu']");

	private By PDFElem = By.xpath("//A[@title='PDF']");

	private By _VATReturnReportCloseElem = By.xpath("//BUTTON[@id='EditPopUpClose']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/VATReturn.aspx?FYCode=52455&CompanyCode=13259")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click VATReturnsTAB
	 * @throws InterruptedException 
     * @name Click VATReturnsTAB
     */
	public void Click_VATReturnsTAB() throws InterruptedException
	{
        
		WebElement elem = getWebElement(VATReturnsTABElem);
		
		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATReturnsTAB", "Click_VATReturnsTAB failed. Unable to locate object: " + VATReturnsTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATReturnsTAB", "Click_VATReturnsTAB failed. Unable to locate object: " + VATReturnsTABElem.toString());

			Assert.fail("Unable to locate object: " + VATReturnsTABElem.toString());
        }
		
		//elem//.click();
		
		jsExec.executeScript("arguments[0].click();", elem);

		
		//Thread.sleep(1000);

		//ChangeWindow.tabswitch(m_Driver);
		Library.Switchwindow(1, m_Driver);
		Thread.sleep(1000);
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkEdit']/img")).click();
		Thread.sleep(1000);
		
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSaveContinue']")).click();
		//m_Driver.findElement(By.id("ctl00_cpHeaderRight_btnVatExportToExcel")).click();
		Thread.sleep(1500);
		//elem.click();
         	
          	
		ExtentReportManager.passStep(m_Driver, "Click_VATReturnsTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_VATReturnsTAB");
	}

     
	/**
 	 * Click SettingTAB
	 * @throws InterruptedException 
     * @name Click SettingTAB
     */
	public void Click_SettingTAB() throws InterruptedException
	{
        
		WebElement elem = getWebElement(SettingTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SettingTAB", "Click_SettingTAB failed. Unable to locate object: " + SettingTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SettingTAB", "Click_SettingTAB failed. Unable to locate object: " + SettingTABElem.toString());

			Assert.fail("Unable to locate object: " + SettingTABElem.toString());
        }
		m_Driver.findElement(By.id("ctl00_cpHeaderRight_btnVatExportToExcel")).click();
		Thread.sleep(1000);
//		m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cpHeaderRight_btnVatExportToExcel\"]")).click();
//		//m_Driver.findElement(By.xpath("/html//form[@id='aspnetForm']//div[@class='body_content']/div[3]//div[@class='dashIn-opt']/a[6]/i[@class='fa fa-download']")).click();
//		Thread.sleep(1000);
		
		
		ExtentReportManager.passStep(m_Driver, "Click_SettingTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_SettingTAB");
	}

     
	/**
 	 * Click VATReturnReport
     * @name Click VATReturnReport
     */
	public void Click_VATReturnReport()
	{
        
		WebElement elem = getWebElement(VATReturnReportElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATReturnReport", "Click_VATReturnReport failed. Unable to locate object: " + VATReturnReportElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATReturnReport", "Click_VATReturnReport failed. Unable to locate object: " + VATReturnReportElem.toString());

			Assert.fail("Unable to locate object: " + VATReturnReportElem.toString());
        }

		//elem.click();
		m_Driver.findElement(By.xpath("//*[@id='ctl00_cpHeaderRight_btnSaveContinue']")).click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_VATReturnReport");

		TestModellerLogger.PassStep(m_Driver, "Click_VATReturnReport");
	}

     
	/**
 	 * Click DownloadReturnReportPDF
     * @name Click DownloadReturnReportPDF
     */
	public void Click_DownloadReturnReportPDF()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(DownloadReturnReportPDFElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_DownloadReturnReportPDF", "Click_DownloadReturnReportPDF failed. Unable to locate object: " + DownloadReturnReportPDFElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_DownloadReturnReportPDF", "Click_DownloadReturnReportPDF failed. Unable to locate object: " + DownloadReturnReportPDFElem.toString());

			Assert.fail("Unable to locate object: " + DownloadReturnReportPDFElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_DownloadReturnReportPDF");

		TestModellerLogger.PassStep(m_Driver, "Click_DownloadReturnReportPDF");
	}

     
	/**
 	 * Click PDF
     * @name Click PDF
     */
	public void Click_PDF()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[5]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(PDFElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PDF", "Click_PDF failed. Unable to locate object: " + PDFElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PDF", "Click_PDF failed. Unable to locate object: " + PDFElem.toString());

			Assert.fail("Unable to locate object: " + PDFElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_PDF");

		TestModellerLogger.PassStep(m_Driver, "Click_PDF");
	}

     
	/**
 	 * Click × VATReturnReportClose
     * @name Click × VATReturnReportClose
     */
	public void Click__VATReturnReportClose()
	{
        
		WebElement elem = getWebElement(_VATReturnReportCloseElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__VATReturnReportClose", "Click__VATReturnReportClose failed. Unable to locate object: " + _VATReturnReportCloseElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__VATReturnReportClose", "Click__VATReturnReportClose failed. Unable to locate object: " + _VATReturnReportCloseElem.toString());

			Assert.fail("Unable to locate object: " + _VATReturnReportCloseElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__VATReturnReportClose");

		TestModellerLogger.PassStep(m_Driver, "Click__VATReturnReportClose");
	}
}