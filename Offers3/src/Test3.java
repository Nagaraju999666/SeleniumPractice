import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://dealsplus.com");
 driver.manage().window().maximize();
 
	}

}
