package _6440_EmployeeNI_22_23;

import org.testng.annotations.Test;

import tests.TestBase;
import utilities.ExcelData;

public class TC486_NI_Letter_A_1256L_4Weekly_P11 extends TestBase {

	public String sTestCaseID = null;
	String[] data = null;
	String Sheet = null;
	@Test(priority=1)

	public void TC01validateNITaxNetPayGross() throws Exception {

		sTestCaseID = "TC486";
		Sheet = "Sheet6";
		data = ExcelData.toReadExcelData(sTestCaseID, Sheet);

		pages.loginpage4  loginpage = new pages.loginpage4(driver);
		loginpage.GoToUrl();	
		loginpage.AssertUrl();
		loginpage.Enter_EnterUsername(data[1]);
		loginpage.Enter_Enterpassword(data[2]);
		loginpage.Click_LoginButton();

		pages.agentpage agentpage = new pages.agentpage(driver);
		agentpage.Enter_SearchAgentName(data[3]);
		agentpage.Click_ClickSearch();
		agentpage.Click_ClickAgent();
		
		pages.OpenClient OpenClient = new pages.OpenClient(driver);
		
		
//		OpenClient.Click_ClientsClick();
//		OpenClient.Enter_EnterClientName(data[502]);
//		OpenClient.Click_ClickSearch();
//		OpenClient.Click_ClickClient();
//		
		
		OpenClient.Click_ClientsClick();
		pages.CreateClient buisness= new pages.CreateClient (driver);
		buisness.clickNewClient();
		buisness.clickLimitedCompany();
		buisness.clickMnualyLimitedCompany();
		buisness.enterBuisnessName();
		
		buisness.enterRegistrationNo();
		buisness.enterRegistrationDate(data[9]);
		buisness.enterFirstName();
		buisness.enterLastName();
		buisness.clickSaveBtn();
		
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
	
		pages.AccountingPeriodSettingBK_FAInactive Bk= new 		pages.AccountingPeriodSettingBK_FAInactive(driver);
		Bk.Click_BKEdit();
		Bk.Select_services(data[7]);
		Bk.Enter_CompanyAddressLine1(data[8]);
		Bk.Click_Save();

		Bk.Click_AccountingPeriod();
		Bk.Click_AddAccountingPeriod();
		Bk.Enter_NewStartDate(data[9]);
		Bk.Enter_NewEndDate(data[10]);
		Bk.Click_AccPeriodSave();
		OpenClient.Click_ClientsClick();
		OpenClient.Enter_EnterClientName2();
		OpenClient.Click_ClickSearch();
		OpenClient.Click_ClickClient();
		
		pages.EditCompany company= new 	pages.EditCompany(driver);
		
		company.Click_gotoEditCompany();
		company.Click_clickPayrollDetails();
		
		company.enterPayeNumber(data[11]);
		company.enterRefrenceNumber(data[12]);
		company.accountOfficeReffrence(data[13]);
		
		company.Click_ClickSave();
		company.Click_clickPayrollSettings();
		company.Enter_NomismaStartDate(data[20]);
		
		pages.FrequencySet freq = new pages.FrequencySet(driver);

		freq.Click_ClickAdditionalFrequecy();
		freq.Select_F2(data[21]);
		freq.Enter_FourWeeklyPayDate(data[20]);
		company.Click_ClickSave();
		freq.clickDeletBtn();
		pages.PayrollRun payroll= new pages.PayrollRun (driver);

		payroll.Click_PayrollDashboard();
		
		pages.EmployeeEditAndRateChanges employee= new pages.EmployeeEditAndRateChanges (driver);
		
		employee.clickNewEmployee();
		employee.enterTitle(data[22]);
		employee.enterFirstName(data[14]);
		employee.enterLastName(data[15]);
		employee.enterDateOfBirth(data[16]);
		employee.enterAddressLine(data[17]);
		employee.enterAddressLine2(data[18]);
		employee.enterPostCode(data[19]);
		employee.clickSaveBtn();
		employee.clickMandotoryPayroll();
		employee.enterJoiningDate(data[20]);

		employee.enterNICategory(data[5]);
		employee.enterTaxCode(data[6]);
		employee.clickSaveBtn();
		employee.click_Paydetails();
		employee.enterBasicSalary3(data[4]);
		employee.clickSaveBtn();
	
		payroll.Click_PayrollDashboard();

	    pages.ProcessPay page= new  pages.ProcessPay(driver);

		
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[23]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[24]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[25]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[26]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[27]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[28]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[29]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[30]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[31]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[32]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[33]);
		page.clickSaveBtn();
		payroll.Run_Payroll();
		
		page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[34]);
		page.clickSaveBtn();
		payroll.Run_Payroll();page.click3Dots();
		page.clickProcessPay();
		page.enterBasicPay(data[35]);
		page.clickSaveBtn();
		payroll.Run_Payroll();

		 
        pages.reports report= new 	pages.reports (driver);
		
		report.Click__Reports_();
		report.Click_P11();
	    _6440_Page.VerifyData verify= new  _6440_Page.VerifyData(driver);

        verify.verifyP11EarningsAtTheLELWeekly(data[71], data[72], data[73], data[74], data[75], data[76], data[77], data[78], data[79], data[80], data[81], data[82], data[83], data[84], data[85], data[86], data[87], data[88], data[89], data[90], data[91], data[92], data[93], data[94], data[95], data[96], data[97], data[98], data[99], data[100], data[101], data[102], data[103], data[104], data[105], data[106], data[107], data[108], data[109], data[110], data[111], data[112], data[113], data[114], data[115], data[116], data[117], data[118], data[119], data[120], data[121], data[122],data[123],data[124]);
        
        verify.verifyP11EarningsAboveTheLELWeekly( data[125], data[126], data[127], data[128], data[129], data[130], data[131], data[132], data[133], data[134],data[135],data[136], data[137], data[138], data[139], data[140], data[141], data[142], data[143], data[144], data[145], data[146],data[147],data[148], data[149], data[150], data[151], data[152], data[153], data[154], data[155], data[156], data[157], data[158],data[159],data[160],data[161],data[162],data[163],data[164],data[165], data[166], data[167], data[168], data[169], data[170], data[171], data[172], data[173], data[174], data[175],data[176],data[177], data[178]);
      
        verify.verifyP11EarningsAboveThePTWeekly(data[179], data[180], data[181], data[182], data[183], data[184], data[185], data[186], data[187],data[188],data[189], data[190], data[191], data[192], data[193], data[194], data[195], data[196], data[197], data[198], data[199],data[200],data[201], data[202], data[203], data[204], data[205], data[206], data[207], data[208], data[209], data[210], data[211],data[212],data[213],data[214],data[215],data[216],data[217],data[218], data[219], data[220], data[221], data[222], data[223], data[224], data[225], data[226], data[227], data[228],data[229],data[230], data[231], data[232]);
        verify.verifyP11TotalContributionsWeekly(data[233], data[234], data[235], data[236], data[237], data[238], data[239], data[240],data[241],data[242], data[243], data[244], data[245], data[246], data[247], data[248], data[249], data[250], data[251], data[252],data[253], data[254], data[255], data[256], data[257], data[258], data[259], data[260], data[261], data[262], data[263],data[264],data[265],data[266],data[267],data[268],data[269],data[270],data[271], data[272], data[273], data[274], data[275], data[276], data[277], data[278], data[279], data[280],data[281],data[282], data[283], data[284], data[285], data[286]);
        
        
        verify.verifyP11EmployeeContributionsWeekly( data[287], data[288], data[289], data[290], data[291], data[292],data[293],data[294], data[295], data[296], data[297], data[298], data[299], data[300], data[301], data[302], data[303], data[304],data[305],data[306], data[307], data[308], data[309], data[310], data[311], data[312], data[313], data[314], data[315], data[316],data[317],data[318],data[319],data[320],data[321],data[322],data[323],data[324], data[325], data[326], data[327], data[328], data[329], data[330], data[331], data[332], data[333],data[334],data[335], data[336], data[337], data[338], data[339], data[340]);
        verify.verifyP11TotalPayToDateWeekly(data[341], data[342], data[343], data[344], data[345], data[346], data[347], data[348], data[349], data[350], data[351], data[352], data[353], data[354], data[355], data[356], data[357], data[358], data[359], data[360], data[361], data[362], data[363], data[364], data[365],  data[366], data[367], data[368], data[369], data[370],data[371],data[372],data[373],data[374],data[375],data[376],data[377],data[378],data[379],data[380],data[381],data[382],data[383],data[384],data[385],data[386],data[387],data[388],data[389],data[390],data[391],data[392],data[393]);
        verify.verifyP11TotalTaxablePayToDateWeekly(data[394],data[395],data[396],data[397],data[398],data[399],data[400], data[401], data[402], data[403], data[404], data[405], data[406], data[407], data[408], data[409], data[410], data[411], data[412], data[413], data[414], data[415], data[416], data[417], data[418], data[419], data[420], data[421],data[422],data[423], data[424], data[425], data[426], data[427], data[428], data[429], data[430], data[431], data[432], data[433], data[434], data[435], data[436], data[437], data[438], data[439], data[440], data[441], data[442], data[443], data[444], data[445], data[446]);
        verify.verifyP11TotalTaxDueTodateWeekly( data[447], data[448], data[449], data[450], data[451], data[452], data[453], data[454],data[455], data[456], data[457], data[458], data[459], data[460], data[461], data[462], data[463], data[464], data[465], data[466], data[467], data[468], data[469], data[470], data[471], data[472], data[473], data[474], data[475], data[476], data[477], data[478], data[479],data[480],data[481],data[482],data[483],data[484],data[485],data[486],data[487],data[488],data[489],data[490],data[491],data[492],data[493],data[494],data[495],data[496],data[497],data[498],data[499],data[500],data[501]);

	    verify.assertAll();
	
	
	
}	
			
	
}
