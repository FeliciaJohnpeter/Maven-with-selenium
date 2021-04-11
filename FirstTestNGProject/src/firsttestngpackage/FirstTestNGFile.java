package firsttestngpackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	public WebDriver driver;
	
	@Test(priority=2)
	public void a() {
		System.out.println("First test ");
	}
	@Test(priority=1)
	public void b() {
		System.out.println("Second test");
	}
	
  @Test(priority=3)
  public void VerifyTitle() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\FELICIA\\Desktop\\selenium\\chromedriver_win32(2)\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://demo.guru99.com/test/newtours/");
	String acTitle= driver.getTitle();
	String ExTitle="Welcome: Mercury Tours";
	Assert.assertEquals(acTitle,ExTitle);
	driver.close();
	
	
  }
}
