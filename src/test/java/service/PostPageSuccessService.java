package service;

import page.PostSuccessPage;

public class PostPageSuccessService {
    PostSuccessPage postSuccessPage = new PostSuccessPage();

    public boolean isMessageSuccessPostUpdate(){
        return postSuccessPage.isPostSuccessMessageDisplayed();
    }
}
