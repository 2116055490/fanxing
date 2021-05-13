package edu.xcdq.demo01;

import edu.xcdq.demo01.Pair;

/**
 * @author xujinwei
 * @date 2021/5/11 17:14
 */
public class demo03 {
    public static void main(String[] args) {
        Pair<Integer> pair1 = new Pair<>(1,5);
        Pair<Double> pair2 = new Pair<>(1.2,4.5);
        Pair<String> pair3 = new Pair<>("dad","ddsufa");
        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);
    }
}
