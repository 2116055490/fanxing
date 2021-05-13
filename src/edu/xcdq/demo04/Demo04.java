package edu.xcdq.demo04;

import java.util.ArrayList;

/**
 * @author xujinwei
 * @date 2021/5/11 18:18
 */
public class Demo04 {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        Circle circle = new Circle();
        canvas.hua(circle);

        //要画的各种图形
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();
        //准备一个列表，一次传入多个对象
        ArrayList<Shape> list = new ArrayList<>();
        //加入到要执行的列表中
        list.add(circle1);
        list.add(circle2);
        list.add(rectangle);
        list.add(rectangle1);
        //执行批量操作
        canvas.huaAll(list);
    }
}
