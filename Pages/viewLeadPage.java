package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.PageLoginClose;

public class viewLeadPage extends PageLoginClose {

	public viewLeadPage(EdgeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.LINK_TEXT, using ="Edit")
	WebElement ClickEdit;
	public EditPage clickEdit() {
		ClickEdit.click();
		return new EditPage(driver);
	}

	@FindBy(how = How.LINK_TEXT, using ="Merge Leads")
	WebElement ClickMergeL;
	public FindLeadFramePage clickMergeLead() {
		ClickMergeL.click();
		return new FindLeadFramePage(driver);
	}
	@FindBy(how = How.LINK_TEXT, using ="Find Leads")
	WebElement ClickFindL;
	public FindLeadPage clickFindLEad() {
		ClickFindL.click();
		return new FindLeadPage(driver);
	}
	@FindBy(how = How.LINK_TEXT, using ="Duplicate Lead")
	WebElement ClickDuplicateL;
	public CreateLead clickDuplicateLead() {
		ClickDuplicateL.click();
		return new CreateLead(driver);
	}
	@FindBys(
			{
			@FindBy(how = How.LINK_TEXT, using ="Delete"),
			@FindBy(how = How.CLASS_NAME, using ="subMenuButtonDangerous")
			}
			)
	WebElement ClickDelete;
	public viewLeadPage clickDelete() {
		ClickDelete.findElement(By.linkText("Delete")).click();
		return this;
	}
}
