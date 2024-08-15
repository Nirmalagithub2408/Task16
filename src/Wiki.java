import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Wiki {
    public static void main(String[] args) {
        // set the path
        System.setProperty("webdriver.chrome.driver","C://GUVI//Drivers//chromedriver.exe");
      
        // Create an object
        WebDriver driver=new ChromeDriver();
      
        //Launch the web site
        driver.get("https://www.wikipedia.org");
      
        //Maximize the browser window
        driver.manage().window().maximize();
      
        //Enter the value as "Artificial Intelligence" and click the search option
        driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
        WebElement searchElt = driver.findElement(By.className("svg-search-icon"));
        searchElt.click();
      
        // Click the History link
        driver.findElement(By.className("vector-toc-link")).click();
      
        //Print the title of the page
        System.out.println(driver.getTitle());
      
       }
}
