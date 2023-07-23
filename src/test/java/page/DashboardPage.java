package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {

    private static final String RATING_SELECT = "//td//select";
    private static final String UPDATE_BUTTON = "//button[contains (@class, 'is-outdlined')]";
    private static final String POST_UPDATED_SUCCESS_MESSAGE = "//*[contains(text(),'Post updated')]";

    private static final String DELETE_POST_BUTTON = "//button[contains (@class, ' is-outlined')]";

    private static final String DELETE_POST_SUCCESS_MESSAGE = "//*[contains(text(),'Post deleted')]";


    public DashboardPage setupRating(int ratingPosition, String rating) {
        $$(By.xpath(RATING_SELECT)).get(ratingPosition).selectOptionByValue(rating);
        return this;
    }

    public DashboardPage clickUpdateButton(int ratingPosition) {
        $$(By.xpath(UPDATE_BUTTON)).get(ratingPosition).click();
        return this;
    }

    public boolean isPostUpdateSuccessDisplayed() {
        return $(By.xpath(POST_UPDATED_SUCCESS_MESSAGE)).shouldBe(Condition.visible, Duration.ofSeconds(20)).isDisplayed();
    }

    public DashboardPage clickDeleteButton(int postNumber) {
        $$(By.xpath(DELETE_POST_BUTTON)).get(postNumber).click();
        return this;
    }

    public boolean isPostDeleteSuccessDisplayed() {
        return $(By.xpath(DELETE_POST_SUCCESS_MESSAGE)).shouldBe(Condition.visible, Duration.ofSeconds(20)).isDisplayed();
    }
}
