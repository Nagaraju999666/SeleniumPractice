import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksFinding {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://techcanvass.com/examples/webtable.html");
		driver.manage().window().maximize();
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='t01']//tr"));
		System.out.println("The number of rows present in the table are:" +rows.size());
        System.out.println(driver.findElement(By.xpath("//table[@id='t01']//tr[1]")).getText());		
		
		List<WebElement> coloumns=driver.findElements(By.xpath("//table[@id='t01']//th"));
		System.out.println("The num of coloumns are in table is:" + coloumns.size());
		System.out.println(driver.findElement(By.xpath("//table[@id='t01']//th")).getText());
		
			
			
			
			
		}		
		
		
		
		
		
		
	}


