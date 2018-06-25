package POM;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath="//span[.='Hello. Sign in']")
	private WebElement Loginbtn;
	@FindBy(id="ap_email")
	private WebElement Enteremail;
	@FindBy(id="continue")
	private WebElement Continue;
	@FindBy(id="ap_password")
	private WebElement EnterPassword;
	@FindBy(id="signInSubmit")
	private WebElement Submitforlogin;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clicklogin()
	{
		Loginbtn.click();
	}
	public void enteruser(String uname)
	{
		Enteremail.sendKeys( uname);
	}
	public void continuewithemail()
	{
		Continue.click();
	}
	
	public void passpassword(String pass)
	{
		EnterPassword.sendKeys(pass);
	}
	public void clickforlogin()
	{
		Submitforlogin.click();
	}
	public void verifylogin(WebDriver driver)
	{
		String S= driver.getTitle();
		System.out.println(S);


		if(S.contains("Online Shopping site in India:"))
				{
			System.out.println("Title Matched:page verify");
		}
			else
			{
			System.out.println("Title didn't match");
			}
	}
	
   
}





