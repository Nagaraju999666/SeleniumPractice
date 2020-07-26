import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://techcanvass.com/examples/webtable.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    getExshowroom("Hyundai");
	getExshowroom("Suzuki");
	getExshowroom("Honda");
	
    //row count
    List<WebElement> rows = driver.findElements(By.xpath("//table[@id='t01']/tbody/tr"));
    System.out.println("Rowcount ::" + (rows.size()-1));
    //Column size
    List<WebElement> cols = driver.findElements(By.xpath("//table[@id='t01']//th"));
    System.out.println("Coloumn Count ::" + cols.size());
    
    //printing company names
    
    List<WebElement> companyNames = driver.findElements(By.xpath("//table[@id='t01']//tr/td[1]"));
    for(int i=0; i<companyNames.size(); i++) {
    	System.out.println("Company Name is::"+companyNames.get(i).getText());
    }
    
    //printing make
    
    List<WebElement> make = driver.findElements(By.xpath("//table[@id='t01']//tr/td[2]"));
    for(int i=0; i<make.size(); i++){
    	System.out.println("Make ::" + make.get(i).getText());
    }
    
    
    //printing price
    
    List<WebElement> price = driver.findElements(By.xpath("//table[@id='t01']//tr/td[3]"));
    for(int i=0; i<price.size(); i++) {
    	System.out.println("EX Showroom Price is::"+price.get(i).getText());
    	
    	
    	
    }
    
    
    	
    	
    
	}

	private static void getExshowroom(String CompanyName) {
		
		String ExStringPrice = driver.findElement(By.xpath("//table[@id='t01']/tbody/tr/td[text()='"+CompanyName+"']/following-sibling::td[2]")).getText();
    	System.out.println("ExShowRoom Price is::"+ ExStringPrice);
    }
	}


