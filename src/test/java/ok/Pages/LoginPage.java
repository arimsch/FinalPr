package ok.Pages;

import com.codeborne.selenide.Condition;
import ok.BasePage;
import ok.Pages.UserPage.MainUserPage;
import ok.TestBot;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.hamcrest.JMock1Matchers.equalTo;
import static org.hamcrest.MatcherAssert.*;


public class LoginPage extends BasePage {
    private static final By SIGN_IN_LOCATOR = By.xpath(".//*[contains(@data-l, \"sign_in\")]");
    private static final By logField = By.cssSelector("#field_email");
    private static final By pasField = By.cssSelector("#field_password");


    public LoginPage(){
        super();
    }
    @Override
    protected void check() {
        clickable(logField);
        clickable(pasField);
        clickable(SIGN_IN_LOCATOR);
    }

    public MainUserPage login(String log, String pas) {
        clear();
        TestBot TB = new TestBot(log,pas);
        $(logField).sendKeys(TB.getLogin());
        $(pasField).sendKeys(TB.getPassword());
        $(SIGN_IN_LOCATOR).click();
        return new MainUserPage();
    }

    private static void clear() {
        $(logField).clear();
        $(pasField).clear();
    }
}
