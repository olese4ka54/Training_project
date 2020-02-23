package Common;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Browsers {
	public static WebDriver driver;


  @BeforeClass
  @Parameters ({"url","browser"})
  public void beforeClass(String website, String br) {
	  
		 if(br.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuriy Korolchuk\\Documents\\Olesya\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to(website);
		  driver.manage().window().maximize();
		 }else if(br.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yuriy Korolchuk\\Desktop\\gecko\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.navigate().to(website);
		  driver.manage().window().maximize();
		 }else {
			 System.out.println("Please check name");
		 }
  }
  @AfterClass
  public void afterClass() {
  }
public void screenshots() throws IOException{
	File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(shots, new File("C:\\Users\\Yuriy Korolchuk\\Desktop\\PeopleNtech"+timestamp()+"screen.png"));
}

private String timestamp() {
	// TODO Auto-generated method stub
	return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}
}
