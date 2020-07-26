import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Customxpath {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    driver.get("https://deseretbook.com/");
    Actions action = new Actions(driver);
    action.moveToElement(driver.findElement(By.linkText("Books"))).build().perform();
    driver.findElement(By.linkText("Christmas")).click();
    }

}
