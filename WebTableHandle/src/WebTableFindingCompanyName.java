import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableFindingCompanyName {
          
	 static WebDriver driver = null;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();
        //finding company name
        getCompanyName("Maria Anders");
        getCompanyName("Francisco Chang");
        getCompanyName("Roland Mendel");
        getCompanyName("Helen Bennett");
        getCompanyName("Yoshi Tannamuri");
	}
         private static void getCompanyName(String Contact) {
		// TODO Auto-generated method stub
        	 String CompanyName = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/td[text()='"+Contact+"']/preceding-sibling::td[1]")).getText();
        	 System.out.println("Company Name ::" + CompanyName );
	}
		
         
}
