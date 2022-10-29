package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.PageLoginClose;

public class DuplicateLeadPage extends PageLoginClose {
	
	public DuplicateLeadPage(EdgeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(how = How.LINK_TEXT, using ="Duplicate Lead")
	WebElement clickDuplicateLead;
	public CreateLead clickDuplicateLead() {
		clickDuplicateLead.click();
		return new CreateLead(driver);
	}

}
