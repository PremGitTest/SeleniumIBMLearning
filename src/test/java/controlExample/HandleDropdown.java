package controlExample;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown extends BaseLaunchTest
{

	@Test
	public void multipleselect1() throws InterruptedException
	{
		
		
		
		WebElement list = driver.findElement(By.cssSelector("select[name='FromLB']"));
		Select sel = new Select(list);
		System.out.println("isMultiple options enabled or not: "+ sel.isMultiple());
		sel.selectByIndex(0);
		Thread.sleep(3000);
		sel.selectByIndex(1);
		Thread.sleep(3000);
		sel.selectByVisibleText("Germany");
		Thread.sleep(4000);
		sel.deselectAll();
		sel.selectByIndex(4);
		Thread.sleep(3000);
		sel.selectByIndex(5);
WebElement list2 = driver.findElement(By.tagName("select"));

        

        

        Select sel2 = new Select(list2);

        

        System.out.println("is multiple selectionare enabled or not: " + sel2.isMultiple());

        Assert.assertFalse(sel2.isMultiple());   //false

        

        Thread.sleep(2000);

        sel2.selectByIndex(1);               //Saab

        

        Thread.sleep(2000);

        sel2.selectByValue("Singapore");     //Opel

        

        Thread.sleep(2000);

        sel2.selectByVisibleText("Toyota");  //Toyota
		
	}
}
