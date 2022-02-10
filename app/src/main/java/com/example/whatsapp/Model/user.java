package com.example.whatsapp.Model;

public class user {
    String proflePic,userName,userEmail,userPassword,userId,lastMessage;
    public user(String proflePic, String userName, String userEmail, String userPassword, String userId, String lastMessage) {
        this.proflePic = proflePic;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userId = userId;
        this.lastMessage = lastMessage;
    }
    public user(){};


    /*public user(String proflePic, String userName, String userEmail, String userId) {
        this.proflePic = proflePic;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userId = userId;

    }*/


    public user( String userName, String userEmail, String userPassword) {

        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;

    }
public user(String proflePic){

        this.proflePic=proflePic;
}



    public String getProflePic() {
        return proflePic;
    }

    public void setProflePic(String proflePic) {
        this.proflePic = proflePic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserId(String uid) {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }



}
