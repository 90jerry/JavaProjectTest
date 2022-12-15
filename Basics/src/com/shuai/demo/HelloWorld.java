package com.shuai.demo;

public class HelloWorld<x> {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }

        int j = 0;
        while (j<5){
            System.out.println("Hello while");
            j++;
        }



        //回文数
        int x = 101;
        int temp = x;
        int num = 0;
        int number = 0;
        while(x != 0){
            //取模获取余数
            number = x % 10;
            System.out.println("当前x的值="+x);
            //取商获取除数
            x = x / 10 ;

            //将当前获取的数字拼接到最右边
            num = num * 10 + number;
        }

        System.out.println("num =="+num);
        if (num == temp){
            System.out.println(temp+"是回文数");
        }

    }


}
