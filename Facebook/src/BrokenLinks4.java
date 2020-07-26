import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrokenLinks4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.facebook.com/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
//   List<WebElement> elements=driver.findElements(By.tagName("a"));
//   int count=elements.size();
//   System.out.println("Total number of count is::"+ count);
//   String Firstlinkname=elements.get(1).getText();
//   System.out.println("Firstlnkname is::" + Firstlinkname);
//   for(int i=0;i<count;i++) {
//	   String linktext = elements.get(i).getText();
//	   System.out.println("linktext is ::" + linktext);
   WebElement Day=driver.findElement(By.id("day"));
   Select DayDropDown = new Select(Day);
   DayDropDown.selectByValue("3");
   WebElement month=driver.findElement(By.id("month"));
   Select monthDropDown=new Select(month);
   monthDropDown.selectByVisibleText("Apr");
   WebElement year=driver.findElement(By.id("year"));
   Select yearDropdown= new Select(year);
   yearDropdown.selectByVisibleText("2016");
   driver.findElement(By.xpath("//input[@type='radio']")).click();
   }
   
	}


