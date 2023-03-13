package com.epam.utils;

import static org.apache.commons.lang3.math.NumberUtils.isCreatable;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (isCreatable(str)) {
            return false;
        }
        return !str.contains("-") && !str.equals("0") && !str.trim().equals("");
    }
}
