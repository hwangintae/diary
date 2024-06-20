package com.khpl.uzikdiary.entity.diary;

import lombok.Getter;

@Getter
public enum Weather {
    HOT("더움"),
    WARM("따듯함"),
    COLD("추움"),
    COOL("시원함"),
    SUNNY("화창함"),
    RAINY("비옴"),
    CLEAR("청명함"),
    CLOUDY("구름낀"),
    DRY("건조함"),
    HUMID("습함"),
    FOGGY("안개낀"),
    GUSTY("돌풍"),
    WINDY("바람"),
    THUNDER("천둥"),
    LIGHTNING("번개");

    private final String text;

    Weather(String text) {
        this.text = text;

    }


}
