package com.example.fragmenttutoring.domain;

import androidx.annotation.DrawableRes;

public class City {
    private final String name;
    @DrawableRes
    private final int icon;

    public City(String name, int icon) {
        this.name = name;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public int getIcon() {
        return icon;
    }
}
