package MySeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

public class ChildWindow {
    public static void main(String[] args) throws InterruptedException {
    	String exePath = "C:\\Users\\azeem\\eclipse-workspace\\GitDemoProj\\Drivers\\chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();    
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        // Open new child window within the main window
       System.out.println(driver.findElement(By.id("windowButton")).getText()); 
       driver.findElement(By.id("windowButton")).click();
        Thread.sleep(5000);

        //Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();   // It stores parent window value in a unique identifier of string type.
        System.out.println(mainWindowHandle);
        
        Set<String> allWindowHandles = driver.getWindowHandles();  //All child windows are stored in a set of strings.
        System.out.println(allWindowHandles);
        
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) 
        {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println("Heading of child window is: " + text.getText());
                driver.close();
                System.out.println("Child window closed");
            }
                
        }
        driver.switchTo().window(mainWindowHandle);
        System.err.println(mainWindowHandle);
        System.out.println(driver.findElement(By.id("windowButton")).getText()); 
        System.out.println("User is in Parent Window");
        driver.quit();
        
    }
    
    
}
