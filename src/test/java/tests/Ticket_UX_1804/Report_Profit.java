package tests.Ticket_UX_1804;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/8bb9bbb0-21ed-4de3-ab3f-9251da49a08e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1502, profileId = 101430)
public class Report_Profit extends TestBase
{
    
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
    
    @Test  (groups= {"Banking_DS","Banking_DS - bank_DS"})
    @TestModellerPath(guid = "794ef739-6b41-4c2a-a5a8-8ad439fa26eb")
    public void GoToUrlClickPrRptsmenuClickProfitLossrptPositiveSelectFilterDateRangePositiveEnterFilterDateFro() throws InvalidFormatException, InterruptedException, IOException
    {

    	sTestCaseID="Report_Profit _after_ Tax";
    			
       	Sheet="UX1804";
        data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
        pages.nlogin _nlogin = new pages.nlogin(driver);
        
        //pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
//    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//    _AgentSearch.GoToUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    
    
    pages.UX1804.addashboard_Report _addashboard = new  pages.UX1804.addashboard_Report(driver);
//    TestModellerLogger.SetLastNodeGuid("7c25a927-642d-48d6-9ed3-d98b33a4ba4b");
//    _addashboard.GoToUrl();
    

   TestModellerLogger.SetLastNodeGuid("e98ed820-abd6-4bc3-89c7-2adc5dfa8ad2");
    _addashboard.Select_ctl00ddlFinancialYear(data[5]);

    

    TestModellerLogger.SetLastNodeGuid("e25c38ee-e9be-4654-bb3a-36e82a04bba1");
    _addashboard.Select_reports_dash(data[5]);
    
        pages.UX1804.TY_Report_profit _TY = new pages.UX1804.TY_Report_profit(driver);
//    TestModellerLogger.SetLastNodeGuid("65daf69c-7fc2-4efb-a9dc-0165e9517ec6");
//    _TY.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9eb8215c-73da-4737-a5c5-17ab6a6ec7f9");
    _TY.Click_Pr_Rptsmenu();
    

    TestModellerLogger.SetLastNodeGuid("30508eec-47fd-4a98-b943-18e6938ace60");
    _TY.Click_Profit_Lossrpt();
    

    TestModellerLogger.SetLastNodeGuid("c2edbabf-2a34-4e2f-9bd6-bca498a73011");
    _TY.Select_Filter_DateRange(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("3f4c0c6d-db39-413a-a5fd-6da53205c593");
    _TY.Enter_Filter_DateFrom(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("6ce86227-5b94-4f41-9970-f3f8012d4d2c");
    _TY.Enter_Filter_ToDate(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("1ea54d04-840b-4d3d-af3c-b1193fc7a972");
    _TY.Click_PR_Update_CLICK();
    

//    TestModellerLogger.SetLastNodeGuid("fb6e42ea-32fb-4897-ace0-ee2f74531a5e");
//    _TY.Click_Turnover_amt();
    

//    TestModellerLogger.SetLastNodeGuid("d6b19a22-d959-4eaf-918c-732fd738047b");
//    _TY.Click_verificationamt();
    

    }
}
