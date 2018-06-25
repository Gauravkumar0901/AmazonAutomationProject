package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.BaseClass;

public class Homepage extends BaseClass
{
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbox;
	
	@FindBy(id="nav-cart")
	private WebElement cartbtn;
	
	@FindBy(xpath="(//input[@class='nav-input'])[1]")
	private WebElement searchbtn;
	
	@FindBy(id="nav-link-yourAccount")
	private WebElement signinbtn;
	
	@FindBy(id="nav-link-wishlist")
	private WebElement lists;
	
	@FindBy(linkText="Amazon Pay")
	private WebElement amazonpaybtn;
	@FindBy(linkText="Customer Service")
	private WebElement customerservicebtn;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifySearchpage()
	{
		verifytitle("Samsung");
		
	}
	
	
	public void searchtextbox(String item)
	{
		searchbox.sendKeys(item);
	}
	public void seachbutton()
	{
		searchbtn.click();
	}
	public void cart()
	{
		cartbtn.click();
	}
	public void amazonpay()
	{
		amazonpaybtn.click();
	}
	public void profile()
	{
		signinbtn.click();
	}
	public void wishlist()
	{
		lists.click();
	}
	public void customerservice()
	{
		customerservicebtn.click();
	}
}
