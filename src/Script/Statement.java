package Script;

import org.testng.annotations.Test;

import GenericLib.BAseTest;
import GenericLib.Excel;
import POM.Amazonpaypage;
import POM.Homepage;
import POM.Login;
import POM.Logout;

public class Statement extends BAseTest
{
	@Test
	public void testcase19() throws InterruptedException
	{
	Login l=new Login(driver);
	l.clicklogin();
	String ss=Excel.getExcelData(path, "Sheet1", 1, 1);
	l.enteruser(ss);
	l.continuewithemail();
	String so=Excel.getExcelData(path, "Sheet1", 2, 1);
	l.passpassword(so);
	l.clickforlogin();
	Thread.sleep(3000);
	Homepage h=new Homepage(driver);
	h.amazonpay();
	
	Amazonpaypage ap=new Amazonpaypage(driver);
	{
		ap.viewstatement();
	}
	Thread.sleep(3000);
	Logout l1= new Logout(driver);
	l1.movetologout(driver);
	l1.clicklogout();
	
}
}