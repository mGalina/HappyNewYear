package com.example.happy_new_year;

public class ScreenItem {

    private final int Title;
    private final int Description;
    private final int ScreenImg;

    public ScreenItem(int title, int description, int screenImg) {
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }

    public int getTitle() {
        return Title;
    }

    public int getDescription() {
        return Description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }
}