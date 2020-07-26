import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://login.yahoo.com/config/login");
    driver.manage().window().maximize();
    driver.findElement(By.id("login-username")).sendKeys("abcdef");
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    driver.findElement(By.id("login-signin")).click();
	}

}
