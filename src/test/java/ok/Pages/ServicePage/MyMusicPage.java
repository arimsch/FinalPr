package ok.Pages.ServicePage;

import com.codeborne.selenide.Condition;
import ok.BasePage;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MyMusicPage extends BasePage {
    private static final By TrackCard = By.xpath(".//wm-tracks-list//wm-track");
    private static final By CurrantTrack=By.xpath(".//wm-player-track//span[@class=\"name\"]");
    private List<WrapMusicTrack> MyElTracks;


    public MyMusicPage(){
        super();
        this.MyElTracks = WrapMusicTrack.wrap($$(TrackCard));
    }
    @Override
    protected void check() {
        $(TrackCard).waitUntil(Condition.visible,800);
        $(CurrantTrack).should(Condition.visible);
    }

    public boolean CurrentTrackIsAdd(){
        return Objects.equals($(CurrantTrack).getText(),WrapMusicTrack.GetNameTrack(MyElTracks.get(0)));
      }
}
