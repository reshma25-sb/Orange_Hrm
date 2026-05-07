package baseClass;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pageObject.loginPage;

public class baseTest {

     public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();   // ✅ driver initialized here
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       loginPage login = new loginPage(driver);
       login.enterUserName("Admin", "admin123");
       login.loginUser();
    }
    
   

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();   // ✅ prevents null error
        }
    }
}