package com.ctrip.corp.demo;

import com.ctrip.corp.fi.UserNameService;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Part1 {

    public static void main(String[] args) {

        UserNameService userNameService = new UserNameService() {
            @Override
            public void printName() {
                System.out.println("使用匿名类实现打印姓名！！！");
            }
        };
        userNameService.printName();

        UserNameService userNameServicePlus = () -> {
            System.out.println("使用Lambda表达式实现打印姓名！！！");
        };
        userNameServicePlus.printName();

        UserNameService userNameServicePlus1 = () -> System.out.println("使用Lambda表达式[省略大括号]实现打印姓名！！！");
        userNameServicePlus1.printName();

    }


    public void allLambdaForms() {

        Runnable noArguments = () -> System.out.println("实现了Runnable接口的Run函数");

        Thread thread = new Thread(noArguments);
        thread.start();

        Runnable multiStatement = () -> {
            System.out.print("打印1");
            System.out.println(" 打印2");
        };

        BinaryOperator<Long> add = (x, y) -> x + y;


        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;

        Predicate<Integer> predicate = (x) -> x == 2;
        predicate.test(2);
    }

    public void setLambdaValue() {
        String name = "唐信国";
        name = "唐信滋";
        // Runnable noArguments = () -> System.out.println("实现了Runnable接口的Run函数：姓名"+ name);


    }
}
