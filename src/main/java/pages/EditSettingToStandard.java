package pages;

import pages.BasePage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/5c9f0141-4212-417f-8f86-3d7df2a3ea24
@TestModellerModule(guid = "5c9f0141-4212-417f-8f86-3d7df2a3ea24")
public class EditSettingToStandard extends BasePage
{
	public EditSettingToStandard (WebDriver driver)
	{
		super(driver);
	}

	
	
	////html/body/form/main/div[11]/div[2]/ul/li[12]/a/spa
	private By SettingsTabElem=By.xpath("/html/body/form/main/div[11]/div[2]/ul/li[12]/a/span");

	private By VATTabElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbVat']");

	private By EditButtonElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By VATTypeEditElem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbVat_rptrVATStatus_ctl00_hrefEditVAT']/I[@class='fa fa-pencil-square-o']");

	private By SelectVATTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddVATStatus']");
	
	//SELECT[@name='ctl00$cPH$ddVATStatus']
	private By DateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDate']");
	
	private By SaveButtonElem =By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52445&CompanyCode=13250");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52445&CompanyCode=13250");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52445&CompanyCode=13250");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52445&CompanyCode=13250";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/CompanyInfo.aspx?FYCode=52445&CompanyCode=13250")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click SettingsTab
     * @name Click SettingsTab
     */
	public void Click_SettingsTab()
	{
        
		WebElement elem = getWebElement(SettingsTabElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SettingsTab", "Click_SettingsTab failed. Unable to locate object: " + SettingsTabElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SettingsTab", "Click_SettingsTab failed. Unable to locate object: " + SettingsTabElem.toString());

			Assert.fail("Unable to locate object: " + SettingsTabElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SettingsTab");

		TestModellerLogger.PassStep(m_Driver, "Click_SettingsTab");
	}

     
	/**
 	 * Click VATTab
     * @name Click VATTab
     */
	public void Click_VATTab()
	{
        
		WebElement elem = getWebElement(VATTabElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATTab", "Click_VATTab failed. Unable to locate object: " + VATTabElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATTab", "Click_VATTab failed. Unable to locate object: " + VATTabElem.toString());

			Assert.fail("Unable to locate object: " + VATTabElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_VATTab");

		TestModellerLogger.PassStep(m_Driver, "Click_VATTab");
	}

     
	/**
 	 * Click EditButton
     * @name Click EditButton
     */
	public void Click_EditButton()
	{
        
		WebElement elem = getWebElement(EditButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_EditButton", "Click_EditButton failed. Unable to locate object: " + EditButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_EditButton", "Click_EditButton failed. Unable to locate object: " + EditButtonElem.toString());

			Assert.fail("Unable to locate object: " + EditButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_EditButton");

		TestModellerLogger.PassStep(m_Driver, "Click_EditButton");
	}

     
	/**
 	 * Click VATTypeEdit
     * @name Click VATTypeEdit
     */
	public void Click_VATTypeEdit()
	{
        
		WebElement elem = getWebElement(VATTypeEditElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_VATTypeEdit", "Click_VATTypeEdit failed. Unable to locate object: " + VATTypeEditElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_VATTypeEdit", "Click_VATTypeEdit failed. Unable to locate object: " + VATTypeEditElem.toString());

			Assert.fail("Unable to locate object: " + VATTypeEditElem.toString());
        }

		elem.click();
		//elem.sendKeys(Keys.ENTER);
// 		String VT3=VATTypeEdit;
// 		
// 		System.out.println(" " +VT3);
// 		m_Driver.findElement(By.xpath("//*[contains(text(),'"+VT3+"')]")).click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_VATTypeEdit");

		TestModellerLogger.PassStep(m_Driver, "Click_VATTypeEdit");
	}

    
	/**
 	 * Select SelectVATType
	 * @throws InterruptedException 
     * @name Select SelectVATType
     */
    public void Select_SelectVATType(String SelectVATType) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[2]/iframe")));

		
		///html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[2]/iframe
 		WebElement elem = getWebElement(SelectVATTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectVATType", "Select_SelectVATType failed. Unable to locate object: " + SelectVATTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectVATType", "Select_SelectVATType failed. Unable to locate object: " + SelectVATTypeElem.toString());

 			Assert.fail("Unable to locate object: " + SelectVATTypeElem.toString());
         }
 		elem.sendKeys(Keys.ENTER);
 		Select dropdown = new Select(elem);
	elem.sendKeys(Keys.ARROW_DOWN);
 		
 		System.out.println(SelectVATType);
 		 		dropdown.selectByVisibleText(SelectVATType);

		m_Driver.switchTo().defaultContent();
		Thread.sleep(2000);
 	//System.out.println("VATType");
    //elem.sendKeys(Keys.TAB);
		
		//arguments[0].click();", element)
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectVATType " + SelectVATType);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectVATType " + SelectVATType);
 	}
	public void Enter_Date(String Date) throws InterruptedException
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(DateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

 			Assert.fail("Unable to locate object: " + DateElem.toString());
         }
// 		elem.clear();
// 		
// 		elem.sendKeys(Keys.ENTER);
//		elem.sendKeys(Date);
// 		
 		
 		for(int i=0;i<=9;i++)
 		{
			m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_txtDate']")).sendKeys(Keys.BACK_SPACE);
 		}
		
 		elem.sendKeys(Date);
		m_Driver.findElement(By.xpath("//INPUT[@name='ctl00$cPH$txtDate']")).sendKeys(Keys.TAB);
		   m_Driver.switchTo().defaultContent();
  		ExtentReportManager.passStep(m_Driver, "Enter_Date " + Date);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Date " + Date);
  		Thread.sleep(6000);
 	}
     
	/**
 	 * Click SaveButton
	 * @throws IOException 
	 * @throws InterruptedException 
     * @name Click SaveButton
     */
	public void Click_SaveButton() throws IOException, InterruptedException
	{
		
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }
		System.out.println("Click Save Button");
		jsExec.executeScript("arguments[0].click();",elem);
		Searchclient c = new Searchclient(m_Driver);
		String client = c.client1();
		String savnew=client+"VATTypeBefore";
      GetScreenShot.captureAsImage(m_Driver, savnew);

		//elem.click();
		


		m_Driver.switchTo().defaultContent();
  	     
		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}
}