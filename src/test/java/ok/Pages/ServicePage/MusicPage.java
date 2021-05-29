package ok.Pages.ServicePage;

import com.codeborne.selenide.Condition;
import ok.BasePage;
import ok.Pages.UserPage.WrapFriendsCard;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class MusicPage extends BasePage {

    private static final By ButtonForYou=By.xpath(".//a[@data-l=\"t,showcase\"]");
    private static final By ButtonMyMusic=By.xpath(".//a[@data-l=\"t,library\"]");
    private static final By TrackCard = By.xpath(".//wm-tracks-list//wm-track");
    private static final By Add = By.xpath(".//*[@title=\"Добавить в мою музыку\"]");
    private static final By Del = By.xpath(".//*[@title=\"Добавлено\"]");
    private List<WrapMusicTrack> elTracks;
    //private int index = 0;


    public MusicPage(){
        super();
        this.elTracks = WrapMusicTrack.wrap($$(TrackCard));
    }
    @Override
    protected void check() {
        clickable(ButtonForYou);
        clickable(ButtonMyMusic);
        $(TrackCard).waitUntil(Condition.visible,800);
    }

    public void AddTrack(){
        $(ButtonForYou).click();
        WrapMusicTrack.ChooseTrack(elTracks.get(0));
        $(Add).should(Condition.exist).click();
    }

    //удаляет текущий трек(который открыт у пользователя)
    public void DelTrack(){
        $(Del).should(Condition.exist).click();
    }
}
