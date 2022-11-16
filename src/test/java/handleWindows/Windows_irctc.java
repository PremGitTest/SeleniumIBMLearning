package handleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows_irctc {

	public WebDriver driver;

	@Test

	public void verifyWindow() throws Exception {

		String parentWindow = driver.getWindowHandle();

		System.out.println("mainWindow: " + parentWindow);

		// handle model - swicthing not required

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='OK']")).click();

		Thread.sleep(3000);

		// handle windows

		// click on Hotel link/Tab

		Thread.sleep(4000);

		driver.findElement(By.linkText("HOTELS")).click();

		Set<String> allwindow = driver.getWindowHandles(); // multiple windows

		System.out.println("windows count: " + allwindow.size());

		String mainWindow = (String) allwindow.toArray()[0];

		String hotelWindow = (String) allwindow.toArray()[1];

		System.out.println("mainWindow: " + mainWindow);

		System.out.println("hotelWindow: " + hotelWindow);

		System.out.println("===================================================================");

		// Switch To Hotel Window

		Thread.sleep(4000);

		driver.switchTo().window(hotelWindow);

		driver.findElement(By.linkText("Login")).click();

		// Switch To Main Window

		Thread.sleep(4000);

		driver.switchTo().window(mainWindow);
		
		WebDriverWait wait = new WebDriverWait(driver, 60); // max time

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("CONTACT US")));

		driver.findElement(By.linkText("CONTACT US")).click();

		// Switch To Hotel Window

		Thread.sleep(4000);

		driver.switchTo().window(hotelWindow);

		driver.findElement(By.xpath("//button[text()='Login']")).click();

		Thread.sleep(4000);

	}

	@BeforeTest

	public void launchApp() {

		System.out.println("launching .....");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.irctc.co.in/nget/train-search");

	}

	@AfterTest

	public void closingApp() throws Exception {

		Thread.sleep(5000);

		// driver.close();

		driver.quit();

		System.out.println("closing....");

	}

}
