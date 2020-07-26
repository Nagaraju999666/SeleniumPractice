import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicxpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
//    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hello");
//    driver.findElement(By.xpath("//input[@name='firstname' or @name='xxxxxx']")).sendKeys("hello");
//    driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='lastname']")).sendKeys("with and");
//    driver.findElement(By.xpath("//input[starts-with(@name,'reg_email__')]")).sendKeys("starts-witih");
//    driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys("facebook");
//      driver.findElement(By.xpath("//input[contains(text(),'Submit a coupon')]")).click();
//    driver.findElement(By.name("q")).sendKeys("lipsticks");
//    driver.findElement(By.xpath("//span[contains(text(), 'Cart')]")).click();
//    driver.findElement(By.xpath("//span[contains(text(), 'Offer Zone')]")).click();
    
	}

}
