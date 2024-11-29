import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class firstSeleniumTest {
    WebDriver driver;

    @BeforeClass
    public void setUp () {

        //we instantiate chromedrive into the variable driver
        driver = new ChromeDriver();

        //we open and maximize a Chrome window
        driver.manage().window().maximize();

        //we open the website we want to visit
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void tearDown () {
        // This method closes all the windows of the browser
        //this is the standard method to use
        //driver.quit();

        //this method closes the current window
        //driver.close();
    }

    @Test
    public void testLoginIntoApplication () throws InterruptedException {
        String usernameInputName = "username";
        String passwordInputName = "password";
        String expectedPageTitle = "Dashboard";

        Thread.sleep(2000);

        WebElement usernameEl = driver.findElement(By.name(usernameInputName));
        usernameEl.sendKeys("Admin");

        var passwordEl = driver.findElement(By.name(passwordInputName));
        passwordEl.sendKeys("admin123");

        driver.findElement(By.tagName("button")).click();

        Thread.sleep(2000);

        String pageTitle = driver.findElement(By.tagName("h6")).getText();

        Assert.assertEquals(pageTitle, expectedPageTitle);
    }
}

