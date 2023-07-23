package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FeedGlobalPage {

    private static final String EDIT_POST = "//aside[contains(@class, 'column')]//a[contains(@href, 'mydata')]";

    private static final String POST_UPDATE = "//div[@class = 'buttons']/a[@href = '/post']";

    public DashboardPage clickEditPostLink(){
        $(By.xpath(EDIT_POST)).click();
        return new DashboardPage();
    }

    public void clickPostUpdateButton(){
        $(By.xpath(POST_UPDATE)).click();
    }

}
