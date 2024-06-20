package com.khpl.uzikdiary.entity.diary;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate date;

    private int yr;
    private int monthValue;
    private int dayOfMonth;

    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;

    private String title;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String content;

    @Enumerated(EnumType.STRING)
    private Feel feel;

    @Enumerated(EnumType.STRING)
    private Weather weather;

    @Builder
    public Diary(LocalDate date, int yr, DayOfWeek dayOfWeek, int dayOfMonth, int monthValue, String title,
                 String content, Feel feel, Weather weather) {
        this.date = date;
        this.yr = yr;
        this.monthValue = monthValue;
        this.dayOfMonth = dayOfMonth;
        this.dayOfWeek = dayOfWeek;
        this.title = title;
        this.content = content;
        this.feel = feel;
        this.weather = weather;
    }
}
