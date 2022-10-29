package Pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.PageLoginClose;

public class MergeLeadPage extends PageLoginClose {

	Set<String> allWindows = null;
	List<String> allhandles = null;
	String leadId=null;
	Set<String> allWindows2 = null;
	List<String> allhandles2 = null;

	public  MergeLeadPage(EdgeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using ="//img[@alt='Lookup']")
	WebElement clickFromL;
	public FindLeadFramePage clickFromLead() {
		clickFromL.click();
		return new FindLeadFramePage(driver);
	}

	public MergeLeadPage SwitchFindLeadToMergeLead() {
		driver.switchTo().window(allhandles.get(0));
		return this;
	}
	@FindBy(how = How.XPATH, using ="(//img[@alt='Lookup'])[2]")
	WebElement clickToL;
	public FindLeadFramePage clickToLead() {
		clickToL.click();
		return new FindLeadFramePage(driver);

	}
	@FindBy(how = How.XPATH, using ="//a[text()='Merge']")
	WebElement climerge;
	public viewLeadPage clickMerge() {
		climerge.click();
		driver.switchTo().alert().accept();
		return new viewLeadPage(driver);
	}
}
