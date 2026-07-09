package com.itheima.Demo;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

    //猜数字小游戏
    static void main() {
        guess();

    }
    public static void guess() {
        Scanner sc = new Scanner(System.in);
     // int number = (int)(Math.random()*100+1);
        Random r = new Random();
        int number = r.nextInt(100)+1;
        while(true){
            System.out.println("请输入数字:");
            int input = sc.nextInt();
            if(input > number){
                System.out.println("数字太大了");
            }else if(input < number){
                System.out.println("数字太小了");
            }else{
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
