package services;

import Exceptions.NotAuthorizedException;
import enums.Role;
import model.User;

import java.util.List;

public class UserManager {
private LoginManager loginManager;

    public UserManager(LoginManager loginManager) {
        this.loginManager = loginManager;
    }


    //itt lesz az admin és  a hívogatás (ellenörzések)

    // tesztre meghívód ezeket a függvénykeet amkiet írsz

    public List<User> getAllUserInfo() throws NotAuthorizedException {
        User currentuser = this.loginManager.getCurrentUser();
        if(currentuser == null ||currentuser.getRole() != Role.ADMIN){
            throw new NotAuthorizedException();
        }

return null;
    }


}
