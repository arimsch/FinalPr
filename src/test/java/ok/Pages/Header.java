package ok.Pages;

import ok.BasePage;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class Header extends BasePage {
    public Header(){
        super();
    }

    @Override
    protected void check() {

    }

    public enum Button{
        Messages(By.xpath(".//li[contains(@data-l,'mess')]")),
        Discussions(By.xpath(".//li[contains(@data-l, 'discussions')]")),
        Notifications(By.xpath(".//li[contains(@data-l, 'not')]")),
        Friends(By.xpath(".//li[contains(@data-l, 'friends')]")),
        Guests(By.xpath(".//li[contains(@data-l, 'guests')]")),
        Marks(By.xpath(".//li[contains(@data-l, 'marks')]')]")),
        Video(By.xpath("//li[contains(@data-l, 'video')]")),
        Music(By.xpath(".//li[contains(@data-l, 'music')]"));

        private final By locator;
        Button(By locator) {
            this.locator = locator;
        }

        public By getLocator(){ return locator;}

        public static void click(Button but){
            $(but.getLocator()).click();
        }
    }
}
