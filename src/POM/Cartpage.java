package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage 
{
	@FindBy(id="a-autoid-0-announce")
	private WebElement quantitybtn;
	@FindBy(id="dropdown1_6")
	private WebElement value;
	@FindBy(id="dropdown2_1")
	private WebElement selectqty;
	//@FindBy(name="submit.save-for-later.C58406baf-7400-4309-b23b-c26b9ea3c956")
	@FindBy(xpath="//span[@class='a-size-small sc-action-save-for-later']")
	private WebElement saveforlaterbtn;
	@FindBy(name="submit.delete.C58406baf-7400-4309-b23b-c26b9ea3c956")
	private WebElement deletebtn;
	@FindBy(name="proceedToCheckout")
	private WebElement checkoutbtn;
	
	@FindBy(xpath="(//input[@value='Delete'])[1]")
	private WebElement Dltbtnfromcart;
	
	public Cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void quantity()
	{
		quantitybtn.click();
	}
	public void noofqnty()
	{
		selectqty.click();
	}
	public void saveforlater()
	{
		saveforlaterbtn.click();
	}
	public void delete()
	{
		deletebtn.click();
	}
	public void deletefromcart()
	{
		Dltbtnfromcart.click();
	}
	
	public void checkout()
	{
		checkoutbtn.click();
	}
	public void number()
	{
		value.click();
	}
}
