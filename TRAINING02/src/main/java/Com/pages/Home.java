package Com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	WebDriver driver;   //creating global variable 

@FindBy(name="email")
WebElement anynameuserid;

@FindBy(name="pass")
WebElement password;

@FindBy(xpath="//*[@aria-label='Log In']")
WebElement loginbutton;


@FindBy(linkText="Forgot account?")
WebElement forgotpass;


  public Home(WebDriver driver)    {      //  need to create page factory constructor. Each class can have only one constructor
  this.driver=driver;   //this is used to differetiate b/n global and local variable
  PageFactory.initElements(driver, this);   //constructor.
  }
  public void emailfield(String enteridemail) {                    //need to create method according to the action for each element @FindBy(name="email")
	  anynameuserid.sendKeys(enteridemail);
  }
  public void passID() {
	  password.sendKeys("222555666");  
  }
  public void loginbuttonid() {
	  loginbutton.click();
  }
  
  public void empty() {
	  anynameuserid.clear();
  }
public void passID(String s) {
	// TODO Auto-generated method stub
	
}
}