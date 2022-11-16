package dragAndDropElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public WebDriver driver;
	@BeforeTest
	public void launchApp() {

		System.out.println("launching .....");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@AfterTest

	public void closingApp() throws Exception {

		Thread.sleep(7000);

		driver.close();

		System.out.println("closing....");

	}

	@Test

	public void drapanddrop() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 60); // max time

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[contains(@data-src,'photo')]")));
		WebElement dragdropFrame = driver.findElement(By.xpath("//iframe[contains(@data-src,'photo')]"));
		driver.switchTo().frame(dragdropFrame);
		//Method1
		WebElement img1 =  driver.findElement(By.xpath("//img[contains(@src,'tatras3')]"));
		WebElement img2 =  driver.findElement(By.xpath("//img[contains(@src,'tatras4')]"));
		WebElement trash =  driver.findElement(By.cssSelector("div#trash"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(img1, trash).perform();
		//Method2
		act.clickAndHold(img2).moveToElement(trash).release().build().perform();
	}
		
		

}
