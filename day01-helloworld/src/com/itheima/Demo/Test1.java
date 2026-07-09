package com.itheima.Demo;

import java.util.Scanner;

public class Test1 {
    static void main() {
        //简易版计算器
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        double a = sc.nextDouble();
        System.out.println("请输入第二个数字:");
        double b = sc.nextDouble();
        System.out.println("请输入运算符号:");
        String operator = sc.next();

        double result = calc(a,b,operator);
        System.out.println("结果为:"+result);
    }
    public static double calc(double a,double b,String operator){
        switch(operator){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            default:
                System.out.println("输入错误");
                return 0;
        }
    }
}
