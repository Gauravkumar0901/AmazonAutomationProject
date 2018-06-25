package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addresspage 
{
	@FindBy(xpath="//h2[text()='Add address']")
	private WebElement addaddressbtn;
	
	public Addresspage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void addaddress()
	{
		addaddressbtn.click();
	}
	
}
