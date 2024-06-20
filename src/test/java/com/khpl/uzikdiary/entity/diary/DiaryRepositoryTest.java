package com.khpl.uzikdiary.entity.diary;

import com.khpl.uzikdiary.exception.NotFoundException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("local")
//@Transactional
class DiaryRepositoryTest {

    @Autowired
    private DiaryRepository diaryRepository;

    @Test
    @DisplayName("diary 저장")
    void save() {
        // given
        LocalDate now = LocalDate.now();
        Diary diary = Diary.builder()
                .date(now)
                .yr(now.getYear())
                .monthValue(now.getMonthValue())
                .dayOfMonth(now.getDayOfMonth())
                .dayOfWeek(now.getDayOfWeek())
                .title("첫 일기")
                .content("오늘 처음 일기 쓴다.")
                .feel(Feel.HAPPY)
                .weather(Weather.HOT)
                .build();

        // when
        diaryRepository.save(diary);

        // then
        Diary result = diaryRepository.findById(diary.getId())
                .orElseThrow(NotFoundException::new);

        assertThat(result).extracting("date", "yr", "monthValue", "dayOfMonth", "dayOfWeek", "title", "content", "feel", "weather")
                .contains(now, now.getYear(), now.getMonthValue(), now.getDayOfMonth(), now.getDayOfWeek(), "첫 일기", "오늘 처음 일기 쓴다.", Feel.HAPPY, Weather.HOT)
        ;


    }

}