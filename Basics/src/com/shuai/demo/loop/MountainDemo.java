package com.shuai.demo.loop;

/**
 * 世界上最高的山峰，8848.6m = 8848860mm
 * 假如有一张足够大的纸，厚度为0.1 mm,请问需要折叠多少次，能达到珠穆朗玛峰的高度。
 */
public class MountainDemo {
    public static void main(String[] args) {
        double paper = 0.1;
        double mountain = 8848860;
        int count = 0;
        while (paper < mountain){
            paper = paper*2;
            count++;
        }
        System.out.println("count = " + count);
    }
}
