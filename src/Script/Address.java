
package Script;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLib.BAseTest;
import GenericLib.Excel;
import POM.Addnewadd;
import POM.Addresspage;
import POM.Homepage;
import POM.Login;
import POM.Logout;
import POM.Youraccount;

public class Address extends BAseTest 
{
	@Test
	public void testcase1() throws InterruptedException
	{
		Login l=new Login(driver);
		Thread.sleep(3000);
		l.clicklogin();
		String ss=Excel.getExcelData(path, "Sheet1", 1, 1);
		l.enteruser(ss);
		l.continuewithemail();
		String so=Excel.getExcelData(path, "Sheet1", 2, 1);
		l.passpassword(so);
		l.clickforlogin();
		
		Homepage h=new Homepage(driver);
		h.profile();
		
		Youraccount y=new Youraccount(driver);
		y.clickyouraddress();
		Thread.sleep(3000);
		Addresspage a=new Addresspage(driver);
		a.addaddress();
		Thread.sleep(4000);
		Addnewadd ad= new Addnewadd(driver);
		ad.fullname("gk");
		ad.mobno("7008950469");
		ad.pincode("833215");
		ad.address("afgdjdfjhbefbsfnfljfbuhdb");
		Thread.sleep(3000);
		ad.addaddress();
		ad.verifyaddress();
		driver.findElement(By.id("ya-myab-address-delete-btn-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='deleteAddressModal-1-submit-btn']/span/input")).click();
	Logout l1= new Logout(driver);
		l1.movetologout(driver);
		l1.clicklogout();
}
}