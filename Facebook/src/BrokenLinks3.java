import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.chandusoft.com/");
    driver.manage().window().maximize();
    List<WebElement> elements= driver.findElements(By.tagName("a"));
    int count=elements.size();
    System.out.println("The total no of count is:: "+ count);
    String firstlinkname=elements.get(1).getText();
    System.out.println("firstlinkname is:: "+ firstlinkname);
    for(int i=0;i<count;i++) {
    	String linktext=elements.get(i).getText();
    	System.out.println("link" + (i+1)+ "linktext is :: " + linktext);
    }
    
    }

}
