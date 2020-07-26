import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://in.bookmyshow.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
//    driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("vijayawada");
//    driver.findElement(By.xpath("//pre[text()='vijayawada']")).click();
    Thread.sleep(2000);
//    driver.findElement(By.partialLinkText("Sign In")).click();
    List<WebElement> links = driver.findElements(By.tagName("a"));
    int count = links.size();
    System.out.println("No of Links::"+ count);
    String firstlink = links.get(1).getText();
    		System.out.println("The First Link is:" + firstlink);
    		for(int i=0; i<=count; i++) {
    			String linktext = links.get(i).getText();
    			System.out.println("Link" + (i+1) + "Link Name is:" + linktext );
    		}
    }
  
    }
	


