import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openBrowser {

    public static WebDriver driver;

    @Test
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","C:\\com.GridTest\\driver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get( "https://www.miniaturemarket.com/" );
        System.out.println("Page title: "+driver.getTitle());

    }
}
