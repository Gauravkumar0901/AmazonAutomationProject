package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {
	@FindBy(xpath="(//span[.='View Wish List'])[2]")
	private WebElement viewWishbtn;
	
	@FindBy(xpath="//a[.='Remove item']")
	private WebElement removefromwishlist;
	
	
	public Wishlist (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gotowishlist()
	{
		viewWishbtn.click();
	}
	
	public void removefromwishlist()
	{
		removefromwishlist.click();
	}
	

}
