package com.itheima.Demo;

public class Test3 {
    //验证码
    static void main() {
        System.out.println(getVerifyCode(4));
        System.out.println(getVerifyCode(6));
    }
    static String getVerifyCode(int n) {
        String code = "";
        for(int i = 0; i<n; i++){
            int type = (int)(Math.random()*3);
            switch(type){
                case 0:
                    int num = (int)(Math.random()*10);
                    code += num;
                    break;
                case 1:
                    code += (char)(Math.random()*26+'A');
                    break;
                case 2:
                    code += (int)(Math.random()*10);
                    break;
            }
        }
        return code;
    }
}
