package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Try {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-yourAccount")).click();
		WebDriverWait wait= new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));
		driver.findElement(By.id("ap_email")).sendKeys("7008950469");
		driver.findElement(By.id("continue")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_password")));
		driver.findElement(By.id("ap_password")).sendKeys("gaurav1552");
		driver.findElement(By.id("signInSubmit")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-yourAccount")));
		WebElement ele = driver.findElement(By.id("nav-link-yourAccount"));
		Actions a=new Actions(driver);
		a.moveToElement(ele);
		driver.findElement(By.id("nav_prefetch_yourorders")).click();
	}

}
