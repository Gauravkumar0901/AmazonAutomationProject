package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage 
{
	@FindBy(id="swfText")
	private WebElement sharebtn;
	
	@FindBy(id="add-to-cart-button")
	private WebElement addtocartbtn;
	
	@FindBy(id="add-to-wishlist-button-submit")
	private WebElement wishlistbtn;
	
	@FindBy(id="huc-v2-order-row-confirm-text")
	private WebElement Verifycnftoaddcart;
	
	
	@FindBy(xpath="//a[@class='a-link-normal sc-product-link'][1]")
	private WebElement Verifycnftoremovecart;
	
	@FindBy(id="a-popover-header-4")
	private WebElement closeWishlistpage;
	@FindBy(xpath="//div[@id='huc-v2-order-row-confirm-text']/h1")
	private WebElement verifycart;
	@FindBy(id="WLHUC_result_action_add")
	private WebElement verifywishlist;
	
	public Productpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifywishlist()
	{
		String s2=verifywishlist.getText();
		
		if(s2.contains("added to"))
		{
			System.out.println("Verify Page:Product add to wishlist successfully");
		}
		else
		{
			System.out.println("Not verify:Product not add");
		}
	}
	
	public void verifycart()
	{
		String s=verifycart.getText();
		
		if(s.contains("Added to Cart"))
		{
			System.out.println("Verify Page:Product add to cart successfully");
		}
		else
		{
			System.out.println("Not verify:Product not add");
		}
	}
	
	public void verifyremovecart()
	{
		String veriremovecart=Verifycnftoremovecart.getText();
		if(veriremovecart.contains("was removed from Shopping Cart"))
		{
			System.out.println("verify");
		}
		else
		{
			System.out.println(" verify");
		}
	}
		
	
	public void share()
	{
		sharebtn.click();
	}
	public void wishlist()
	{
		wishlistbtn.click();
	}
	public void addcart()
	{
		addtocartbtn.click();
	}
	public void closewish()
	{
		closeWishlistpage.click();
	}
}
