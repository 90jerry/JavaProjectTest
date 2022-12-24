package com.shuai.demo.loop;

import java.util.Scanner;

/**
 * 系统密码是520，请用户不断的输入密码验证，验证不对输出密码错误；验证成功输出欢迎进入系统，并停止程序
 */
public class PasswordVerifiedDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入三位数的密码:");
            int password = scanner.nextInt();
            if (password == 520){
                System.out.println("密码验证成功，欢迎进入系统");
                break;
            }
            System.out.println("对不起，密码输入错误，请重新输入！！！");
        }

    }
}
