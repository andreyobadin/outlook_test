package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mailPage {
    public mailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(css = "#gb > div.gb_Ed.gb_de.gb_Nd.gb_fe > div.gb_Dc.gb_jb.gb_Cc.gb_7d > div > div.gb_fb.gb_9c.gb_Sg.gb_R.gb_If.gb_ob > div > a")
    private WebElement profile;

    @FindBy(css = "#gb > div.gb_Ed.gb_de.gb_Nd.gb_fe > div.gb_ub.gb_aa.gb_g > div.gb_xb > div > div.gb_Eb")
    private WebElement profileUser;


    public void openUserMenu(){
        profile.click();
    }

    public String getUserMail() {
        String userMail = profileUser.getText();
        return userMail;
    }


}
