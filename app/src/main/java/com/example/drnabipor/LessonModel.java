package com.example.drnabipor;

public class LessonModel {

    private int avatar;
    private String Number;
    private String Title;

    public LessonModel(int avatar, String number, String title) {
        this.avatar = avatar;
        Number = number;
        Title = title;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
