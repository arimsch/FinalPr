package ok.Tests;

import ok.Pages.LoginPage;
import ok.Pages.ServicePage.MusicPage;
import ok.Pages.ServicePage.NotePage;
import ok.Pages.UserPage.MainUserPage;
import ok.TestBot;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;

public class WriteNote extends BaseTest{
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
                .OpenNote()
        .AddN("Test");
        Assert.assertTrue(NotePage.SuccessfulTestAddNote());
    }

    //удаляем написанную заметку
    @After
    public void DelNote(){
        new NotePage().DelN();
    }
}
