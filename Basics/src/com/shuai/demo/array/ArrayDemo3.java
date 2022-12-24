package com.shuai.demo.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //求和
        int[] money = {16,26,36,6,100};
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println("总销售额是: "+sum);

        //求最值
        int[] appearance = {15,000,10000,20000,9500,-5};
        int max = appearance[0];
        for (int i = 0; i < appearance.length; i++) {
            max = Math.max(max,appearance[i]);
        }
        System.out.println("最大的数值为："+max);
    }
}
