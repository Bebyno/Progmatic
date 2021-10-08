package services;

import Exceptions.NotAuthorizedException;
import dataBase.DBEngine;
import model.User;


public class LoginManager {
    private User currentUser;
    private DBEngine dbEngine;

    public LoginManager(DBEngine dbEngine) {
        this.dbEngine = dbEngine;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public User login(String username, String pass) throws NotAuthorizedException{
        currentUser = dbEngine.login(username,pass);

        if (currentUser == null)
            throw new NotAuthorizedException();

        return currentUser;
    }
}

