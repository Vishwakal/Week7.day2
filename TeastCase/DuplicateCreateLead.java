package TeastCase;

import org.testng.annotations.Test;

import BaseClass.PageLoginClose;
import Pages.LoginPage;

public class DuplicateCreateLead extends PageLoginClose {
	
	@Test
	public void runDuplicate() throws InterruptedException {
		new LoginPage(driver).enterUserName().enterPassword().clickLogin().clickCrmsfa().clickLeads().clickFindLead()
		.clickPhonetab().enterPhoneNumber().searchFindLead().clickFirsLeadId().clickDuplicateLead().clickFinish();
		
	}

}
