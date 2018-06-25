package Script;

import org.testng.annotations.Test;

import GenericLib.BAseTest;
import GenericLib.Excel;
import POM.Homepage;
import POM.Login;
import POM.Logout;
import POM.Youraccount;
import POM.Yourorderspage;
import POM.Yourreviewpage;

public class Rating extends BAseTest
{
	@Test
	public void testcase11() throws InterruptedException
	{
		Login l=new Login(driver);
		l.clicklogin();
		String ss=Excel.getExcelData(path, "Sheet1", 3, 1);
		l.enteruser(ss);
		l.continuewithemail();
		String so=Excel.getExcelData(path, "Sheet1", 4, 1);
		l.passpassword(so);
		l.clickforlogin();
		
		Homepage h=new Homepage(driver);
		h.profile();
		Thread.sleep(3000);
		Youraccount y=new Youraccount(driver);
		y.clickyourorders();
		
		Yourorderspage yp=new Yourorderspage(driver);
		yp.writereview();
		Thread.sleep(3000);
		Yourreviewpage yr=new Yourreviewpage(driver);
		yr.selectstar();
		
		yr.clearrating();
		Thread.sleep(3000);
		Logout l1= new Logout(driver);
		l1.movetologout(driver);
		l1.clicklogout();
		
	}
}
