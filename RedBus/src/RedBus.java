import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.redbus.in/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
//    driver.findElement(By.id("redBus")).click();
//    driver.findElement(By.id("cars")).click();
//    driver.findElement(By.id("redBus Bus Hire")).click();
//    driver.findElement(By.id("pilgrimages")).click();
//    driver.findElement(By.partialLinkText("Help")).click();
    Thread.sleep(3000);
      driver.findElement(By.className("manageHeaderLbl")).click();
//    driver.findElement(By.id("sign-in-icon-down")).click();
//    Thread.sleep(2000);
//    driver.findElement(By.id("signInLink")).click();
//    driver.findElement(By.linkText("Manage Booking")).click();
      driver.findElement(By.className("w-65")).click();
      driver.findElement(By.xpath("//input[@placeholder='Enter Ticket No']")).sendKeys("012345");
      driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("jdklakal@gmail.com");
      driver.findElement(By.xpath("//div[text()='Select Passengers']")).click(); 
    //  driver.findElement(By.cssSelector("div.bg-color-d84e55")).click();
	}

}
