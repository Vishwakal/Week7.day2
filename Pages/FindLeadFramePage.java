package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.PageLoginClose;

public class FindLeadFramePage extends PageLoginClose {

	Set<String> allWindows = null;
	List<String> allhandles = null;
	static String leadId=null;
	Set<String> allWindows2 = null;
	List<String> allhandles2 = null;

	public  FindLeadFramePage(EdgeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public FindLeadFramePage switchtoFromLeadpage() {
		allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return this;

	}
	@FindBy(how = How.XPATH, using ="//input[@name='firstName']")
	WebElement FirstName;
	public FindLeadFramePage enterFromFirstName() {
		FirstName.sendKeys("gopi");
		return this;
	}
	@FindBy(how = How.XPATH, using ="//input[@name='firstName']")
	WebElement ToFirsrtName;
	public FindLeadFramePage enterToFirstName() {
		ToFirsrtName.sendKeys("babu");
		return this;
	}
	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	WebElement ClickFrameFindLead;
	public FindLeadFramePage clickFrameFindLead() throws InterruptedException {
		ClickFrameFindLead.click();
		Thread.sleep(1000);
		return this;
	}
	@FindBy(how = How.XPATH, using ="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement getFirstLI;
	public FindLeadFramePage getFirstLeadId() {
		getFirstLI.getText();
		return this;
	}
	@FindBy(how = How.XPATH, using ="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement clickFLIF;
	public MergeLeadPage clickFirstLeadIdinFrame() {
		clickFLIF.click();
		return new MergeLeadPage(driver);
	}


}
