package Script;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import GenericLib.BAseTest;
import GenericLib.Excel;
import POM.Homepage;
import POM.Login;
import POM.Logout;
import POM.Productpage;
import POM.Searchpage;
import POM.Sharepage;

public class Sharewithinvalidemail extends BAseTest {
	@Test(priority=7)
	public void testcase18() throws InterruptedException
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
		s.selectitem();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		String ParentID =it.next();
		String ChileId=it.next();
		driver.switchTo().window(ChileId);
		
		Productpage p = new Productpage(driver);
		p.share();
		Thread.sleep(4000);
		Sharepage s1= new Sharepage(driver);
		s1.emailaddress("souradeep");
		s1.share();
		s1.closebutton();
		Thread.sleep(4000);
		Logout l1= new Logout(driver);
		l1.movetologout(driver);
		l1.clicklogout();
		
		
		
	}


	
}
