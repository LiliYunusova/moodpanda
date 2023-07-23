package service;

import page.FeedGlobalPage;

public class FeedGlobalPageService {

    FeedGlobalPage feedGlobalPage = new FeedGlobalPage();

    public DashboardPageService editPost(){
        feedGlobalPage.clickEditPostLink();
        return new DashboardPageService();
    }

    public PostPageService postUpdateButtonClick(){
        feedGlobalPage.clickPostUpdateButton();
        return new PostPageService();
    }

}
