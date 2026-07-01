package com.itheima.helloworld;

import java.util.Scanner;

public class HelloWorld {
    static void main() {
        System.out.println("Hello World!");
        printTen();
        print();
    }
    //打印十行Hello World
    static void printTen() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }
    }

    static void print() {
        Scanner a = new Scanner(System.in);
        String b = a.next();
        System.out.println(b);
    }
}
//学过C语言，不想写基础语法
