package com.shuai.demo;

public class Demo2 {
    public static void main(String[] args) {
        //计算一个数的算数平方根，并返回此平方根。只保留整数部分

        int number = 101;
        int i = 1;
        int result = 1;
        while (result <= number){
            i++;
            result = i*i;
            System.out.println(i);
        }
        System.out.println(number+"算数平方根为"+(i-1));
    }
}
