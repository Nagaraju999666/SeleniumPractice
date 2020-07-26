import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
//    driver.get("https://www.zestmoney.in/");
//    driver.manage().window().maximize();
//    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    driver.findElement(By.name("text-880")).sendKeys("nagaraju");
//    driver.findElement(By.name("your-email")).sendKeys("nagaraju@gmail.com");
//    driver.findElement(By.name("tel-553")).sendKeys("9876543210");
//    driver.findElement(By.className("wpcf7-form-control wpcf7-submit btn btn--primary type--uppercase")).click();
      
    driver.get("https://www.calculator.net/");
    driver.manage().window().maximize();
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    
	}

}
