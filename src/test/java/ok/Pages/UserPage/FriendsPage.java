package ok.Pages.UserPage;

import com.codeborne.selenide.Condition;
import ok.BasePage;
import ok.Pages.ServicePage.MessagePage;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$;

public class FriendsPage extends BasePage {
    private static final By friendCard = By.xpath(".//div[@class=\"user-grid-card\"]");
    private List<WrapFriendsCard> elFriends;
    private int index = 0;

    public FriendsPage(){
        super();
        this.elFriends = WrapFriendsCard.wrap($$(friendCard));
    }

    @Override
    protected void check() {
        $(friendCard).should(Condition.exist);
    }

    public MessagePage goToMessageWith(){
        index=WrapFriendsCard.findPerson(elFriends);
        Assert.assertTrue("Друг с таким именем не найден",index>=0);
        return WrapFriendsCard.GoDilog(elFriends.get(index));
    }

}
