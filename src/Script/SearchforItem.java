package Script;

//import java.util.Iterator;
//import java.util.Set;

import org.testng.annotations.Test;

import GenericLib.BAseTest;
import GenericLib.BaseClass;
import GenericLib.Excel;
import POM.Homepage;
import POM.Login;
import POM.Logout;
//import POM.Productpage;
//import POM.Searchpage;

public class SearchforItem extends BAseTest {
	@Test
	public void testcase15() throws InterruptedException
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
		/*Thread.sleep(25000);
		BaseClass b =new BaseClass();
		b.pageverify("Samsung Galaxy Note 8");
		Thread.sleep(5000);*/
		
		if(S.contains("Samsung Galaxy"))
				{
			System.out.println("Title Matched:page verify");
		}
			else
			System.out.println("Title didn't match");
		
		Logout l1= new Logout(driver);
		l1.movetologout(driver);
		l1.clicklogout();
		
		
		
	}


}
