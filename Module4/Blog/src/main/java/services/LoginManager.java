package services;

import dataBase.DBEngine;
import enums.Role;
import model.User;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginManager {
    private User currentUser;
    private DBEngine dbEngine;

    public LoginManager(DBEngine dbEngine) {
        this.dbEngine = dbEngine;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    // olyan függvény enforce minimum role, azaz, ha számokat használsz lehet nagyságot állítani, ezért ha beengedi a moderátort
    // akk beengedi az admin


    public User login(String username, String pass){
        return currentUser = dbEngine.login(username,pass);



    }
}

