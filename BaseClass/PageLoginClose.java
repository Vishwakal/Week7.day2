package BaseClass;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoginClose {
	
	Set<String> allWindows = null;
	List<String> allhandles = null;
	String leadId=null;
	Set<String> allWindows2 = null;
	List<String> allhandles2 = null;


	public EdgeDriver driver;

	@BeforeMethod
	public void preCondition(){
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		

	}

	@AfterMethod
	public void postCondition(){
		driver.close();
	}


}
