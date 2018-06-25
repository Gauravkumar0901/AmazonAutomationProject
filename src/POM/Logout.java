package POM;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	//@FindBy(xpath=".//*[@id='nav-link-yourAccount']/span[2]")
	//@FindBy(xpath="//span[.='Hello, souradeep']")
	@FindBy(xpath="//span[.='Your Orders']/../span[2]")
	private WebElement Logoutbtn;
	@FindBy(xpath="//span[.='Sign Out']")
	private WebElement Clickforlogout;
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void movetologout(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(Logoutbtn).perform(); 
		
	}
	public void clicklogout()
	{
		Clickforlogout.click();
	}
	
}
	
























	