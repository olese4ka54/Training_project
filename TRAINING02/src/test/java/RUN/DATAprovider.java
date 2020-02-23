package RUN;

import org.testng.annotations.Test;

import Com.pages.Home;
import Common.Browsers;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class DATAprovider extends Browsers {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {    //   n represents numbers, and s represents letters
 

		Home h=new Home(driver);
		h.emailfield(n);
		h.passID(s);
		h.loginbuttonid();
		driver.navigate().back();
		h.empty();
		Reporter.log("Executed sucessfully");
  
  
  
  }

  @DataProvider
  public Object[][] dp() {   // dp is by dafault, yu can rename it 
    return new Object[][] {
      new Object[] { "petya@gmil.com", "a" },  //two values under each pair 
      new Object[] { "misha@yahoo.com", "b" },
      new Object[] {"anna@live.com", "c" },
      new Object[] {"ivan@gmail.com", "d"},
    };
  }
}
