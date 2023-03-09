package org.example.dateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ListIterator;

public class dateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();

        Instant instant = Instant.now();
        System.out.println("Current datetime by UTC+0: " +instant.toString());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        ZoneId zoneIdVN = ZoneId.of("Asia/Ho_Chi_Minh");
        System.out.println(zonedDateTime.withZoneSameInstant(zoneIdVN));

        ZoneId zoneIdJP = ZoneId.of("Asia/Tokyo");
        System.out.println(zonedDateTime.withZoneSameInstant(zoneIdJP));

        LocalDateTime startDay = localDate.atTime(LocalTime.MIN);
        System.out.println("Start Day: "+startDay);

        LocalDateTime endDay = localDate.atTime(LocalTime.MAX);
        System.out.println("End Day: "+endDay);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("Formatter: " +formatter.format(localDateTime));
    }
}
