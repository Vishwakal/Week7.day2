package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.PageLoginClose;

public class EditPage  extends PageLoginClose{

	public EditPage(EdgeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID, using ="updateLeadForm_companyName")
	WebElement updateCompanyName;
	public EditPage updateCompanyName() {
		updateCompanyName.sendKeys("TCS");
		return this;
	}
	@FindBy(how = How.NAME, using ="submitButton")
	WebElement SubmitB;
	public EditPage clickSubmitButton() {
		SubmitB.click();
		return this;
	}

}
