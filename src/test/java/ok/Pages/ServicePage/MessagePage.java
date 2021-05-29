package ok.Pages.ServicePage;

import ok.BasePage;
import ok.Pages.UserPage.WrapFriendsCard;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$;

public class MessagePage extends BasePage {

    private static final By inputMes=By.xpath("input");
    public String context="Это тест";

    public MessagePage(){
        super();
    }
    @Override
    protected void check() {
        //clickable(inputMes);
    }

    public static void WriteMes(){
        //$(inputMes).sendKeys("test");
    }
}
