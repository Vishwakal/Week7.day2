package TeastCase;

import org.testng.annotations.Test;

import BaseClass.PageLoginClose;
import Pages.LoginPage;

public class TestCaseCreateLead extends PageLoginClose{
	
	@Test
	public void runTestcase() {
		
		new LoginPage(driver).enterUserName().enterPassword().clickLogin()
		.clickCrmsfa().clickLeads().clickCreateLead().enterCompanyName()
		.enterFirstName().enterLastName().clickFinish();;
 
}
}

