package com.bvan.oop.lessons7_8.enum_example;

public enum Genre {
    COMEDY(10),
    ACTION(8),
    HORROR(7),
    THRILLER(7),
    DRAMA(5),
    SCI_FI(7);

    private final int likeLevel;

    Genre(int likeLevel) {
        this.likeLevel = likeLevel;
    }

    public String getShortName() {
        return name().substring(0, 3).toLowerCase();
    }

    public int getLikeLevel() {
        return likeLevel;
    }
}
