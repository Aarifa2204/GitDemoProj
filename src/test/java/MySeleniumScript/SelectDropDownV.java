package MySeleniumScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class SelectDropDownV {
     
	static WebDriver driver;
    public static void main(String[] aa) throws  InterruptedException {
    	String exePath = "C:\\Users\\azeem\\eclipse-workspace\\GitDemoProj\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
	    //navigate to url
	    driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
       
         
        Thread.sleep(3000);
        //scroll down the page
         
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
         
        //Click on Country Dropdown
  
        //driver.findElement(By.name("country")).click();
         
        List<WebElement> allOptions = driver.findElements(By.xpath("//select[@name='country']//option"));
        System.out.println(allOptions.size());
         
                 
                 
        for(int i = 0; i<=allOptions.size()-1; i++) {
             
        	System.out.println(allOptions.get(i).getText());
            if(allOptions.get(i).getText().contains("ZIMBABWE")) 
            {
                 
                allOptions.get(i).click();
                break;
                 
            }
        }
         
}
 
}
