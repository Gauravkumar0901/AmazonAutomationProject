package Script;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import GenericLib.BAseTest;
import GenericLib.Excel;
import POM.Addressatcart;
import POM.Cartpage;
import POM.Homepage;
import POM.Login;
import POM.Logout;
import POM.Productpage;
import POM.Searchpage;

public class Selectaddress extends BAseTest
{
	@Test
	public void testcase16() throws InterruptedException
	{
	Login l=new Login(driver);
	l.clicklogin();
	String ss=Excel.getExcelData(path, "Sheet1", 1, 1);
	l.enteruser(ss);
	l.continuewithemail();
	String so=Excel.getExcelData(path, "Sheet1", 2, 1);
	l.passpassword(so);
	l.clickforlogin();
	
	Homepage h=new Homepage(driver);
	h.searchtextbox("Samsung Galaxy Note 8");
	h.seachbutton();
	
	Searchpage s=new Searchpage(driver);
	s.selectitem();
	Set<String> set=driver.getWindowHandles();
	Iterator<String> it=set.iterator();
	String ParentID =it.next();
	String ChileId=it.next();
	driver.switchTo().window(ChileId);
	
	Thread.sleep(5000);
	
	Productpage p=new Productpage(driver);
	p.addcart();
	
	h.cart();
	
	Cartpage c=new Cartpage(driver);
	c.checkout();
	Thread.sleep(3000);
	Addressatcart adc=new Addressatcart(driver);
	adc.deliveraddress();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	
Logout l1= new Logout(driver);
	l1.movetologout(driver);
	l1.clicklogout();
	
	}
}
