import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;


public class greenKart {
    static WebDriver driver;
    public static  void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.edge.driver","/Users/nagendrareddy/Applications/msedgedriver");
        //WebDriver driver = new EdgeDriver();
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");
        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.101:4444"),caps);
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }


        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.quit();
        //http://192.168.1.100:4444
    }

}
