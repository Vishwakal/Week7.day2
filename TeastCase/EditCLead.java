package TeastCase;

import org.testng.annotations.Test;

import BaseClass.PageLoginClose;
import Pages.HomePage;
import Pages.LoginPage;

public class EditCLead extends PageLoginClose{
	
	@Test
	public void Run2() throws InterruptedException {
		
		new LoginPage(driver).enterUserName().enterPassword().clickLogin().clickCrmsfa().clickLeads()
		.clickFindLead().clickPhonetab().enterPhoneNumber().searchFindLead().clickFirsLeadId().clickEdit().updateCompanyName().clickSubmitButton();
	}

}
