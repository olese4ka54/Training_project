package RUN;

import org.testng.annotations.Test;

import Com.pages.Home;
import Common.Browsers;

public class Home_Site extends Browsers{
	
	@Test
	public void f() {
		
		Home h=new Home(driver);
		h.emailfield();
		h.passID();
		h.loginbuttonid();
	}
}