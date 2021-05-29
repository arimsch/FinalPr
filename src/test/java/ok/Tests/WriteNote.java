package ok.Tests;

import ok.Pages.ServicePage.MusicPage;
import ok.Pages.ServicePage.NotePage;
import ok.Pages.UserPage.MainUserPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;

public class WriteNote extends BaseTest{
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
                .OpenNote()
        .AddN();
    }

    //удаляем написанную заметку
    @After
    public void DelNote(){
        new NotePage().DelN();
    }
}
