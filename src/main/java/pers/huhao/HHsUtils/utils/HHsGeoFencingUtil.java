package pers.huhao.HHsUtils.utils;


/**
 * 迟赤道半径，6378.137km
 * 地球平均半径，6371.393km
 *
 * 360°=2π
 *
 * 球面距离公式: S=R·arc cos[cosβ1cosβ2cos（α1-α2）+sinβ1sinβ2]
 *
 * @author HH君
 */

public class HHsGeoFencingUtil {

    private final static double RE = 6371.393;

    /**
     * 根据经纬度获取两点之间的距离
     * @param lng1 经度1
     * @param lat1 纬度1
     * @param lng2 经度2
     * @param lat2 纬度2
     * @return distance （单位:米）
     */
    public static double distance(double lng1, double lat1, double lng2, double lat2) {

        lng1 = Math.toRadians(lng1);
        lat1 = Math.toRadians(lat1);

        lng2 = Math.toRadians(lng2);
        lat2 = Math.toRadians(lat2);

        double cos = Math.cos(lat1) * Math.cos(lat2) * Math.cos(lng1 - lng2)
                + Math.sin(lat1) * Math.sin(lat2);
        double acos = Math.acos(cos);
        double distance = RE * acos * 1000;

        return HHsDoubleUtil.getDecimalData(distance);
    }


    /**
     * 圆形区域
     * @param radius 半径
     * @param lng1 经度1
     * @param lat1 纬度1
     * @param lng2 经度2
     * @param lat2 纬度2
     * @return boolean 是否圆形区域内
     */
    public static boolean isInCircle(double radius, double lng1, double lat1, double lng2, double lat2) {
        double dis = distance(lng1, lat1, lng2, lat2);
        return dis < radius;
    }
}
