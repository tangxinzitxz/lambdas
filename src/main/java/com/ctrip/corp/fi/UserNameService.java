package com.ctrip.corp.fi;

@FunctionalInterface
public interface UserNameService{
    void printName();

    default int add(int a,int b){
        return a+b;
    }
}
