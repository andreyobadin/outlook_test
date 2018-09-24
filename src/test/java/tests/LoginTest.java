package tests;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.googlePage;
import pages.loginPage;
import pages.mailPage;
import pages.paswordPage;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static WebDriver driver;
    public static googlePage googlePage;
    public static loginPage loginPage;
    public static mailPage mailPage;
    public static  paswordPage paswordPage;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Java\\\\chromedriver.exe");
        driver = new ChromeDriver();
        googlePage = new googlePage(driver);
        loginPage = new loginPage(driver);
        paswordPage = new paswordPage(driver);
        mailPage = new mailPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com.ua");
    }

    @Test
    public void LoginTest(){
        googlePage.clickLoginButton();
        loginPage.inputPassword("andreyobadin@gmail.com");
        loginPage.passwordNext();
        paswordPage.inputPassword("zzombakk");
        mailPage.openUserMenu();
        String user = mailPage.getUserMail();
        Assert.assertEquals("andreyobadin@gmail.com",user);
        driver.close();
    }



}
