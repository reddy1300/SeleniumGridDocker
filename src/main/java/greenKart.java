import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class greenKart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/nagendrareddy/Applications/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
