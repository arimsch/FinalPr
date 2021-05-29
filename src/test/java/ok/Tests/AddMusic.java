package ok.Tests;

import ok.Pages.ServicePage.MusicPage;
import ok.Pages.UserPage.MainUserPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;

public class AddMusic extends BaseTest{
    private MainUserPage root;
    @Before
    //Начинаем тест с главной страницы пользователя
    public void setup() {
        $(BaseTest.home).click();
    }

    @Test
    public void AddMusic(){
        root = new MainUserPage();
        root
                .OpenMusic()
        .AddTrack();
    }

    //удаляем добавленный трек
    @After
    public void DelMusic(){
      new MusicPage().DelTrack();
    }
}
