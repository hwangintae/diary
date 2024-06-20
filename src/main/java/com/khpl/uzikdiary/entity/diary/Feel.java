package com.khpl.uzikdiary.entity.diary;

import lombok.Getter;

@Getter
public enum Feel {
    HAPPY("행복한"),
    SAD("슬픔"),
    ANGRY("화남"),
    GLOOMY("우울함");

    private final String text;

    Feel(String text) {
        this.text = text;
    }
}
