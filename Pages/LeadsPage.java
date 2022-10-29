package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.PageLoginClose;

public class LeadsPage extends PageLoginClose {

	public LeadsPage(EdgeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using ="Create Lead")
	WebElement ClickCreateLead;
	public CreateLead clickCreateLead() {
		ClickCreateLead.click();
		return new CreateLead(driver);
	}
	@FindBy(how = How.LINK_TEXT, using ="Find Leads")
	WebElement ClickFindLead;
	public FindLeadPage clickFindLead() {
		ClickFindLead.click();
		return new FindLeadPage(driver);

	}
	@FindBy(how = How.LINK_TEXT, using ="Merge Leads")
	WebElement ClickMergeLead;
	public FindLeadFramePage clickMergeLead() {
		ClickMergeLead.click();
		return new FindLeadFramePage(driver);


	}




}
