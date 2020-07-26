import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://dealspotr.com/");
    driver.manage().window().maximize();
    List<WebElement> elements=driver.findElements(By.tagName("a"));
    int count = elements.size();
    System.out.println("The totalno of count is ::" + count);
    String firstlinkname=elements.get(1).getText();
    System.out.println("Firstlinkname is::" + firstlinkname);
    for(int i=0;i<count;i++) {
    	String Linktext=elements.get(i).getText();
    	System.out.println("Link"+(i+1)+ "name is::" + Linktext);
    }
	}

}
