package java0404.staticsample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    public static String getCurrentDate() {
        String localDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd.HH:mm:ss"));
        return localDate;
    }
    public static String getCurrentDate(String Pattern) {
        String localDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern(Pattern));
        return localDate;
    }
    public static String getCurrentMonth() {
        String localDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM"));
        return localDate;
    }
}
