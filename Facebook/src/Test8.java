import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.calculator.net/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.name("starttime")).sendKeys("1000");
		
//		driver.findElement(By.id("calcSearchTerm")).sendKeys("Scientific Calculator");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.id("bluebtn")).click();
//		implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		navigate to 
		driver.navigate().to("http://www.calculator.net/percent-calculator.html");
//      maximize 
		driver.manage().window().maximize();
//		enter 10 value in first box of percentage calculator
		driver.findElement(By.id("cpar1")).sendKeys("10");
//		wait for 5 seconds
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		get the text box from application
		String result = driver.findElement(By.id("cpar1")).getAttribute("value");
//		print log in msg to screen
		System.out.println("The result is" + result);
//		closing the brower.
		driver.close();
		
		
		

	}

}
