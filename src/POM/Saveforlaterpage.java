package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saveforlaterpage 
{
	@FindBy(xpath="//input[@aria-label='Move to Cart Samsung Galaxy Note 8 (Midnight Black)']")
	private WebElement movetocartbtn;
	@FindBy(xpath="//input[@value='Move to Wish List']")
	private WebElement movettowishlistbtn;
	@FindBy(xpath="//input[@aria-label='Delete Samsung Galaxy Note 8 (Midnight Black)']")
	private WebElement deletebtn;
	@FindBy(xpath="//form[@id='savedCartViewForm']/div[3]/div[1]/div[3]/div[1]/span")
	private WebElement verifydeletwishlist;
	@FindBy(xpath="//form[@id='activeCartViewForm']/div[2]/div/div[3]/div[2]/span")
	private WebElement verifymovetocart;
	@FindBy(xpath="//form[@id='savedCartViewForm']/div[3]/div[1]/div[3]/div[2]/span")
	private WebElement verify;
	@FindBy(xpath="//form[@id='activeCartViewForm']/div[2]/div/div[3]/div[1]/span")
	private WebElement verifyremovefromcart;
	public Saveforlaterpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void verifydeletwishlist()
	{
		String s2=verifydeletwishlist.getText();
		
		if(s2.contains("removed from Save For Later"))
		{
			System.out.println("Verify Page:Product delete from wishlist successfully");
		}
		else
		{
			System.out.println("Not verify:Product not delete");
		}
	}
	
	public void verifymovetocart()
	{
		String s2=verifymovetocart.getText();
		
		if(s2.contains("has been moved to Save For Later"))
		{
			System.out.println("Verify Page:Product moved to Save For Later successfully");
		}
		else
		{
			System.out.println("Not verify:Product not move");
		}
	}
		
		public void verify()
		{
			String s2=verify.getText();
			
			if(s2.contains("has been moved to Shopping Cart"))
			{
				System.out.println("Verify Page:Product moved to cart successfully");
			}
			else
			{
				System.out.println("Not verify:Product not move");
			}
	}
		
		public void verifyremovefromcart()
		{
			String s2=verifyremovefromcart.getText();
			
			if(s2.contains("was removed from Shopping Cart"))
			{
				System.out.println("Verify Page:Product remove from cart successfully");
			}
			else
			{
				System.out.println("Not verify:Product not remove");
			}
	}
	
	
	public void moovetocart()
	{
		movetocartbtn.click();
	}
	public void movetowishlist()
	{
		movettowishlistbtn.click();
	}
	public void delete()
	{
		deletebtn.click();
	}
}
