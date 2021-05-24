import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class HomePageTest extends openBrowser{
    public HomePageTest() {
        super();
    }
    @BeforeMethod
    public void setUpPage() throws MalformedURLException {
        setUp();
    }

    @Test(priority = 1)
    public void testPrintPageTitle()
    {
        System.out.println("Page title: "+driver.getTitle());
    }

    @Test(priority = 2)
    public void testPrintPageTitle2()
    {
        System.out.println("Page title: "+driver.getTitle());
    }

    @AfterMethod
    public void browserClose()
    {
        tearDown();
    }
}
