package TeastCase;

import org.testng.annotations.Test;

import BaseClass.PageLoginClose;
import Pages.LoginPage;

public class MergeCreateLead extends PageLoginClose{
	
	@Test
	public void runMerge() throws InterruptedException {
		
		new LoginPage(driver).enterUserName().enterPassword().clickLogin().clickCrmsfa().clickLeads().clickMergeLead()
		.switchtoFromLeadpage().enterFromFirstName().clickFrameFindLead().getFirstLeadId()
		.clickFirstLeadIdinFrame().SwitchFindLeadToMergeLead()
		.clickToLead().enterFromFirstName().clickFrameFindLead().clickFirstLeadIdinFrame()
		.clickMerge().clickFindLEad().enterLeadId().searchFindLead().verifyMergeLead();
		
	
	}

}
