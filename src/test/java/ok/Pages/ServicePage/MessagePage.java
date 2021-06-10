package ok.Pages.ServicePage;

import com.codeborne.selenide.Condition;
import ok.BasePage;
import org.openqa.selenium.By;
import static org.hamcrest.MatcherAssert.*;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$;

public class MessagePage extends BasePage {

    private static final By inputMes=By.tagName("msg-input");

    public MessagePage(){
        super();
    }
    @Override
    protected void check() {
    }

    public static void WriteMes(){

    }
}
