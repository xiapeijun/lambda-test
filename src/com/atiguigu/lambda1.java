package com.atiguigu;

import java.util.function.Consumer;
/** 
 * @Author: xiapeijun
 * @Description       
 * @Date: 2022/1/23 2:16 PM
 * @param null:   
 * @return: null
 */
public class lambda1 {

    public static void main(String[] args) {
        Consumer<Integer> consumer = (a)  -> System.out.println(a);
        consumer.accept(1111);


    }
}
