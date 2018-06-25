package Script;

import org.testng.annotations.Test;

import GenericLib.BAseTest;
import GenericLib.Excel;
import POM.Homepage;
import POM.Login;
import POM.Logout;
import POM.Searchpage;

public class Filter extends BAseTest
{
	@Test
	public void testcase5() throws InterruptedException
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
	h.searchtextbox("Samsung Galaxy Note 8");
	h.seachbutton();
	String S= driver.getTitle();
	System.out.println(S);
	
	Searchpage s= new Searchpage(driver);
	s.filter();
	Thread.sleep(2000);
	Logout l1= new Logout(driver);
	l1.movetologout(driver);
	l1.clicklogout();
	}
	
}
