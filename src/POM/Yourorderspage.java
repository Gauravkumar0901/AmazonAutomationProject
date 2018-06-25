package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yourorderspage 
{
	@FindBy(id="Write-a-product-review_1")
	private WebElement writereviewbtn;
	
	public Yourorderspage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void writereview()
	{
		writereviewbtn.click();
	}
}
