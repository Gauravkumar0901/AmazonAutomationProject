package Script;

import org.testng.annotations.Test;

import GenericLib.BAseTest;
import GenericLib.Excel;
import POM.Addnewadd;
import POM.Addresspage;
import POM.Homepage;
import POM.Login;
import POM.Logout;
import POM.Youraccount;

public class Negativeaddress extends BAseTest
{
	@Test
	public void testcase9()
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
		h.profile();
		
		Youraccount y=new Youraccount(driver);
		y.clickyouraddress();
		
		Addresspage a=new Addresspage(driver);
		a.addaddress();
		
		Addnewadd ad= new Addnewadd(driver);
		ad.fullname("gk");
		ad.mobno("7008950469");
		ad.pincode("8332");
		ad.address("afgdjdfjhbefbsfnfljfbuhdb");
		ad.city("Jamshedpur");
		ad.addaddress();
		
		/*Logout l1= new Logout(driver);
		l1.movetologout(driver);
		l1.clicklogout();*/
	}
}
