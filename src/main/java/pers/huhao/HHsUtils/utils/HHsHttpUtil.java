package pers.huhao.HHsUtils.utils;

import java.util.HashMap;
import java.util.Map;

public class HHsHttpUtil {

    private static final String EMPTY = "";

    public static Map<String, Object> getUrlParams(String param) {
        Map<String, Object> map = new HashMap<>();

        if (HHsStringUtil.isBlank(param)) return map;

        String[] params = param.split("&");

        for (int i = 0; i < params.length; i++) {
            String[] p = params[i].split("=");
            if (p.length == 2) {
                map.put(p[0], p[1]);
            }
        }
        return map;
    }

    public static String getUrlParamsByMap(Map<String, Object> map) {
        if (HHsObjectUtil.isNull(map)) return EMPTY;

        StringBuffer sb = new StringBuffer();

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            sb.append(entry.getKey() + "=" + entry.getValue() + "&");
        }
        String s = sb.toString();

        return s.endsWith("&") ? HHsStringUtil.substringBeforeLast(s, "&") : s;
    }
}
