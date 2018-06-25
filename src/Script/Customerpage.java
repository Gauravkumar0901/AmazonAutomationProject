package Script;

import org.testng.annotations.Test;

import GenericLib.BAseTest;
import GenericLib.Excel;
import POM.Homepage;
import POM.Login;
import POM.Logout;

public class Customerpage extends BAseTest 
{
	@Test
	public void testcase21()
	{
		Login l=new Login(driver);
		l.clicklogin();
		String ss=Excel.getExcelData(path, "Sheet1", 1, 1);
		l.enteruser(ss);
		l.continuewithemail();
		String so=Excel.getExcelData(path, "Sheet1", 2, 1);
		l.passpassword(so);
		l.clickforlogin();
		
		Homepage h= new Homepage(driver);
		h.customerservice();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Amazon.in Help"))
		{
			System.out.println("Title Matched:page verify");
		}
		else
		{
			System.out.println("Title didn't match");
		}

		Logout l1= new Logout(driver);
		l1.movetologout(driver);
		l1.clicklogout();
	}
}
