package packagetest;
// import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MyFirstWebScript {

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
	new Select(driver.findElement(By.id("location"))).selectByVisibleText("London");
	new Select(driver.findElement(By.id("hotels"))).selectByIndex(4);
    new Select(driver.findElement(By.id("room_type"))).selectByIndex(1);
	new Select(driver.findElement(By.id("room_nos"))).selectByIndex(3);
	WebElement date =driver.findElement(By.id("datepick_in"));
	date.click();
	date.clear();
	date.sendKeys("21/04/2022");
	WebElement dat =driver.findElement(By.id("datepick_out"));
	dat.click();
	dat.clear();
	dat.sendKeys("25/04/2022");
	new Select(driver.findElement(By.id("adult_room"))).selectByIndex(2);
	new Select(driver.findElement(By.id("child_room"))).selectByIndex(2);
	driver.findElement(By.cssSelector("#Submit")).click();
	driver.findElement(By.id("radiobutton_0")).click();
	driver.findElement(By.cssSelector("#continue")).click();
	driver.findElement(By.name("first_name")).sendKeys("Sagar");
	driver.findElement(By.name("last_name")).sendKeys("Gawade");
	driver.findElement(By.name("address")).sendKeys("Ballarpur");
	driver.findElement(By.name("cc_num")).sendKeys("1234567891234567");
	new Select(driver.findElement(By.id("cc_type"))).selectByIndex(3);
	new Select(driver.findElement(By.id("cc_exp_month"))).selectByIndex(3);
	new Select(driver.findElement(By.id("cc_exp_year"))).selectByIndex(3);
	driver.findElement(By.name("cc_cvv")).sendKeys("123");
	driver.findElement(By.cssSelector("#book_now")).click();
//	driver.findElement(By.cssSelector("#search_hotel")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("#my_itinerary")).click();
	}
}
