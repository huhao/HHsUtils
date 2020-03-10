package pers.huhao.HHsUtils.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class HHsTimeUtil {

    public static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";

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

    public static long getUnixTimestamp() {
        return ts();
    }

    public static long ts() {
        return Instant.now().getEpochSecond();
    }
}
