/**
 * @(#)StringUtils.java, Jun 15, 2013. 
 * 
 */
package com.cloudstone.emenu.util;

/**
 * @author xuhongfeng
 *
 */
public class StringUtils {
    
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
    
    public static boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }
}
