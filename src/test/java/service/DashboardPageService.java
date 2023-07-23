package service;

import page.DashboardPage;

public class DashboardPageService {

    DashboardPage dashboardPage = new DashboardPage();

    public boolean sendRatingToPost(int ratingPosition, String rating) {
        return dashboardPage
                .setupRating(ratingPosition, rating)
                .clickUpdateButton(ratingPosition)
                .isPostUpdateSuccessDisplayed();
    }

    public boolean deletePost(int numberPost){
        return dashboardPage.clickDeleteButton(numberPost).isPostDeleteSuccessDisplayed();
    }

}
