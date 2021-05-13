package edu.xcdq.demo02;

/**
 * @author xujinwei
 * @date 2021/5/11 17:28
 */
public class Tools {
    public static String getMiddle(String[] a) {
        return  a [a.length/2];
    }
    public static <T> T getMiddle(T [] a){
        return a [a.length/2];
    }
}
