package MySeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeBrowser 
{
static WebDriver driver;
	
	@Test
    public void test1_switchUsingId() throws InterruptedException{
		
		String exePath = "C:\\Users\\azeem\\eclipse-workspace\\GitDemoProj\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
	    //navigate to url
	    driver.manage().window().maximize();
	    
       
	    driver.get("https://www.guru99.com/");
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//*[@id='java_technologies']/li/a")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.navigate().back();
	    
	    Thread.sleep(5000);
	    
	    driver.navigate().forward();
	    
	    Thread.sleep(5000);
	    
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    
	    driver.navigate().to(currentUrl);
	    Thread.sleep(5000);
	    driver.navigate().refresh();
	    
	    
	  
	    
	    
 
    }

}
	

