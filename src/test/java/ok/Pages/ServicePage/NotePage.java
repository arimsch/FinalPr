package ok.Pages.ServicePage;

import com.codeborne.selenide.Condition;
import ok.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.*;

public class NotePage extends BasePage {
    private static final By ButtonAllNotes=By.xpath(".//div[@class='nav-side_tx ellip']");
    //for add Note
    private static final By AddNote=By.xpath(".//a[@href=\"/post\"]");
    private static final By FieldForM=By.xpath(".//div[@data-hashtags-enabled=\"1\"]");
    private static final By SendNote = By.xpath(".//div[@title=\"Поделиться\"]");
    //for Del Note
    private static final By MenuNote=By.xpath(".//div[@class=\"feed_menu_ic\"]");
    private static final By Delete=By.linkText("Удалить");
    //for Assert
    private static final By MyNote=By.xpath(".//div[@class='feed']");
    private static int count;

    @Override
    protected void check() {
        clickable(AddNote);
        clickable(ButtonAllNotes);
    }

    public void AddN(String str){
        //число заметок до теста для проверки
        count=$$(MyNote).size();
        //добавляем заметку
        $(AddNote).click();
        $(FieldForM).should(Condition.appears).sendKeys(str);
        $(SendNote).should(Condition.visible).click();
    }

    public void DelN(){
        $(MenuNote).hover().should(Condition.visible).click();
        $(Delete).should(Condition.visible).click();
    }

    public static boolean SuccessfulTestAddNote(){
        $(ButtonAllNotes).click();
        //сравниваем число заметок до и после теста
        if($$(MyNote).size()-count>0)
        return true;
        else return false;
    }
}
