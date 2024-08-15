
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromeexample {
    public static void main(String[] args) {

        // set the path
        System.setProperty("webdriver.chrome.driver","C://GUVI//Drivers//chromedriver.exe");
      
        // Create an object
        WebDriver driver=new ChromeDriver();
      
        //Launch the website
        driver.get("https://www.demoblaze.com");
      
        //Maximize the browser window
        driver.manage().window().maximize();
      
        //Check the titel of the website as "STORE"
        if (driver.getTitle().equals("STORE"))
         System.out.println("Page landed on the correct website");
        else
         System.out.println("Page not landed on the correct website");
      
       }
      
}
