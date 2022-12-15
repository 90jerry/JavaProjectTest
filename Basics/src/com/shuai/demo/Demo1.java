package com.shuai.demo;

public class Demo1 {
    public static void main(String[] args) {
        //0~100以内的整数，逢7过（包含7或者7的倍数）

        //需要满足其中一个条件： 个位7、十位7、7的倍数
        for (int i = 1; i <= 100; i++) {
            if ((i % 7)==0 || (i/10)==7 || (i % 10)==7){
                System.out.println("符合逢七过的规律："+i);
            }
            continue;
        }
    }
}
