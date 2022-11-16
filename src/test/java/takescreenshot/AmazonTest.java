package takescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	WebDriver driver;

	@Before
	public void launchApp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();

	}
    @After
	public void closeApp() {
		driver.close();
	}
    @Test
	public void searchTest() throws InterruptedException, IOException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14" + Keys.ENTER);

		// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14" );

		// driver.findElement(By.id("nav-search-submit-button")).click();

		Thread.sleep(5000);

		// capture a screenshot

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // captured a screenshot

		File target = new File("./screenshots/AmazonTest.png");

		FileUtils.copyFile(screenshotFile, target);
	}
}
