package ok.Tests;

import com.sun.xml.internal.ws.wsdl.writer.document.Message;
import ok.Pages.LoginPage;
import ok.Pages.ServicePage.MusicPage;
import ok.Pages.ServicePage.MyMusicPage;
import ok.Pages.UserPage.MainUserPage;
import ok.TestBot;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;

public class AddMusic extends BaseTest{
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
    public void AddMusicFromRecommend(){
        root
                .OpenMusicRecommend()
        .AddTrackFromRecommend(0);
        MyMusicPage after=MusicPage.GoMyMusic();
        Assert.assertTrue(after.CurrentTrackIsAdd());
    }

    //удаляем добавленный трек
    @After
    public void DelMusic(){
      new MusicPage().DelTrack();
    }
}
