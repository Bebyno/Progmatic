package services;

import dataBase.DBEngine;
import enums.Access;
import model.User;

public class AccesHandling {
    DBEngine dbEngine = new DBEngine();
    // TODO write whit premission
    // TODO delete, hide etc.


    // if user is Amdin get acces to imAdmin method.
    public void imAdmin(){
        infoRead(dbEngine.selectedUserFromDB("Will"));
        inforamtionChanges(dbEngine.selectedUserFromDB("Will"));
        //...
    }

    public void infoRead(User user){
        if(user.getAccess() == Access.ADMIN){
            System.out.println(user.getID());
            System.out.println(user.getName());
            System.out.println(user.getBirth());
            // ....
            //TODO get-terek
        }
    }

public void inforamtionChanges(User user){

    if(user.getAccess() == Access.ADMIN){    // vagy saját user adatai || this.user?
        /*
        user.setBlog();
        user.setAccess();
        */

    //TODO set-telhet
    }
}

/*public void commentWritingRight(User user){
    if(user.getAccess() == Access.USER){            // külön kezelni az írásjogot? Ha már user tud írni...
        //TODO he can write

    }
}*/
    public void modifyBlog(User user){
        if(user.getAccess() == Access.ADMIN || user.getAccess() == Access.MODERATOR ){  //user.getAccess() == Access.thisUser

            //TODO modify blog

        }
    }

public void deleteBlog(User user){
    if(user.getAccess() == Access.ADMIN || user.getAccess() == Access.MODERATOR ){  //user.getAccess() == Access.thisUser

        //TODO Delete blog

    }
}
public void CommentWrite(User user){
    if(user.getAccess() == Access.ADMIN || user.getAccess() == Access.MODERATOR ||user.getAccess() == Access.USER ){

        //TODO can write comment
    }
}


}
