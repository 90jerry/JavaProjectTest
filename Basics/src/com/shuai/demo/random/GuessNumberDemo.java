package com.shuai.demo.random;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100)+1;
        int min = 1;
        int max = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("已随机生成了一个1~100以内的随机数，请猜测:");
        while (true){
            int data = scanner.nextInt();
            if (data == number){
                System.out.println("恭喜你猜中了，随机生成的数字 number = "+number);
                break;
            }else if (data > number){
                max = data;
                System.out.println("猜测错误，数字范围变更为"+min+"~"+max+"之间，请重新猜测：");
            }else if (data < number){
                min = data;
                System.out.println("猜测错误，数字范围变更为"+min+"~"+max+"之间，请重新猜测：");
            }
        }
    }
}
