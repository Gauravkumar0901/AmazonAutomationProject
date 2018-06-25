package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addressatcart 
{
	@FindBy(xpath="(//a[@data-action='page-spinner-show'])[1]")
	//@FindBy(xpath="//div[@id='reviewSection2']/div/div/div/div[2]/div[2]/div[2]/div/div[4]")
	private WebElement deliverbtn;
	
	public Addressatcart(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void deliveraddress()
	{
		deliverbtn.click();
	}
}
