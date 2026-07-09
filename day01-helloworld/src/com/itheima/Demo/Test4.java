package com.itheima.Demo;

public class Test4 {
    //找素数
    public static void main(String[] args) {
         for(int number = 101;number<=200;number++){
             if(isPrime(number)){
                 System.out.println(number +" ");
             }
         }
    }
    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        for(int i = 2;i<number/2;i++){
            if(number % i ==0){
                return false;
            }
        }
        return true;
    }
}
