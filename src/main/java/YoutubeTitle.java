import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class YoutubeTitle {

    @Test
    public void YoutubeHomePage() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.101:4444"), caps);
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
