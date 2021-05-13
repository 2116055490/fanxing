package edu.xcdq.demo02;

/**
 * @author xujinwei
 * @date 2021/5/11 17:31
 */
public class Demo03 {
    public static void main(String[] args) {
        Integer [] a = {12,23,344,54,56};
        System.out.println(Tools.getMiddle(a));

        String [] str = {"ads","fef","feee","err"};
        System.out.println(Tools.getMiddle(str));

        Boolean [] b = {true,false,true,false};
        System.out.println(Tools.getMiddle(b));
    }
}
