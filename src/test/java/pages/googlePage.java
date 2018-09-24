package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googlePage {
    public googlePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;


    @FindBy(className = "gb_P")
    private WebElement mailButton;

    public void clickLoginButton() {
        mailButton.click();
    }

}
