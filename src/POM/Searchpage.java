package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Searchpage 
{
	@FindBy(xpath="//h2[text()='Samsung Galaxy Note 8 (Midnight Black)']")
	private WebElement results;
	@FindBy(name="s-ref-checkbox-6631756031")
	//@FindBy(id="sort")
	private WebElement filterchckbox;

	public Searchpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void selectitem()
	{
		results.click();
	}
	public void filter()
	{
		filterchckbox.click();
		//Select sel= new Select(filterchckbox);
		//sel.selectByValue("popularity-rank");
	}
}