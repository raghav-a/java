package com.directi.enums;

public class SimpleExample {
    enum Season {
        SUMMER, MONSOON, WINTER
    }

    public Season getNextSeason(Season season) {
        switch (season) {
            case SUMMER:
                return Season.MONSOON;
            case MONSOON:
                return Season.WINTER;
            default:
                return Season.SUMMER;
        }
    }
}
