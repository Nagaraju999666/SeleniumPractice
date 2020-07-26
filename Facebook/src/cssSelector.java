import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.saveplus.in/");
	    driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
//        driver.findElement(By.cssSelector("input#email")).sendKeys("hi");
//        driver.findElement(By.cssSelector("input#pass")).sendKeys("hey");
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("label#loginbutton")).click();
//          driver.findElement(By.cssSelector("input[class=\"inputtext _58mg _5dba _2ph-\"][name=\"firstname\"]")).sendKeys("hello");
         driver.findElement(By.cssSelector("input[id^='keyword']")).sendKeys("");          
          
          
          
          
          
         }

}
