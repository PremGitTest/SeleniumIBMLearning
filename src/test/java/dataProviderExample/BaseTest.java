package dataProviderExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
//import utility.ConfigRead;
//import utility.ConfigRead;
//import utility.ConfigRead;

public class BaseTest {

	public WebDriver driver;

	//public ConfigRead conf;

	Logger log;

	@BeforeTest

	public void launchApp() throws Exception {

		// log file

		log = Logger.getLogger("NOP Comm Login Module");

		PropertyConfigurator.configure(".\\TestData\\log4j.properties");

		// Create an Object Config

		//conf = new ConfigRead();

		log.info("launching chrome browser.");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		//log.info("launching application: " + conf.getNOPComm());

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

	}

	@AfterTest

	public void closingApp() throws Exception {

		Thread.sleep(5000);

		driver.close();

		log.info("chrome browser closed.");

	}

}
