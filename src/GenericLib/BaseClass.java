package GenericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


public class BaseClass extends BAseTest {
public void Elementpresent(WebElement Element)
{
	try
	{
		WebDriverWait  wait=new WebDriverWait(driver,10);
	
		wait.until(ExpectedConditions.visibilityOf(Element));
		Reporter.log("Element present",true);
	}
	catch(Exception e)
	{
		Reporter.log("Element not present",true);
		Assert.fail();
	}
	
}
public void verifytitle(String Etitle)
{
	
	try
	{
		//WebDriverWait  wait=new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.titleContains(Etitle));
		//wait.until(ExpectedConditions.titleContains(title))
		Assert.assertTrue(driver.getTitle().contains(Etitle));
		Reporter.log("Pass:page is display",true);
		
	}
	catch(Exception e)
	{
		Reporter.log("Fail:Page is not display",true);
		Assert.fail();
	}
	
}
public void pageverify(String Etitle)
{
	String S= driver.getTitle();
	System.out.println(S);
	if(S.equalsIgnoreCase(Etitle))
		System.out.println("Title Matched");
		else
		System.out.println("Title didn't match");
}
}
