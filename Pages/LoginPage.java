package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.PageLoginClose;

public class LoginPage extends PageLoginClose{

	public LoginPage(EdgeDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using ="username")
	WebElement userName;
	public LoginPage enterUserName() {
		userName.sendKeys("DemoSalesManager");
		return this;
	}

	@FindBy(how = How.ID, using ="password")
	WebElement PassWord;
	public LoginPage enterPassword() {
		PassWord.sendKeys("crmsfa");
		return this;
	}

	@FindBy(how = How.CLASS_NAME, using ="decorativeSubmit")
	WebElement Submit;
	public HomePage clickLogin() {
		Submit.click();
		return new HomePage(driver);
	}

}
