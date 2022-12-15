package com.shuai.demo.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("请您输入年龄");
        //学会使用键盘录入技术
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("请您输入姓名：");
        String name = scanner.next();

        System.out.println("输入的年龄age = "+age);


    }
}
