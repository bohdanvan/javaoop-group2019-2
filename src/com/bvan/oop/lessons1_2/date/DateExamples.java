package com.bvan.oop.lessons1_2.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * @author bvanchuhov
 */
public class DateExamples {

    public static void main(String[] args) {
        // Java 8
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //---

        LocalDate elvisBirthDate = LocalDate.of(1935, 1, 18);
        DayOfWeek dayOfWeek = elvisBirthDate.getDayOfWeek();
        System.out.println(dayOfWeek.getValue());

        LocalDate dostoevskyBirthDate = LocalDate.of(1821, Month.OCTOBER, 30);

//        LocalDate birthDate2 = dostoevskyBirthDate.plusYears(1);

        long days = ChronoUnit.DAYS.between(dostoevskyBirthDate, elvisBirthDate);

        System.out.println(days);
    }
}
