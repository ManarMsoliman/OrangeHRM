import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class OrangeTc {

    WebDriver myBrowser;

    @BeforeTest
    public void waitingTime() throws InterruptedException {
        Thread.sleep(300);

    }

    @BeforeMethod
    public void setUp() {
        myBrowser = new ChromeDriver();

    }

    @AfterSuite
    public void tearDown() {
        myBrowser.quit();
    }


    @Test
    public void navigateToLoginPage() {
        myBrowser.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title = myBrowser.getTitle();
        Assert.assertEquals(title, "OrangeHRM");

    }

    @Test(testName= "navigateToLoginPage")
    public void LoginWithValidCredential() {
        myBrowser.findElement(By.name("username")).sendKeys("Admin");
        myBrowser.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
        myBrowser.findElement(By.cssSelector("button[type='submit']")).click();

    }

    @Test(testName= "navigatingtoAdminMenu")
    public void NavigateToAdminMenu() throws InterruptedException {
        myBrowser.findElement(By.cssSelector("span[class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
        myBrowser.wait(300);

    }

    }