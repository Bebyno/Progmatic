package services;

import Exceptions.NotAuthorizedException;
import dataBase.DBEngine;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import javax.ejb.Local;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserManagerTest {
    DBEngine dbEngine;
    LoginManager loginManager;
    UserManager userManager;


    @BeforeEach
    void init() {
        dbEngine = new DBEngine();
        loginManager = new LoginManager(dbEngine);
        userManager = new UserManager(loginManager, dbEngine);
    }

    @Test
    public void testExceptionOnNoLogin() throws NotAuthorizedException {

        Exception exception = assertThrows(NotAuthorizedException.class, () -> {
            userManager.getUserInfo("Will");
        });

    }

    @Test
    public void testExceptionOnAccessingOtherUsersDataAsNonAdmin() throws NotAuthorizedException {

        loginManager.login("Johan", "admin");

        Exception exception = assertThrows(NotAuthorizedException.class, () -> {
            userManager.getUserInfo("Will");
        });

    }

    @Test
    public void testNoExceptionOnAccessingOtherUsersDataAsAdmin() throws NotAuthorizedException {

        loginManager.login("Leader", "Admin");

        userManager.getUserInfo("Will");

    }

    @Test
    public void testNoExceptionOnAccessingOwnData() throws NotAuthorizedException {

        loginManager.login("Will", "12345");

        userManager.getUserInfo("Will");

    }

    @Test
    public void testLoginFail() throws NotAuthorizedException {

        Exception exception = assertThrows(NotAuthorizedException.class, () -> {
            loginManager.login("Will", "aaa");
        });

    }

    @Test
    public void testChangeUserEmailAsAdmin() throws NotAuthorizedException {
        loginManager.login("Leader", "Admin");
        String actual = "Will@freemail.com";

        Assert.assertEquals(actual, userManager.changeUserInfo("Will").getEmail());

    }

    @Test
    public void testChangeUserEmailInfoAsOwn() throws NotAuthorizedException {
        loginManager.login("Will", "12345");
        String actual = "Will@freemail.com";

        Assert.assertEquals(actual, userManager.changeUserInfo("Will").getEmail());

    }

    @Test
    public void testChangeUserEmailInfoAsAnauthorizedUser() throws NotAuthorizedException {
        loginManager.login("Johan", "admin");
        String actual = "Will@freemail.com";

        Exception exception = assertThrows(NotAuthorizedException.class, () -> {
            userManager.changeUserInfo("Will");

        });

    }

    @Test
    public void testChangeUserBirthAsAdmin() throws NotAuthorizedException {
        loginManager.login("Leader", "Admin");
        LocalDate actual = LocalDate.of(1991, 01, 01);

        Assert.assertEquals(actual, userManager.changeUserInfo("Will").getBirth());

    }

    @Test
    public void testChangeUserBirthInfoAsOwn() throws NotAuthorizedException {
        loginManager.login("Will", "12345");
        LocalDate actual = LocalDate.of(1991, 01, 01);

        Assert.assertEquals(actual, userManager.changeUserInfo("Will").getBirth());

    }

    @Test
    public void testChangeUserBirthInfoAsAnauthorizedUser() throws NotAuthorizedException {
        loginManager.login("Johan", "admin");
        LocalDate actual = LocalDate.of(1991, 01, 01);

        Exception exception = assertThrows(NotAuthorizedException.class, () -> {
            userManager.changeUserInfo("Will");

        });

    }

    @Test
    public void testmodifyBlogEntrysAsModerator() throws NotAuthorizedException {
        loginManager.login("Johan", "admin");

        String actual = "TRalala";
        Assert.assertEquals(actual, userManager.modifyBlogEntrys("Will", "cats", 1,"TRalala").getText());

    }


    @Test
    public void testmodifyBlogEntrysAsAdmin() throws NotAuthorizedException {
        loginManager.login("Leader", "Admin");

        String actual = "TRalala";
        Assert.assertEquals(actual, userManager.modifyBlogEntrys("Will", "cats", 1,"TRalala").getText());

    }

    @Test
    public void testmodifyBlogEntrysAsOwn() throws NotAuthorizedException {
        loginManager.login("Will", "12345");

        String actual= "TRalala";
        Assert.assertEquals(actual,userManager.modifyBlogEntrys("Will","cats",1,"TRalala").getText());

    }

    @Test
    public void testmodifyBlogEntrysAsUser() throws NotAuthorizedException {
        loginManager.login("Boldizsar", "asdasd");

        Exception exception = assertThrows(NotAuthorizedException.class, () -> {
            userManager.modifyBlogEntrys("Will","cats",1,"TRalala");

        });

    }

    @Test
    public void testdeleteBlogEntrysAsAdmin() throws NotAuthorizedException {
        loginManager.login("Leader", "Admin");


        Assert.assertEquals(2,userManager.deleteBlogEntrys("Will","cats",1).size());

    }

    @Test
    public void testdeleteBlogEntrysAsModerator() throws NotAuthorizedException {
        loginManager.login("Johan", "admin");


        Assert.assertEquals(2,userManager.deleteBlogEntrys("Will","cats",1).size());

    }
    @Test
    public void testdeleteBlogEntrysAsOwn() throws NotAuthorizedException {
        loginManager.login("Will", "12345");


        Assert.assertEquals(2,userManager.deleteBlogEntrys("Will","cats",1).size());

    }
    @Test
    public void testdeleteBlogEntrysAsUser() throws NotAuthorizedException {
        loginManager.login("Boldizsar", "asdasd");


        Exception exception = assertThrows(NotAuthorizedException.class, () -> {
            userManager.deleteBlogEntrys("Will","cats",1);

        });
    }
    @Test
    public void testcommentWriteUser() throws NotAuthorizedException {
        loginManager.login("Will", "12345");


        Assert.assertEquals(3,userManager.commentWrite(1,"cats").size());

    }

}




