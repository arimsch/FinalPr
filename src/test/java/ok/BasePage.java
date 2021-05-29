package ok;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

abstract public class BasePage {

    public BasePage() {
        check();
    }
    protected abstract void check();

    private static final Condition clickable = Condition.and("can be clicked", Condition.visible, Condition.enabled);

    public void clickable(By locator) {
        $(locator).shouldBe(clickable);
    }


}
