package handleFrame;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PayTM_Frame extends BaseTest {

	@Test

	public void verifyFrame() throws Exception {

		Thread.sleep(3000);

		// click on Sign-In

		driver.findElement(By.xpath("//div[@class='IA_rP']")).click();

		Thread.sleep(3000);

		// Frame - handling

		// driver.switchTo()

		// Index --- start from 0

		// Name/ID

		// WebElement

		// driver.switchTo().frame(0);

		// driver.switchTo().frame("packageFrame");

		WebElement myFrame = driver.findElement(By.xpath("//iframe[contains(@src,'login')]"));

		driver.switchTo().frame(myFrame);

		// validation step

		//String actualHeading = driver.findElement(By.cssSelector(".heading")).getText();

		//System.out.println(actualHeading);

		//Assert.assertTrue(actualHeading.contains("Paytm Web account"));

		// perform action on Watch Video

		driver.findElement(By.xpath("//span[contains(text(),'Watch')]")).click();
		System.out.println("The click on demo video was successful.");

	}
}
