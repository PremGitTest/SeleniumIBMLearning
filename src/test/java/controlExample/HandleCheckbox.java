package controlExample;

import org.junit.Test;
import org.openqa.selenium.By;

public class HandleCheckbox extends BaseLaunchTest{
	
    @Test
	public void testcase()
	{
    	
		System.out.println("Testing application");
		
		driver.findElement(By.xpath("//input[@name='vehicle']")).click();
		driver.findElement(By.xpath("//input[@name='gender']")).click();
	}
}
