package com.ctrip.corp.demo;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Part1 {
    public void allLambdaForms() {

        Runnable noArguments = () -> System.out.println("实现了Runnable接口的Run函数");

        Thread thread  = new Thread(noArguments);
        thread.start();

        Runnable multiStatement = () -> {
            System.out.print("打印1");
            System.out.println(" 打印2");
        };

        BinaryOperator<Long> add = (x, y) -> x + y;


        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;

        Predicate<Integer> predicate =(x)-> x==2;
        predicate.test(2);
    }

    public void  setLambdaValue(){
        String name = "唐信国";
        name = "唐信滋";
       // Runnable noArguments = () -> System.out.println("实现了Runnable接口的Run函数：姓名"+ name);


    }
}
