import com.saucedemo.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    private String url = "http://www.saucedemo.com";

    @BeforeClass
    public void setUp () {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }
}
