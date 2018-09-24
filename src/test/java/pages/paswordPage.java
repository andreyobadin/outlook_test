package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paswordPage {
    public paswordPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;



    @FindBy(xpath = ".//*[@id='password']/div[1]/div/div[1]/input")
    private WebElement pasField;

    public void inputPassword(String password) {
        pasField.sendKeys(password);
        pasField.sendKeys(Keys.RETURN);
    }


}
