/**
 * @(#)Const.java, Jun 1, 2013. 
 * 
 */
package com.cloudstone.emenu.constant;

/**
 * @author xuhongfeng
 *
 */
public class Const {
    public static final String PARAM_WEB_HOME_DIR = "emenu.home";
    public static final String PARAM_TOMCAT_HOME = "tomcat.home";
    public static final String PARAM_CLOUDSTONE_DATA_DIR = "cloudstone.data.dir";
    public static final String PARAM_DB_FILE = "cloudstone.db";
    
    public static class UserType {
        public static final int USER = 0;
        public static final int ADMIN = 1;
        public static final int SUPER_USER = 2;
        
        //for velocity
        public int getUSER() {
            return USER;
        }
        public int getADMIN() {
            return ADMIN;
        }
        public int getSUPER_USER() {
            return SUPER_USER;
        }
    }
    
    public static class TableType {
        public static final int ROOM = 0;//包间
        public static final int HALL = 1;//散台
        public static final int BOOTH = 2;//卡座
        
        public static final int SQUARE = 0;//方桌
        public static final int ROUNT = 1;//圆桌
    }
    
    public static class TipMode {//服务费收取模式
        public static final int NONE = 0;//无服务费
        public static final int FIXED = 1;//固定值
        public static final int PERCENTAGE = 2;//按比例
    }
    
    public static class DishType {
        public static final int HOT = 0; //热菜
        public static final int COLD = 1; //凉菜
        public static final int DRINK = 2; //饮料
        public static final int SPECIAL = 3; //特色菜
    }
    
    public static class DishUnit {
        public static final int JIN = 0; // 斤
        public static final int FEN = 1; // 份
    }
}
