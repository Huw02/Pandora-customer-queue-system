package org.example.pandoracustomerqueuesystem.model;

public class User {
    private String name;
    private String gender;
    private String hat;
    private String hair;
    private String top;
    private String bottom;
    private String language;
    private String comment;
    private int userId;

    public User(String name, String gender, String hat, String hair, String top, String bottom, String language, String comment, int userId) {
        this.name = name;
        this.gender = gender;
        this.hat = hat;
        this.hair = hair;
        this.top = top;
        this.bottom = bottom;
        this.language = language;
        this.comment = comment;
        this.userId = userId;
    }

    public User(){

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
