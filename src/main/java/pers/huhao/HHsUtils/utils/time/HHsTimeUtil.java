package pers.huhao.HHsUtils.utils.time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class HHsTimeUtil {

    public static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";

    private static final String DEFAULT_TIME_ZONE = "+8";

    /**
     * 将时间戳转为字符串
     * <p>格式为 yyyy-MM-dd HH:mm:ss</p>
     * @param second 秒级时间戳
     * @return 时间字符串
     */
    public static String second2String(long second) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DEFAULT_PATTERN);
        return formatter.format(LocalDateTime.ofInstant(Instant.ofEpochSecond(second),ZoneId.systemDefault()));
    }

    /**
     * 获取当天0点的时间戳
     */
    public static Integer getTodayStart() {
        return (int) LocalDateTime.of(LocalDate.now(), LocalTime.MIN).toEpochSecond(ZoneOffset.of(DEFAULT_TIME_ZONE));
    }

    public static Integer getTodayEnd() {
        return (int) LocalDateTime.of(LocalDate.now(), LocalTime.MAX).toEpochSecond(ZoneOffset.of(DEFAULT_TIME_ZONE));
    }

    public static long getUnixTimestamp() {
        return ts();
    }

    public static long ts() {
        return Instant.now().getEpochSecond();
    }

    public static void main(String[] args) {
        System.out.println(getTodayStart());
    }
}
