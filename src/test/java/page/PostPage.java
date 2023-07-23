package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PostPage {

    private static final String RATING_IN_POST_PAGE = "//div[@class='buttons hdas-addons is-hidden-touch']/button[text()=' 7 ']";

    private static final String REASON_BUTTON = "//button[contains(text(), 'family')]";

    private static final String UPDATE_TO_7_BUTTON = "//a[text()=' Update to 7']";

    public PostPage clickRatingInThePostPage(){
        $(By.xpath(RATING_IN_POST_PAGE)).click();
        return new PostPage();
    }

    public PostPage clickReasonButton(){
        $(By.xpath(REASON_BUTTON)).click();
        return new PostPage();
    }

    public void clickUpdateTo7Button(){
        $(By.xpath(UPDATE_TO_7_BUTTON)).click();
    }
}
