package ok.Pages.ServicePage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ok.BasePage;
import ok.Pages.UserPage.WrapFriendsCard;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WrapMusicTrack extends BasePage {
    private final SelenideElement card;

    public WrapMusicTrack(SelenideElement card){
        super();
        this.card=card;
    }

    @Override
    protected void check() {

    }


    public static List<WrapMusicTrack> wrap(ElementsCollection elements) {
        if(elements.isEmpty()) {
            return Collections.<WrapMusicTrack>emptyList();
        }
        List<WrapMusicTrack> CardWrapperList = new ArrayList<>();
        for (SelenideElement el : elements) {
            WrapMusicTrack wrapEl = new WrapMusicTrack(el);
            CardWrapperList.add(wrapEl);
        }
        return CardWrapperList;
    }

    public static void ChooseTrack(WrapMusicTrack el) {
        el.card.click();
    }

}
