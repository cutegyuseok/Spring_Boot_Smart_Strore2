package com.example.bootstore.user.DTO;

public class userDTO {
    private String userID;
    private String userStoreName;
    private String userEmail;
    private String userName;

    @Override
    public String toString() {
        return "userDTO{" +
                "userID='" + userID + '\'' +
                ", userStoreName='" + userStoreName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserStoreName() {
        return userStoreName;
    }

    public void setUserStoreName(String userStoreName) {
        this.userStoreName = userStoreName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public userDTO(String userID, String userStoreName, String userEmail, String userName) {
        this.userID = userID;
        this.userStoreName = userStoreName;
        this.userEmail = userEmail;
        this.userName = userName;
    }
}
