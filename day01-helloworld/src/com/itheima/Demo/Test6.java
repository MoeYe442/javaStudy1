package com.itheima.Demo;

import java.util.Scanner;

public class Test6 {

    //录入8名学生的成绩，并求平均值，最大值，最小值
    static void main() {
        Scanner sc = new Scanner(System.in);

        double[] scores = new double[8];
        for(int i = 0 ;i<scores.length;i++){
            scores[i] = sc.nextDouble();
        }
        print(scores);
    }

    static void print(double[] scores) {
        double sum = 0;
        double max = scores[0];
        double min = scores[0];
        for(int i = 0;i<scores.length;i++){
            sum += scores[i];
            if(scores[i] > max){
                max = scores[i];
            }
            if(scores[i] < min){
                min = scores[i];
            }
        }
        System.out.println("平均值:"+sum/scores.length);
        System.out.println("最大值:"+max);
        System.out.println("最小值:"+min);
    }

}
