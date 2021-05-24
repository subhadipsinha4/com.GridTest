import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class openBrowser {

    public static WebDriver driver;
    public static DesiredCapabilities cap;
    //public static ChromeOptions options;
    public static FirefoxOptions options;
    public openBrowser(){
//        cap=new DesiredCapabilities();
//        //options=new ChromeOptions();
//        options=new FirefoxOptions();
    }

    public void setUp() throws MalformedURLException {
//        cap.setBrowserName( "firefox" );
//        cap.setPlatform( Platform.WINDOWS );
//        options.merge( cap );
//        String hubUrl="http://192.168.0.104:4444/wd/hub";
        System.setProperty("webdriver.chrome.driver","C:\\com.GridTest\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        //driver= new RemoteWebDriver( new URL(hubUrl),options );
        driver.manage().window().maximize();
        driver.get( "https://www.miniaturemarket.com/" );
        //Maven Dependency Update Trigger

    }

    public void tearDown()
    {
        driver.quit();
    }
}
