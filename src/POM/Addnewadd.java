package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class Addnewadd 
{
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	private WebElement name;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	private WebElement num;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	private WebElement pin;
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	private WebElement add1;
	//@FindBy(id="address-ui-widgets-enterAddressLine2")
	//private WebElement add2;
	@FindBy(id="address-ui-widgets-enterAddressCity")
	private WebElement citytb;
	@FindBy(xpath="(//span[@data-action='a-dropdown-button'])[2]")
	private WebElement statedd;
	@FindBy(xpath="//input[@class='a-button-input']")
	private WebElement addbtn;
	@FindBy(xpath="//h4[@class='a-alert-heading']")
	private WebElement fatchaddaddress;
	
	
	public Addnewadd(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void verifyaddress()
	{
		String s=fatchaddaddress.getText();
		//SoftAssert a= new SoftAssert();
	   // a.assertEquals(s, "Address saved");
	   // a.assertAll();
		if(s.contains("Address saved"))
		{
			System.out.println("Verify Page:Address Saved");
		}
		else
		{
			System.out.println("Not verify:Address not saved");
		}
	}
	
	
	public void fullname(String me)
	{
		name.sendKeys(me);
	}
	public void mobno(String mob)
	{
		num.sendKeys(mob);
	}
	public void pincode(String code)
	{
		pin.sendKeys(code);
	}
	public void address(String add)
	{
		add1.sendKeys(add);
	}
	public void city(String region)
	{
		citytb.sendKeys(region);
	}
	public void state()
	{
		Select s=new Select(statedd);
		s.selectByIndex(5);
	}
	public void addaddress()
	{
		addbtn.click();
	}
}
