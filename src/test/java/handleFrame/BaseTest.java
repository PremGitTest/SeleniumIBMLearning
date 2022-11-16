package handleFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.junit.After;
//import org.junit.Before;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver  driver;
	
	
	@BeforeTest
	public void launchApp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();

	}
    @AfterTest
	public void closeApp() {
		driver.close();
		
    }
    
    
    
    
    //ctrl+shift+O

}
