import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/C/Desktop/exp.html");
		driver.manage().window().maximize();
//		driver.findElement(By.name("test1")).sendKeys("hai");
       List<WebElement> elements = driver.findElements(By.name("test1"));
       elements.get(2).sendKeys("hai");
       Thread.sleep(1000);
       elements.get(0).sendKeys("hello");
       Thread.sleep(3000);
       elements.get(1).sendKeys("hi");
//		driver.findElement(By.tagName("button")).click();
       driver.findElement(By.linkText("Visit Google.com!!")).click();
       Thread.sleep(2000);
       driver.navigate().back();
		

	}

}
