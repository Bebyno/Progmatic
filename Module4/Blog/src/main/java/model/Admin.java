package model;

import dataBase.DBEngine;
import enums.Access;
import services.AccesHandling;

import java.util.Date;

public class Admin extends User{
    public Admin(Integer id, String name, String password, String email, Date birth, Access access) {
        super(id, name, password, email, birth, access);
    }

    DBEngine dbEngine = new DBEngine();
    AccesHandling accesHandling = new AccesHandling();

    public void getInformation(){
    accesHandling.infoRead(dbEngine.selectedUserFromDB("Will"));
    }

// hogy kezeled, ha valaki user class-ban van és upgradelnéd Modifier-be? class cserélni? ---Valszeg ez nem a jó megoldás







}
