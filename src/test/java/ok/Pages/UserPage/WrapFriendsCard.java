package ok.Pages.UserPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ok.BasePage;
import ok.Pages.ServicePage.MessagePage;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class WrapFriendsCard extends BasePage {

    private final SelenideElement card;
    private static final By ButtonWrite = By.xpath(".//div[text()=\"Написать\"]");
    private static final By CardName = By.cssSelector("[class='n-t bold']");

    public WrapFriendsCard(SelenideElement card){
        super();
        this.card=card;
    }

    @Override
    protected void check() {
        clickable(ButtonWrite);
    }


    public static List<WrapFriendsCard> wrap(ElementsCollection elements) {
        if(elements.isEmpty()) {
            return Collections.<WrapFriendsCard>emptyList();
        }
        List<WrapFriendsCard> friendCardWrapperList = new ArrayList<>();
        for (SelenideElement el : elements) {
            WrapFriendsCard wrapEl = new WrapFriendsCard(el);
            friendCardWrapperList.add(wrapEl);
        }
        return friendCardWrapperList;
    }

    public static int findPerson(List<WrapFriendsCard> list){
        for (WrapFriendsCard el: list) {
            if (el.card.$(CardName).getText().equals("Иван Сураев"))
                return list.indexOf(el);
        }
        return -1;
    }

    public static MessagePage GoDilog(WrapFriendsCard el) {
        el.card.$(ButtonWrite).click();
        return new MessagePage();
    }
}
