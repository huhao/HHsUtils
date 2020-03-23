package pers.huhao.HHsUtils.utils;

public class HHsIntegerUtil {

    public static int get(String in) {
        try {
            return Integer.parseInt(in);
        } catch (Exception e) {
            return 0;
        }
    }

}
