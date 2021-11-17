package pages.UX1804;

import pages.BasePage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e5749bef-0cf2-4599-b234-e44da331ad98
@TestModellerModule(guid = "e5749bef-0cf2-4599-b234-e44da331ad98")
public class addashboard_Unreconsiled extends BasePage
{
	 public static int  unrecounciledcount2;
	public addashboard_Unreconsiled (WebDriver driver)
	{
		super(driver);
	}


	//private By ctl00ddlFinancialYearElem = By.xpath("//SELECT[@name='ctl00$ddlFinancialYear']");
	private By unreconciled_bank_clickElem = By.cssSelector("A[target='_self']");

	private By Pending__ReceiptElem = By.xpath("//*[@id='ctl00_cPHFilter_btnExportToExcel']/i");
//
//	private By Unallocated_saleElem = By.xpath("//A[@href='Reconcile.aspx?FYCode=52444&CompanyCode=13236&_q=3']");
//
//	private By Unallocated_PurchaseElem = By.xpath("//A[@href='Reconcile.aspx?FYCode=52444&CompanyCode=13236&_q=4']");
//
//	private By Advanc_btn_top_rightElem = By.xpath("//A[@href='/AccountUI/DefaultAdvance.aspx?FYCode=52444&CompanyCode=13236']");
//
//	private By Sales_dashElem = By.xpath("//DIV[@class='col-sm-6']/H3[@class='heading-txt']");
//
//	private By BankingdashElem = By.xpath("//H3[contains(text(),'Banking')]");
//
//	private By bnk_selection_dashElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlBank']");
//
//	private By Reports_dashElem = By.xpath("//DIV[@class='row']/DIV[@class='col-sm-2']/H3[@class='heading-txt']");
//
//	private By reports_dashElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlreports']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true");
	}

     
//	/**
// 	 * AssertUrl
//     * @name AssertUrl
//     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52444&CompanyCode=13236&menuid=0&p=true")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }
	/**
 	 * Select ctl00$ddlFinancialYear
     * @name Select ctl00$ddlFinancialYear
     */
//    public void Select_ctl00ddlFinancialYear(String ctl00ddlFinancialYear)
// 	{
// 	    
// 		WebElement elem = getWebElement(ctl00ddlFinancialYearElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ddlFinancialYear", "Select_ctl00ddlFinancialYear failed. Unable to locate object: " + ctl00ddlFinancialYearElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ddlFinancialYear", "Select_ctl00ddlFinancialYear failed. Unable to locate object: " + ctl00ddlFinancialYearElem.toString());
//
// 			Assert.fail("Unable to locate object: " + ctl00ddlFinancialYearElem.toString());
//         }
// 		elem.sendKeys(Keys.ENTER);
//
// 		Select dropdown = new Select(elem);
// 		//elem.sendKeys(Keys.ARROW_DOWN);
//
// 		dropdown.selectByVisibleText(ctl00ddlFinancialYear);
// 		
// 		
// 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ddlFinancialYear " + ctl00ddlFinancialYear);
//
// 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ddlFinancialYear " + ctl00ddlFinancialYear);
// 	}

     
	/**
 	 * Click unreconciled_bank_click
	 * @throws InterruptedException 
	 * @throws IOException 
     * @name Click unreconciled_bank_click
     */
	public void Click_unreconciled_bank_click() throws InterruptedException, IOException
	{
        
		WebElement elem = getWebElement(unreconciled_bank_clickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_unreconciled_bank_click", "Click_unreconciled_bank_click failed. Unable to locate object: " + unreconciled_bank_clickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_unreconciled_bank_click", "Click_unreconciled_bank_click failed. Unable to locate object: " + unreconciled_bank_clickElem.toString());

			Assert.fail("Unable to locate object: " + unreconciled_bank_clickElem.toString());
        }

		WebElement unreconciledcount2=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[9]/div[1]/a[1]/div/div/div/h1/strong"));
		String unreconciledcount=unreconciledcount2.getText();
	   unrecounciledcount2=Integer.parseInt(unreconciledcount);

	
	
     GetScreenShot.captureAsImage(m_Driver,unreconciledcount);
		//elem.click();
		

//		ExtentReportManager.passStep(m_Driver, "Click_unreconciled_bank_click");

//		TestModellerLogger.PassStep(m_Driver, "Click_unreconciled_bank_click");
	}

public static int unrds()

{
	System.out.println("dasborad amount shown in return:"    +unrecounciledcount2);
	return unrecounciledcount2;
}
//     
//	/**
// 	 * Click Pending _Receipt
//     * @name Click Pending _Receipt
//     */

//	public void Click_Pending__Receipt()
//{
        
	//	WebElement elem = getWebElement(Pending__ReceiptElem);

//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Pending__Receipt", "Click_Pending__Receipt failed. Unable to locate object: " + Pending__ReceiptElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Pending__Receipt", "Click_Pending__Receipt failed. Unable to locate object: " + Pending__ReceiptElem.toString());
//
//			Assert.fail("Unable to locate object: " + Pending__ReceiptElem.toString());
//        }

		//elem.click();
//		m_Driver.findElement(By.xpath("//*[@id='ctl00_cPHFilter_btnExportToExcel']/i")).click();
//
//		ExtentReportManager.passStep(m_Driver, "Click_Pending__Receipt");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Pending__Receipt");

//}
//
//     
//	/**
// 	 * Click Unallocated_sale
//     * @name Click Unallocated_sale
//     */
//	public void Click_Unallocated_sale()
//	{
//        
//		WebElement elem = getWebElement(Unallocated_saleElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Unallocated_sale", "Click_Unallocated_sale failed. Unable to locate object: " + Unallocated_saleElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Unallocated_sale", "Click_Unallocated_sale failed. Unable to locate object: " + Unallocated_saleElem.toString());
//
//			Assert.fail("Unable to locate object: " + Unallocated_saleElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Unallocated_sale");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Unallocated_sale");
//	}
//
//     
//	/**
// 	 * Click Unallocated_Purchase
//     * @name Click Unallocated_Purchase
//     */
//	public void Click_Unallocated_Purchase()
//	{
//        
//		WebElement elem = getWebElement(Unallocated_PurchaseElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Unallocated_Purchase", "Click_Unallocated_Purchase failed. Unable to locate object: " + Unallocated_PurchaseElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Unallocated_Purchase", "Click_Unallocated_Purchase failed. Unable to locate object: " + Unallocated_PurchaseElem.toString());
//
//			Assert.fail("Unable to locate object: " + Unallocated_PurchaseElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Unallocated_Purchase");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Unallocated_Purchase");
//	}
//
//     
//	/**
// 	 * Click Advanc_btn_top_right
//     * @name Click Advanc_btn_top_right
//     */
//	public void Click_Advanc_btn_top_right()
//	{
//        
//		WebElement elem = getWebElement(Advanc_btn_top_rightElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Advanc_btn_top_right", "Click_Advanc_btn_top_right failed. Unable to locate object: " + Advanc_btn_top_rightElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Advanc_btn_top_right", "Click_Advanc_btn_top_right failed. Unable to locate object: " + Advanc_btn_top_rightElem.toString());
//
//			Assert.fail("Unable to locate object: " + Advanc_btn_top_rightElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Advanc_btn_top_right");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Advanc_btn_top_right");
//	}
//
//     
//	/**
// 	 * Click Sales_dash
//     * @name Click Sales_dash
//     */
//	public void Click_Sales_dash()
//	{
//        
//		WebElement elem = getWebElement(Sales_dashElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sales_dash", "Click_Sales_dash failed. Unable to locate object: " + Sales_dashElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sales_dash", "Click_Sales_dash failed. Unable to locate object: " + Sales_dashElem.toString());
//
//			Assert.fail("Unable to locate object: " + Sales_dashElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Sales_dash");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Sales_dash");
//	}
//
//     
//	/**
// 	 * Click Bankingdash
//     * @name Click Bankingdash
//     */
//	public void Click_Bankingdash()
//	{
//        
//		WebElement elem = getWebElement(BankingdashElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Bankingdash", "Click_Bankingdash failed. Unable to locate object: " + BankingdashElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Bankingdash", "Click_Bankingdash failed. Unable to locate object: " + BankingdashElem.toString());
//
//			Assert.fail("Unable to locate object: " + BankingdashElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Bankingdash");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Bankingdash");
//	}
//
//    
//	/**
// 	 * Select bnk_selection_dash
//     * @name Select bnk_selection_dash
//     */
//    public void Select_bnk_selection_dash(String bnk_selection_dash)
// 	{
// 	    
// 		WebElement elem = getWebElement(bnk_selection_dashElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_bnk_selection_dash", "Select_bnk_selection_dash failed. Unable to locate object: " + bnk_selection_dashElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_bnk_selection_dash", "Select_bnk_selection_dash failed. Unable to locate object: " + bnk_selection_dashElem.toString());
//
// 			Assert.fail("Unable to locate object: " + bnk_selection_dashElem.toString());
//         }
//
// 		Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(bnk_selection_dash);
// 		
// 		
// 		ExtentReportManager.passStep(m_Driver, "Select_bnk_selection_dash " + bnk_selection_dash);
//
// 		TestModellerLogger.PassStep(m_Driver, "Select_bnk_selection_dash " + bnk_selection_dash);
// 	}
//
//     
//	/**
// 	 * Click Reports_dash
//     * @name Click Reports_dash
//     */
//	public void Click_Reports_dash()
//	{
//        
//		WebElement elem = getWebElement(Reports_dashElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reports_dash", "Click_Reports_dash failed. Unable to locate object: " + Reports_dashElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reports_dash", "Click_Reports_dash failed. Unable to locate object: " + Reports_dashElem.toString());
//
//			Assert.fail("Unable to locate object: " + Reports_dashElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Reports_dash");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Reports_dash");
//	}
//
//    
//	/**
// 	 * Select reports_dash
//     * @name Select reports_dash
//     */
//    public void Select_reports_dash(String reports_dash)
// 	{
// 	    
// 		WebElement elem = getWebElement(reports_dashElem);
//
// 		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_reports_dash", "Select_reports_dash failed. Unable to locate object: " + reports_dashElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_reports_dash", "Select_reports_dash failed. Unable to locate object: " + reports_dashElem.toString());
//
// 			Assert.fail("Unable to locate object: " + reports_dashElem.toString());
//         }
//
// 		Select dropdown = new Select(elem);
//
// 		dropdown.selectByVisibleText(reports_dash);
// 		
// 		
// 		ExtentReportManager.passStep(m_Driver, "Select_reports_dash " + reports_dash);
//
// 		TestModellerLogger.PassStep(m_Driver, "Select_reports_dash " + reports_dash);
// 	}*/
}