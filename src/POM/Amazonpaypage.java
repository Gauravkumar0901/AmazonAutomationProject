package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonpaypage 
{
	@FindBy(linkText="View Statement")
	//S@FindBy(xpath="(//div[@class='a-column a-span1 dashboard-nav-7-col'])[2]")
	private WebElement statementlink;
	
	public Amazonpaypage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void viewstatement()
	{
		statementlink.click();
	}
}
