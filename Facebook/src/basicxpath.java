import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.oursubhakaryam.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='contact_our_subhakaryam_team.html']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hello@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("subba");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("subbu");
		driver.findElement(By.xpath("//input[@id='q7']")).sendKeys("09.30");
		driver.findElement(By.xpath("//input[@id='visver_code']")).getAttribute("visver_code");
//		driver.findElement(By.xpath("//select[@id='q8']")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();

	}

}
