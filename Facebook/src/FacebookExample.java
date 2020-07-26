import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
//      using id locator
    //    driver.findElement(By.id("u_0_2")).click();
//        using name locator
       driver.findElement(By.name("email")).sendKeys("facebook");
       driver.findElement(By.id("pass")).sendKeys("hiihih");
//        using linkText locator
//      driver.findElement(By.linkText("Forgotten account?")).click();
//        using partial linkText locator
//        driver.findElement(By.partialLinkText("Forgotten")).click();
//		using tagName Locator
//        driver.findElement(By.tagName("input")).sendKeys("00000");
//        using xpath locator
//        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("uppala");     
//        using cssSelector
//        driver.findElement(By.cssSelector("#u_0_2")).click();
        driver.findElement(By.id("u_0_b")).click();
        

	}

}
