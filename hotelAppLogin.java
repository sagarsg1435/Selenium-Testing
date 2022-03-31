package packagetest;
// import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class hotelAppLogin {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","D:\\Selenium Testing\\chrome driver\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
	driver.get("https://www.adactinhotelapp.com");
	WebElement uname = driver.findElement(By.id("username"));
	uname.sendKeys("spgawade1997");
	driver.findElement(By.id("password")).sendKeys("7P1149");
	driver.findElement(By.id("login")).click();
//	driver.quit();
	}
}