package ok.Pages.ServicePage;

import com.codeborne.selenide.Condition;
import ok.BasePage;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class NotePage extends BasePage {
    //for add Note
    private static final By AddNote=By.xpath(".//a[@href=\"/post\"]");
    private static final By FieldForM=By.xpath(".//div[@data-hashtags-enabled=\"1\"]");
    private static final By SendNote = By.xpath(".//div[@title=\"Поделиться\"]");
    //for Del Note
    private static final By MenuNote=By.xpath(".//div[@class=\"feed_menu_ic\"]");
    private static final By Delete=By.linkText("Удалить");
    @Override
    protected void check() {
        clickable(AddNote);
    }

    public void AddN(){
        $(AddNote).click();
        $(FieldForM).should(Condition.appears).sendKeys("Test");
        $(SendNote).should(Condition.visible).click();
    }

    public void DelN(){
        $(MenuNote).hover().should(Condition.visible).click();
        $(Delete).should(Condition.visible).click();
    }
}
