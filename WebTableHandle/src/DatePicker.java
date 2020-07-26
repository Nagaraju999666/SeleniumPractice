import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date d = new Date();
		String formattedDate=formatter.format(d);
		System.out.println(formattedDate);
		String[] strArray=formattedDate.split("/");
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);
		System.out.println(strArray[2]);
		System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.linkText(strArray[0])).click();
		driver.findElement(By.id("datepicker2")).click();
		driver.findElement(By.linkText(strArray[0])).click();
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker2")).click();// stale element exception
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='datepick-month-header']//following-sibling::table//a[text()='28']")).click();
		
	}
}


