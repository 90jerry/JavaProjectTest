package com.shuai.demo.random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        //创建对象
        Random random = new Random();
        for (int j = 0; j < 10; j++) {
            //生成0~9的随机数
            int i = random.nextInt(10);
            System.out.println("i = "+i);
        }

    }
}
