package com.itheima.Demo;

public class Test5 {
    //随机点名
    static void main() {
        //String[] names = {"小王","小李","小张","小赵","小钱","小孙","小李"};
        //String names[] = {"小王","小李","小张","小赵","小钱","小孙","小李"};
        String[] names = new String[]{"小王","小李","小张","小赵","小钱","小孙","小李"};

        int index = (int)(Math.random()*names.length);
        System.out.println(names[index]);
    }
}
