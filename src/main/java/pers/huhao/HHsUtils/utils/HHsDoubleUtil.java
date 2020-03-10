package pers.huhao.HHsUtils.utils;

import java.text.DecimalFormat;

public class HHsDoubleUtil {

    public static double getDecimalData(double in) {
        DecimalFormat df = new DecimalFormat("0.00");
        return Double.valueOf(df.format(in));
    }
}
