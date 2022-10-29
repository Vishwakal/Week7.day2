package TeastCase;

import org.testng.annotations.Test;

import BaseClass.PageLoginClose;
import Pages.LoginPage;

public class DeleteCreateLead extends PageLoginClose {
	
	@Test
	public void runDeleteLead() throws InterruptedException {
		
		new LoginPage(driver).enterUserName().enterPassword().clickLogin().clickCrmsfa().clickLeads().clickFindLead().clickPhonetab()
		.enterPhoneNumber().searchFindLead().clickFirsLeadId().clickDelete();		
	}

}
