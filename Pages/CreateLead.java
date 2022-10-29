package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.PageLoginClose;

public class CreateLead extends PageLoginClose{

	public CreateLead(EdgeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using ="createLeadForm_companyName")
	WebElement EntercompanyName;
	public CreateLead enterCompanyName() {
		EntercompanyName.sendKeys("TestLeaf");
		return this;

	}
	@FindBy(how = How.ID, using ="createLeadForm_firstName")
	WebElement EnterFirstName;
	public CreateLead enterFirstName() {
		EnterFirstName.sendKeys("Hari");
		return this;
	}
	@FindBy(how = How.ID, using ="createLeadForm_lastName")
	WebElement EnterLastName;
	public CreateLead enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		return this;
	}
	@FindBy(how = How.NAME, using ="submitButton")
	WebElement ClickSubmit;
	public CreateLead clickFinish() {
		ClickSubmit.click();
		return this;
	}
}
