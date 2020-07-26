package com.chandusoft.formfilling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("http://demo.automationtesting.in/Register.html");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Syam");
     driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("A");
     driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("17 westbeyview ave, ocean gate");
     driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("adcd@gmail.com");
     driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9999999999");
     driver.findElement(By.xpath("//input[@value='Male']")).click();
     driver.findElement(By.id("checkbox1")).click();
     driver.findElement(By.id("msdd")).click();
     driver.findElement(By.linkText("Italian")).click();
     WebElement skills=driver.findElement(By.id("Skills"));
     Select skillDropdown=new Select(skills);
     skillDropdown.selectByValue("Adobe InDesign");
     WebElement country=driver.findElement(By.id("countries"));
     Select countryDropdown= new Select(country);
     countryDropdown.selectByValue("Algeria");
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
