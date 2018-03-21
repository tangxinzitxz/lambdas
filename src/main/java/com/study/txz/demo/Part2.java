package com.study.txz.demo;

import com.study.txz.fi.UserNameService1;

public class Part2 {
    public static void main(String[] args) {

        String name = "唐信滋";
        //name = "唐信国";

        UserNameService1 userNameServicePlus = x -> System.out.println("使用Lambda表达式实现打印姓名:" + name);
        userNameServicePlus.printName("唐信滋");


    }
}
