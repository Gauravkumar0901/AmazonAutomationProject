package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Youraccount 
{
	@FindBy(xpath="(//div[@class='a-box-inner'])[4]")
	private WebElement youraddress;
	@FindBy(xpath="(//div[@class='a-box-inner'])[1]")
	private WebElement yourorders;
	
	public Youraccount(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickyourorders()
	{
		yourorders.click();
	}
	public void clickyouraddress()
	{
		youraddress.click();
	}
}
