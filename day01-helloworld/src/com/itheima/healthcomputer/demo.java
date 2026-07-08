package com.itheima.healthcomputer;

import java.util.Scanner;
public class demo {
     static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的身高:");
        double height =sc.nextDouble();
        System.out.println("请输入您的体重:");
        double weight = sc.nextDouble();
        System.out.println("请输入您的性别:");
        String sex = sc.next();
        System.out.println("请输入您的年龄:");
        int age = sc.nextInt();

        double bmi = calcBMI(height,weight);
        System.out.println("BMI:"+bmi);

        double BMR = calcBMR(height,weight,sex,age);
        System.out.println("BMR:"+BMR);
    }

    public static double calcBMI(double height, double weight){
        return weight/(height*height);
    }

    public static double calcBMR(double height, double weight, String sex, int age){
        double bmr;
        if("男".equals(sex)){
            bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        }else{
            bmr = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
        }
        return bmr;
    }
}

