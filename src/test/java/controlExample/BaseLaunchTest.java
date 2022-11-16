package controlExample;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLaunchTest {
	WebDriver driver;

	@Before
	public void launchApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Launching application");
		ConfigReadControl config = new ConfigReadControl();
		String ControlURL = config.getBrowser();
		driver.get(ControlURL);

	}

	@After
	public void ClosingApp() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		System.out.println("Closing application");
	}
}
