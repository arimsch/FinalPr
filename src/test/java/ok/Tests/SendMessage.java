package ok.Tests;

import com.codeborne.selenide.Condition;
import ok.Pages.UserPage.MainUserPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SendMessage extends BaseTest{
    private MainUserPage root;

    @Before
    //Начинаем тест с главной страницы пользователя
    public void setup() {
        $(BaseTest.home).click();
    }

    @Test
    public void SendM() {
        root = new MainUserPage();
        root
                .gotoFriendsPage()
        .goToMessageWith();
    }


}
