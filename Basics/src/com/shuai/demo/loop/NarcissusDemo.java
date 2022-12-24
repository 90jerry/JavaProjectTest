package com.shuai.demo.loop;

/**
 * 水仙花数
 * 要求：
 *  1、三位数
 *  2、个位、十位、百位的数字立方和等于原数
 */
public class NarcissusDemo {

    public static void main(String[] args) {
        int bits = 0;
        int ten = 0;
        int hundred = 0;
        for (int i = 100; i < 1000; i++) {
            //获取位阶上的数字
            bits = i % 10;
            ten = i / 10 % 10;
            hundred = i / 100;
            //第一种方式：Math提供的方法函数 pow，第一个参数为底数，第二个参数为幂数。常用来返回 次方数
            if ((Math.pow(bits,3)+Math.pow(ten,3)+Math.pow(hundred,3))==i){
                System.out.print(i+" ");
            }
            //第二种方式：if判断
            if ((bits*bits*bits+ten*ten*ten+hundred*hundred*hundred) == i){
                System.out.print(i+" ");
            }
        }
    }
}
