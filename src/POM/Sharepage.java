package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sharepage 
{
	@FindBy(id="swfRecTextarea")
	private WebElement emailadd;
	
	@FindBy(id="swfSubmitButton-announce")
	private WebElement submitbtn;
	@FindBy(xpath="//div[@id='a-popover-4']/div/div/button")
	private WebElement closebtn;
	
	public Sharepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void emailaddress(String add)
	{
		emailadd.sendKeys(add);
	}
	public void share()
	{
		submitbtn.click();
	}
	public void closebutton()
	{
		closebtn.click();
	}
}
