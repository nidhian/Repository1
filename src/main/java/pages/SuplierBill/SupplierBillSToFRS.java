package pages.SuplierBill;

import pages.BasePage;
import pages.nlogin;
import pages.PartialReconcilationLAtest;
import pages.nBANKTRN;
import pages.EditSettingToStandard;
import pages.AgentSearch;
import pages.businessrc;
import pages.bankmenu;
import pages.businessrc;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
//import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.GetScreenShot;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c29beaa8-f2fc-4329-9277-5fccdf3338c6
@TestModellerModule(guid = "c29beaa8-f2fc-4329-9277-5fccdf3338c6")
public class SupplierBillSToFRS extends BasePage
{
	
	String BNO;
	String inel=" ";
	String SupNo=" ";
	public SupplierBillSToFRS (WebDriver driver)
	{
		super(driver);
	}


	
	//private By ExpenditureTABElem = By.xpath("//A[@href='../AccountUI/SupplierBill.aspx?FYCode=52550&CompanyCode=13324']");

	private By ExpenditureTABElem = By.xpath("//span[contains(text(), 'Expenditure')]");
	
	private By NewTABElem = By.xpath("//*[@id='ctl00_divMainContent']/header/div/div[4]/a");

	private By NewSupplierBillElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

	private By SupplierNameElem = By.xpath("//*[@id='ctl00_cPH_ddlSupplier']");

	private By DefaultCurrencyElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDefaultCurrency']");

	//private By BillNoElem = By.xpath("//INPUT[@name='ctl00$cPH$txtBillNo']");
	
	private By BillNoElem = By.id("ctl00_cPH_txtBillNo");

	private By DateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDate']");

	//private By ExpenseTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddExpenseHead']");
	private By ExpenseTypeElem=By.xpath("//*[@id='select2-ctl00_cPH_rptrProduct_ctl00_ltAccount-container']");
	private By Expensetypebox=By.xpath("/html/body/span/span/span[1]/input");

	private By DescriptionElem = By.xpath("//TEXTAREA[@name='ctl00$cPH$rptrProduct$ctl00$txtDescription']");

	private By UnitPriceElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$txtUnitPrice']");

	private By VATRateTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$rptrProduct$ctl00$ddVATRate']");

	private By VATRateElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$ltVATRate']");

	private By VATAmountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$ltVATAmount']");

	private By AmountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptrProduct$ctl00$ltAmount']");

	private By TickformorelineitemsElem = By.cssSelector("SPAN[onfocus='document\\.getElementById\\(\\'__LASTFOCUS\\'\\)\\.value\\=this\\.id']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_cPH_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52550&CompanyCode=13324&id=0&action=Add&bt=Bmenuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52550&CompanyCode=13324&id=0&action=Add&bt=Bmenuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52550&CompanyCode=13324&id=0&action=Add&bt=Bmenuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52550&CompanyCode=13324&id=0&action=Add&bt=Bmenuid=0";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=52550&CompanyCode=13324&id=0&action=Add&bt=Bmenuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ExpenditureTAB
     * @name Click ExpenditureTAB
     */
	public void Click_ExpenditureTAB()
	{
        
		WebElement elem = getWebElement(ExpenditureTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ExpenditureTAB", "Click_ExpenditureTAB failed. Unable to locate object: " + ExpenditureTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ExpenditureTAB", "Click_ExpenditureTAB failed. Unable to locate object: " + ExpenditureTABElem.toString());

			Assert.fail("Unable to locate object: " + ExpenditureTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ExpenditureTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_ExpenditureTAB");
	}

     
	/**
 	 * Click NewTAB
     * @name Click NewTAB
     */
	public void Click_NewTAB()
	{
        
		WebElement elem = getWebElement(NewTABElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewTAB", "Click_NewTAB failed. Unable to locate object: " + NewTABElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewTAB", "Click_NewTAB failed. Unable to locate object: " + NewTABElem.toString());

			Assert.fail("Unable to locate object: " + NewTABElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_NewTAB");

		TestModellerLogger.PassStep(m_Driver, "Click_NewTAB");
	}

     
	/**
 	 * Click NewSupplierBill
     * @name Click NewSupplierBill
     */
	public void Click_NewSupplierBill()
	{
        
		WebElement elem = getWebElement(NewSupplierBillElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_NewSupplierBill", "Click_NewSupplierBill failed. Unable to locate object: " + NewSupplierBillElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_NewSupplierBill", "Click_NewSupplierBill failed. Unable to locate object: " + NewSupplierBillElem.toString());

			Assert.fail("Unable to locate object: " + NewSupplierBillElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_NewSupplierBill");

		TestModellerLogger.PassStep(m_Driver, "Click_NewSupplierBill");
	}

    
	/**
 	 * Select SupplierName
     * @name Select SupplierName
     */
    public void Select_SupplierName(String SupplierName)
 	{
 	    
 		WebElement elem = getWebElement(SupplierNameElem);
 		System.out.println("dfdfd"+SupplierName);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SupplierName", "Select_SupplierName failed. Unable to locate object: " + SupplierNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SupplierName", "Select_SupplierName failed. Unable to locate object: " + SupplierNameElem.toString());

 			Assert.fail("Unable to locate object: " + SupplierNameElem.toString());
         }
       elem.sendKeys(Keys.ENTER);
	       String sup=SupplierName;
   	
   	System.out.println("selected suplier " +sup);
   	m_Driver.findElement(By.xpath("//*[contains(text(),'"+sup+"')]")).click();
 		
   	
 		ExtentReportManager.passStep(m_Driver, "Select_SupplierName " + SupplierName);

 		TestModellerLogger.PassStep(m_Driver, "Select_SupplierName " + SupplierName);
 	}

      
	/**
 	 * Enter DefaultCurrency
     * @name Enter DefaultCurrency
     */
 	public void Enter_DefaultCurrency(String DefaultCurrency)
 	{
 	    
 		WebElement elem = getWebElement(DefaultCurrencyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DefaultCurrency", "Enter_DefaultCurrency failed. Unable to locate object: " + DefaultCurrencyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DefaultCurrency", "Enter_DefaultCurrency failed. Unable to locate object: " + DefaultCurrencyElem.toString());

 			Assert.fail("Unable to locate object: " + DefaultCurrencyElem.toString());
         }

 		elem.sendKeys(DefaultCurrency);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DefaultCurrency " + DefaultCurrency);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DefaultCurrency " + DefaultCurrency);
 	}

      
	/**
 	 * Enter BillNo
	 * @throws InterruptedException 
     * @name Enter BillNo
     */
 	public void Enter_BillNo(String BillNo) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(BillNoElem);

 		System.out.println("BillNO"+BillNo);
 		BNO = BillNo;
 		
 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_BillNo", "Enter_BillNo failed. Unable to locate object: " + BillNoElem.toString());
    		
    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_BillNo", "Enter_BillNo failed. Unable to locate object: " + BillNoElem.toString());

 			Assert.fail("Unable to locate object: " + BillNoElem.toString());
         }
 		
 		elem.sendKeys(BillNo);
 	
 	
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_BillNo " + BillNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_BillNo " + BillNo);
 	}

      
	/**
 	 * Enter Date
     * @name Enter Date
     */
 	public void Enter_Date(String Date)
 	{
 	    
 		WebElement elem = getWebElement(DateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

 			Assert.fail("Unable to locate object: " + DateElem.toString());
         }
 		for(int i=0; i<10;i++)
 		{
 			elem.sendKeys(Keys.BACK_SPACE);
 		}
 		elem.sendKeys(Date);
 		elem.sendKeys(Keys.TAB);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Date " + Date);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Date " + Date);
 	}

    
	/**
 	 * Select ExpenseType
	 * @throws InterruptedException 
     * @name Select ExpenseType
     */
 
    public void Click_ExpenseType() throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(ExpenseTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ExpenseType", "Select_ExpenseType failed. Unable to locate object: " + ExpenseTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ExpenseType", "Select_ExpenseType failed. Unable to locate object: " + ExpenseTypeElem.toString());

 			Assert.fail("Unable to locate object: " + ExpenseTypeElem.toString());
         }
 		System.out.println("FIRST BOX");
 		elem.click();
 		
 		Thread.sleep(2000);
 	}

    public void Expenset(String Expensetypebox) throws InterruptedException
 	{
 	    


 	       
 	         String p =Expensetypebox;
 	         System.out.print("Expensetypebox"   +p );
 	        //m_Driver.findElement(By.xpath("//*[Contains(text(),'" +p+ "')]")).click();
 	         ////*[contains(text(),'ABC')]
 	         m_Driver.findElement(By.xpath("//*[contains(text(),'" +p+ "')]")).click();
 	         Thread.sleep(2000);

 	}
	/**
 	 * Enter Description
     * @name Enter Description
     */
 	public void Enter_Description(String Description)
 	{
 	    
 		WebElement elem = getWebElement(DescriptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + DescriptionElem.toString());
         }

 		elem.sendKeys(Description);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Description " + Description);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Description " + Description);
 	}

      
	/**
 	 * Enter UnitPrice
	 * @throws InterruptedException 
     * @name Enter UnitPrice
     */
 	public void Enter_UnitPrice(String UnitPrice) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(UnitPriceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_UnitPrice", "Enter_UnitPrice failed. Unable to locate object: " + UnitPriceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_UnitPrice", "Enter_UnitPrice failed. Unable to locate object: " + UnitPriceElem.toString());

 			Assert.fail("Unable to locate object: " + UnitPriceElem.toString());
         }
 		
 	elem.clear();
 		
 		elem.sendKeys(UnitPrice);
 	
 	
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_UnitPrice " + UnitPrice);

  		TestModellerLogger.PassStep(m_Driver, "Enter_UnitPrice " + UnitPrice);
 	}

    
	/**
 	 * Select VATRateType
     * @name Select VATRateType
     */
    public void Select_VATRateType(String VATRateType)
 	{
 	    
 		WebElement elem = getWebElement(VATRateTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_VATRateType", "Select_VATRateType failed. Unable to locate object: " + VATRateTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_VATRateType", "Select_VATRateType failed. Unable to locate object: " + VATRateTypeElem.toString());

 			Assert.fail("Unable to locate object: " + VATRateTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(VATRateType);
 		
 		System.out.println(VATRateType);
 		ExtentReportManager.passStep(m_Driver, "Select_VATRateType " + VATRateType);

 		TestModellerLogger.PassStep(m_Driver, "Select_VATRateType " + VATRateType);
 	}

      
	/**
 	 * Enter VATRate
     * @name Enter VATRate
     */
 	public void Enter_VATRate(String VATRate)
 	{
 	    
 		WebElement elem = getWebElement(VATRateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_VATRate", "Enter_VATRate failed. Unable to locate object: " + VATRateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_VATRate", "Enter_VATRate failed. Unable to locate object: " + VATRateElem.toString());

 			Assert.fail("Unable to locate object: " + VATRateElem.toString());
         }

 		elem.sendKeys(VATRate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_VATRate " + VATRate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_VATRate " + VATRate);
 	}

      
	/**
 	 * Enter VATAmount
     * @name Enter VATAmount
     */
 	public void Enter_VATAmount(String VATAmount)
 	{
 	    
 		WebElement elem = getWebElement(VATAmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_VATAmount", "Enter_VATAmount failed. Unable to locate object: " + VATAmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_VATAmount", "Enter_VATAmount failed. Unable to locate object: " + VATAmountElem.toString());

 			Assert.fail("Unable to locate object: " + VATAmountElem.toString());
         }

 		elem.sendKeys(VATAmount);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_VATAmount " + VATAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_VATAmount " + VATAmount);
 	}

      
	/**
 	 * Enter Amount
     * @name Enter Amount
     */
 	public void Enter_Amount(String Amount)
 	{
 	    
 		WebElement elem = getWebElement(AmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Amount", "Enter_Amount failed. Unable to locate object: " + AmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Amount", "Enter_Amount failed. Unable to locate object: " + AmountElem.toString());

 			Assert.fail("Unable to locate object: " + AmountElem.toString());
         }

 		elem.sendKeys(Amount);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Amount " + Amount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Amount " + Amount);
 	}

     
	/**
 	 * Click Tickformorelineitems
     * @name Click Tickformorelineitems
     */
	public void Click_Tickformorelineitems()
	{
        
		WebElement elem = getWebElement(TickformorelineitemsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Tickformorelineitems", "Click_Tickformorelineitems failed. Unable to locate object: " + TickformorelineitemsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Tickformorelineitems", "Click_Tickformorelineitems failed. Unable to locate object: " + TickformorelineitemsElem.toString());

			Assert.fail("Unable to locate object: " + TickformorelineitemsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Tickformorelineitems");

		TestModellerLogger.PassStep(m_Driver, "Click_Tickformorelineitems");
	}

     
	/**
 	 * Click SaveButton
	 * @throws InterruptedException 
	 * @throws AWTException 
	 * @throws IOException 
	 * @throws HeadlessException 
     * @name Click SaveButton
     */
	public void Click_SaveButton() throws InterruptedException, HeadlessException, IOException, AWTException
	{
		System.out.println("In Save");
        
		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }
		//*[@id="ctl00_divSubContent"]/div[1]/div
		//elem.click();
		jsExec.executeScript("arguments[0].scrollIntoView(true);", elem);
		jsExec.executeScript("arguments[0].click();", elem);
		//Thread.sleep(4000);
		//Thread.sleep(1000);
	// WebElement inv1=m_Driver.findElement(By.xpath("//*[@id='ctl00_divSubContent']/div[1]/div"));
	   //  String invoicetransno=inv1.getText();
	   //  System.out.println(invoicetransno);
	//     String arr[]=invoicetransno.split(" ");
//	    inel=arr[3];
	   
	   // inel = invoicetransno.substring(24, 27);

	   // System.out.println(inel);
	//	GetSuccessText();
		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}
//	public String message() 
//	{
//		System.out.println("message of invoive "    +inel);	
//		return inel;
//		
//		
//	}
		public void GetSuccessText() throws IOException, HeadlessException, AWTException, InterruptedException
	{
		
	int rowcount = m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr")).size();
	System.out.println(rowcount);
	
	for(int i=1; i<rowcount; i++)
	{
		int j=i-1;
		System.out.println("Hi loop"+i);
				
		WebElement dd= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr["+ i +"]/td[5]"));

		String str =dd.getText();
		
		if(BNO.equalsIgnoreCase(str))
		{
			
			
			System.out.print("Hi Enter in if Loop");
					String st= m_Driver.findElement(By.xpath("//*[@id='ctl00_cPH_divfiltrec']/div/div/table/tbody/tr["+ i +"]/td[2]")).getText();
					Thread.sleep(1000);
					System.out.println("sdfsfd"+st);
					m_Driver.findElement(By.xpath("//a[text()='"+st+"']")).click();
					//Screenshotcapture.captureAsImage(m_Driver, BNO);
				GetScreenShot.captureAsImage(m_Driver, BNO);
			
			break;
		}
		
	}
	
	}
}