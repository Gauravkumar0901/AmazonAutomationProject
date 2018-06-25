package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yourreviewpage 
{
	@FindBy(xpath="(//div[@aria-label='select to rate item four star.'])[2]")
	private WebElement star;
	@FindBy(xpath="(//span[@class='a-size-base a-color-link clearRating clickable'])[2]")
	private WebElement clearbtn;
	
	public Yourreviewpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void selectstar()
	{
		star.click();
	}
	public void clearrating()
	{
		clearbtn.click();
	}
}
