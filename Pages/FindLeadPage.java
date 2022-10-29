package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.PageLoginClose;

public class FindLeadPage extends PageLoginClose {

	public FindLeadPage(EdgeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using ="//span[text()='Phone']")
	WebElement ClickPhoneT;
	public FindLeadPage clickPhonetab() {
		ClickPhoneT.click();
		return this;	
	}
	@FindBy(how = How.XPATH, using ="//input[@name='phoneNumber']")
	WebElement EnterPhoneN;
	public FindLeadPage enterPhoneNumber() {
		EnterPhoneN.sendKeys("9");
		return this;
	}
	@FindBy(how = How.XPATH, using ="//input[@name='id']")
	WebElement EnterLeadId;
	public FindLeadPage enterLeadId() {
		EnterLeadId.sendKeys(FindLeadFramePage.leadId);
		return this;
	}
	@FindBy(how = How.XPATH, using ="//button[text()='Find Leads']")
	WebElement SearchFindL;
	public FindLeadPage searchFindLead() throws InterruptedException {
		SearchFindL.click();
		Thread.sleep(2000);
		return this ;
	}
	@FindBy(how = How.XPATH, using ="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement ClickFirstLeadI;
	public viewLeadPage clickFirsLeadId() {
		ClickFirstLeadI.click();
		return new viewLeadPage(driver);
	}

	public FindLeadPage verifyMergeLead() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
			return this;
		} else {
			System.out.println("Text not matched");
			return this;
		}



	}
}


