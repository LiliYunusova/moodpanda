package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class PostSuccessPage {

    private static final String POST_SUCCESS_MESSAGE = "//p[text()='Mood updated']";

    public boolean isPostSuccessMessageDisplayed(){
        return  $(By.xpath(POST_SUCCESS_MESSAGE)).shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
    }
}
