package edu.xcdq.demo04;

import java.util.List;

/**
 * @author xujinwei
 * @date 2021/5/11 18:15
 */
public class Canvas {
    public void hua(Shape s){
        s.draw();
    }

        //有限制的泛型使用
        //？extends Shape 泛值的上限
        public void huaAll(List<? extends Shape>shapeList){
            for(Shape s:shapeList){
                s.draw();
            }
    }
}
