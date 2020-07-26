package com.automationtesting.css;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formfilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://demo.automationtesting.in/Register.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("hello");
    driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("hai");
    driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("oceangate");
    driver.findElement(By.cssSelector("input[ng-model='EmailAdress']")).sendKeys("dfdks@gmail.com");
    driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("9087654321");
    driver.findElement(By.cssSelector("input[value='Male']")).click();
    driver.findElement(By.cssSelector("input[value='Cricket']")).click();
    driver.findElement(By.id("msdd")).click();
    driver.findElement(By.linkText("Arabic")).click();
   WebElement skill= driver.findElement(By.id("Skills"));
   Select skillDrop=new Select(skill);
   skillDrop.selectByValue("Adobe Photoshop");
  WebElement country= driver.findElement(By.id("countries"));
  Select countries=new Select(country);
  countries.selectByValue("Afghanistan");
  driver.findElement(By.cssSelector("span[tabindex='-1']")).click();
//  driver.findElement(By.cssSelector("input[type='search']")).sendKeys("india");
    driver.findElement(By.id("select2-country-container")).click();
  WebElement year=driver.findElement(By.id("yearbox"));     
  Select yearDropdown=new Select(year);
  yearDropdown.selectByValue("1920");
 WebElement month= driver.findElement(By.xpath("//select[@placeholder='Month']"));
 Select monthDropdown=new Select(month);
 monthDropdown.selectByValue("June");
 WebElement day=driver.findElement(By.id("daybox"));
 Select dayDropdown=new Select(day);
 dayDropdown.selectByValue("6");
 driver.findElement(By.id("firstpassword")).sendKeys("99666");
 driver.findElement(By.id("secondpassword")).sendKeys("99666");
 driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
  
	}

}
