package pers.huhao.HHsUtils.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class HHsDoubleUtil {

    public static String getPretty(Object in) {

        String inStr = String.valueOf(in);
        try {
            return BigDecimal.valueOf(Double.parseDouble(inStr)).stripTrailingZeros().toPlainString();
        } catch (Exception e) {
            return HHsStringUtil.getBlankStr();
        }
    }

    public static double getDecimalData(double in) {
        DecimalFormat df = new DecimalFormat("0.00");
        return Double.valueOf(df.format(in));
    }
}
