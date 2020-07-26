import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.findElement(By.id("u_0_m")).sendKeys("xxxx");
    driver.findElement(By.id("u_0_o")).sendKeys("a");
    //driver.findElement(By.id("u_0_z")).sendKeys("nagaraju1@gmail.com");
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    driver.findElement(By.id("u_0_13")).click();
	}

}
