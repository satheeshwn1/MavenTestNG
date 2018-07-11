/**
 * Created by satheesh on 6/27/18.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleHomePageTest {

    private WebDriver driver ;
    String AppUrl = "http://google.com";

    @BeforeClass
    public void testsetup()
    {
        driver = new ChromeDriver();

    }

    @Test
    public void verifyGoogleTitle()
    {
        driver.navigate().to(AppUrl);
        String getTitle = driver.getTitle();
        Assert.assertEquals(getTitle,"Google");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
