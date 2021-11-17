package tests.Bank_Multicurrency;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/9986eabb-c6f1-4f08-b170-442969ab8277
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1799, profileId = 100636)
public class addnewbank_DefaultProfile extends TestBase
{
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;

    
    @Test  (groups= {"addnewbank","addnewbank - Default Profile"})
    @TestModellerPath(guid = "5b50ce19-31ea-478a-a89c-7f65ae88bd6d")
    public void v() throws InvalidFormatException, InterruptedException
    {
        
    	sTestCaseID="TC10";
    	Sheet="sm457";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	 
    	
    	  pages.nlogin _nlogin = new pages.nlogin(driver);
    	
    	    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    	    _nlogin.GoToUrl();
    	    
//
//   	    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//   	    _nlogin.as
    	    

    	    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    	    _nlogin.Enter_nLOGIN(data[1]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    	    _nlogin.Enter_nPASS(data[2]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    	    _nlogin.Click_Login();
    	    

    	pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
//    	    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//    	    _AgentSearch.GoToUrl();
//    	    

//    	    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    	    _AgentSearch.AssertUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    	    _AgentSearch.Click_Agents();
    	    

    	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    	    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
    	//    
//    	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
//    	    _AgentSearch.Select_status_dropdown("Show All");
    	//    
//    	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
//    	    _AgentSearch.Select_status_dropdown("Show All");
    	//    
    	    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    	    _AgentSearch.Click_Search();
    	    

    	    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    	    _AgentSearch.Click__Nidhi1_();
    	    

    	pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    	    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    	    _Searchclient.GoToUrl();
    	    

//    	    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    	    _Searchclient.AssertUrl();
    	//    

    	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	    _Searchclient.Click__Clients_();
    	    

    	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	    _Searchclient.Click_Searchbtn();
    	    

    	    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    	    _Searchclient.Click__NidhiEnt();
    	    

    	pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    	   

    	  TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    	   _bankmenu.Click_Bankingmenu();
    	   

    	   TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    	   _bankmenu.Click_Newmenu();
    	   
        pages.newbank _newbank = new pages.newbank(driver);
    TestModellerLogger.SetLastNodeGuid("8c9772c6-f910-466f-91c1-0f3f1f44a129");
    _newbank.Click_New_Bank_Account();
    

    TestModellerLogger.SetLastNodeGuid("eb731771-a9c1-4922-be82-2b7083d18d68");
    _newbank.Select_BankMaster(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("256855c4-ee7f-48f5-a3ee-fc3c97e3f433");
    _newbank.Enter_BankAccountName(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("b3bcaecb-9a61-4428-a385-023f8d089880");
    _newbank.Select_AccType(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("0061aa11-eb42-4fce-9a12-0ca153b2c542");
    _newbank.Enter_AccNo(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("8fad3dc0-f092-4b6d-b67f-93b63fdf5ef1");
    _newbank.Enter_SortCode(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("8125f1dc-1cfc-4a6c-ae42-3df8f48ebb9e");
    _newbank.Enter_Address("adress1");
    

    TestModellerLogger.SetLastNodeGuid("f3480a75-5ddf-4ac7-ab0d-395655678271");
    _newbank.Select_Currency(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("dca5fd30-2442-4cec-aa56-460f1a4ecf01");
    _newbank.Click_Save();
    

    }
}
/*

    @Test  (groups= {"addnewbank","addnewbank - Default Profile"})
    @TestModellerPath(guid = "cf924fce-45a5-427f-93e7-a720beff5f69")
    public void ClickNewBankAccountPositiveSelectBankMasterPositiveEnterBankAccountNamePositiveSelectAccTypePos1()
    {
        
        pages.newbank _newbank = new pages.newbank(driver);
    TestModellerLogger.SetLastNodeGuid("8c9772c6-f910-466f-91c1-0f3f1f44a129");
    _newbank.Click_New_Bank_Account();
    

    TestModellerLogger.SetLastNodeGuid("eb731771-a9c1-4922-be82-2b7083d18d68");
    _newbank.Select_BankMaster("Citi bank");
    

    TestModellerLogger.SetLastNodeGuid("256855c4-ee7f-48f5-a3ee-fc3c97e3f433");
    _newbank.Enter_BankAccountName("minima");
    

    TestModellerLogger.SetLastNodeGuid("b3bcaecb-9a61-4428-a385-023f8d089880");
    _newbank.Select_AccType("Savings");
    

    TestModellerLogger.SetLastNodeGuid("0061aa11-eb42-4fce-9a12-0ca153b2c542");
    _newbank.Enter_AccNo("");
    

    TestModellerLogger.SetLastNodeGuid("8fad3dc0-f092-4b6d-b67f-93b63fdf5ef1");
    _newbank.Enter_SortCode("");
    

    TestModellerLogger.SetLastNodeGuid("8125f1dc-1cfc-4a6c-ae42-3df8f48ebb9e");
    _newbank.Enter_Address("0912 Karianne Union, East Jettieshire, Togo");
    

    TestModellerLogger.SetLastNodeGuid("f3480a75-5ddf-4ac7-ab0d-395655678271");
    _newbank.Select_Currency("United States Dollar");
    

    TestModellerLogger.SetLastNodeGuid("dca5fd30-2442-4cec-aa56-460f1a4ecf01");
    _newbank.Click_Save();
    

    }

}*/