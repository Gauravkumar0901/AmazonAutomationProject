package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rechargepage 
{
	@FindBy(id="mobileNumberTextInputId")
	private WebElement mobnotb;
	@FindBy(id="operatorAndCircleTextInputId")
	private WebElement operatortb;
	
	public Rechargepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void phoneno(String no)
	{
		mobnotb.sendKeys(no);
	}
	public void network()
	{
		operatortb.click();
	}
}
