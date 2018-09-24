package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    public loginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(id = "identifierId")
    private WebElement loginField;

    @FindBy(id = "identifierNext")
    private WebElement passwordNextButton;

    public void inputPassword(String login) {
        loginField.click();
        loginField.sendKeys(login);

    }
    public void passwordNext() {
        passwordNextButton.click();
    }



}
