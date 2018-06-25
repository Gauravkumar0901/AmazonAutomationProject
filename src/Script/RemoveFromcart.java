package Script;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import GenericLib.BAseTest;
import GenericLib.Excel;
import POM.Cartpage;
import POM.Homepage;
import POM.Login;
import POM.Logout;
import POM.Productpage;
import POM.Saveforlaterpage;
import POM.Searchpage;

public class RemoveFromcart  extends BAseTest{
	@Test
	public void testcase12() throws InterruptedException
	{
		Login l=new Login(driver);
		l.clicklogin();
		Thread.sleep(3000);
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
		
		Productpage p= new Productpage (driver);
		p.addcart();
		p.verifycart();
		Thread.sleep(4000);
		h.cart();
		Thread.sleep(4000);
		Cartpage c= new Cartpage(driver);
		c.deletefromcart();
		p.verifyremovecart();
		Saveforlaterpage sl= new Saveforlaterpage(driver); 
		sl.verifyremovefromcart();

		
		Logout l1= new Logout(driver);
		l1.movetologout(driver);
		l1.clicklogout();
		
		
		
	}

}

	
	


