package Script;

//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import GenericLib.BAseTest;
import GenericLib.Excel;
import POM.Login;
import POM.Logout;

public class LoginlogoutScript extends BAseTest  {
	@Test 
	public void testcase6(){
	
	
Login l=new Login(driver);
l.clicklogin();
String ss=Excel.getExcelData(path, "Sheet1", 1, 1);
l.enteruser(ss);
l.continuewithemail();
String so=Excel.getExcelData(path, "Sheet1", 2, 1);
l.passpassword(so);
l.clickforlogin();
l.verifylogin(driver);
Logout l1= new Logout(driver);
l1.movetologout(driver);
l1.clicklogout();

}

}
