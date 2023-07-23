package test;

import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.DashboardPage;
import page.LoginPage;
import service.LoginPageService;

public class MoodPandaTest extends BaseTest{

    private LoginPageService loginPageService;


    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test
    public void moodTest(){
        User user = new User("liliya.yunusova.spare@gmail.com", "12345678");
        final int RATING_POSITION = 1;
        final String RATING = "1";
        boolean isRatingUpdate = loginPageService
                .login(user)
                .editPost()
                .sendRatingToPost(1,"1");
        Assert.assertTrue(isRatingUpdate, "Rating is not update");
    }

    @Test
    public void updatePost(){
        User user = new User("liliya.yunusova.spare@gmail.com", "12345678");
        boolean isPostUpdate = loginPageService.login(user)
                .postUpdateButtonClick().isPostUpdate().isMessageSuccessPostUpdate();
        Assert.assertTrue(isPostUpdate, "Post is not update");
    }

    @Test
    public void deletePost(){
        User user = new User("liliya.yunusova.spare@gmail.com", "12345678");
        int numberPost = 1;
        boolean isPostDelete = loginPageService.login(user).editPost().deletePost(numberPost);
        Assert.assertTrue(isPostDelete);
    }

}
