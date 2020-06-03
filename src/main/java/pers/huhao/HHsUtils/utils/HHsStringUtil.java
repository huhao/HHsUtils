package pers.huhao.HHsUtils.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HHsStringUtil {

    public static final int INDEX_NOT_FOUND = -1;

    public static String get(Object in) {
        return in == null ? "" : String.valueOf(in);
    }

    public static boolean isEmpty(final String str) {
        return str == null || str.length() == 0;
    }

    public static String substringBeforeLast(final String str, final String separator) {
        if (isEmpty(str) || isEmpty(separator)) {
            return str;
        }
        final int pos = str.lastIndexOf(separator);
        if (pos == INDEX_NOT_FOUND) {
            return str;
        }
        return str.substring(0, pos);
    }

    public static String getBlankStr() {
        return "";
    }

    /**
     * 拿来主义
     */

    public static boolean isBlank(final String s) {
        return s == null || s.trim().isEmpty();
    }

    public static boolean isNotBlank(final String s) {
        return !isBlank(s);
    }


}
