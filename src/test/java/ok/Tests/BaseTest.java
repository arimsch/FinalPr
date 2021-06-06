package ok.Tests;

import com.codeborne.selenide.SelenideDriver;
import ok.Pages.LoginPage;
import ok.Pages.UserPage.MainUserPage;
import org.junit.BeforeClass;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.open;

import javax.security.auth.login.Configuration.*;

public class BaseTest {

    protected static final By home = By.xpath(".//a[contains(@id,'logo')]");

    //Инициируем драйвер и соверщаем вход на сайт
    @BeforeClass
    public static void Init() {
        System.setProperty("webdriver.chrome.driver", "C:\\configs1\\chromedriver.exe");
        Configuration.baseUrl="https://ok.ru/";
        open("/");
    }
}
