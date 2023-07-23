package service;

import page.PostPage;

public class PostPageService {

    PostPage postPage = new PostPage();

    public PostPageSuccessService isPostUpdate(){
        postPage.clickRatingInThePostPage().clickReasonButton().clickUpdateTo7Button();
        return new PostPageSuccessService();
    }

}
