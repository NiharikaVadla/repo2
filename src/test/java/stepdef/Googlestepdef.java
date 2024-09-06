package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.*;

public class Googlestepdef {
	public WebDriver driver;
	public String actT;
	public String expT;
	@Given("Open the Google application")
	public void open_the_google_application() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	   
	}

	@When("User capturescurrent page title")
	public void user_capturescurrent_page_title() {
		String expT = "Google";
		String actT = driver.getTitle();
	    
	}

	@Then("Title should match")
	public void title_should_match() {
	//Assert.assertTrue(actT.contains("Google"),"Title is matched");
	  Assert.assertEquals(expT,actT);
	  Reporter.log("Title is matchedTCis passed",true);
	}



}
