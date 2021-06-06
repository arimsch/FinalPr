package ok.Tests;

import com.codeborne.selenide.Condition;
import ok.Pages.LoginPage;
import ok.Pages.UserPage.MainUserPage;
import ok.TestBot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SendMessage extends BaseTest{
    private MainUserPage root;

    @Before
    //Начинаем тест с главной страницы пользователя
    public void setup() {
        root=new LoginPage().login("+79500071367", "123QWE");
        $(BaseTest.home).click();
        //проверка, тот ли пользователь на тесте
        Assert.assertEquals("Не тот пользователь","Арина Матушкина",root.GetName());
    }

    @Test
    public void SendM() {
        root = new MainUserPage();
        root
                .gotoFriendsPage()
        .goToMessageWith();
    }


}
