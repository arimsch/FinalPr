package ok.Pages.UserPage;

import com.codeborne.selenide.Condition;
import ok.BasePage;
import ok.Pages.Header;
import ok.Pages.ServicePage.MusicPage;
import ok.Pages.ServicePage.NotePage;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class MainUserPage extends BasePage {
    private static final By UserPhoto =By.xpath(".//input[@name='photo']");
    private static final By HeaderBar=By.xpath(".//*[@class= 'toolbar_decor']");
    private static final By Note=By.linkText("Заметки");


    public MainUserPage() {
        super();
    }

    //проверка, загрузилась ли страница
    @Override
    protected void check() {
        $(UserPhoto).shouldHave(Condition.exist);
        $(HeaderBar).should(Condition.appear);
    }

    public FriendsPage gotoFriendsPage(){
     Header.Button.click(Header.Button.Friends);
     return new FriendsPage();
    }

    public MusicPage OpenMusic()
    {
        Header.Button.click(Header.Button.Music);
        return new MusicPage();
    }

    public NotePage OpenNote(){
        clickable(Note);
        $(Note).click();
        return new NotePage();
    }
}
