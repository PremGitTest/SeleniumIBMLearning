package handleFrame2;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Select_Action extends BaseTest {

	@Test
	public void verifyFrame() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//a[text()='Actions'and @target=\"classFrame\"")).click();
		Thread.sleep(3000);
		System.out.println("Window title is : "+driver.getTitle());
	}
}
