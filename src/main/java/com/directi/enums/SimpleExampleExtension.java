package com.directi.enums;

public class SimpleExampleExtension {
    enum Season {
        SUMMER("summer"), MONSOON("monsoon"), WINTER("winter");

        private final String seasonName;

        Season(String seasonName) {
            this.seasonName = seasonName;
        }

        public static SimpleExample.Season getByName(String seasonName) {
            if (SUMMER.seasonName.equalsIgnoreCase(seasonName)) {
                return SimpleExample.Season.SUMMER;
            } else {
                return SimpleExample.Season.WINTER;
            }
        }
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