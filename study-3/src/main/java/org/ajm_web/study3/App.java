package org.ajm_web.study3;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.stream.LongStream;

/**
 * Hello world!
 */
public class App {
    private static boolean isMondayAnd1stOfMonth(LocalDateTime d){
        return d.getDayOfMonth() == 1
            && d.getDayOfWeek().equals(DayOfWeek.SUNDAY);
    }

    public static void main(String[] args) {

        LocalDateTime start = LocalDateTime.of(1901,  1,  1, 0, 0, 0);
        LocalDateTime end   = LocalDateTime.of(2000, 12, 31, 0, 0, 0);
        long days = Duration.between(start, end).toDays();

        long answer = LongStream.range(0, days)
                .mapToObj(start::plusDays)
                .filter(App::isMondayAnd1stOfMonth)
                .count();

        assert answer == 171;

    }
}
