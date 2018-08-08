package com.maodot.synchronizedlearn;

public class ClassA {

    //private transient static int anInt = 0;
    private static int anInt = 0;
/*
    public static synchronized void staticMethodA(){
            System.out.println("静态方法");
    }
*/

    public void methodB(Class clazz){
        synchronized(this.getClass()){
            anInt ++;
            System.out.println(clazz.getSimpleName()+"加1之后"+anInt);
        }
    }

    public synchronized void methodC(Class clazz){
            anInt ++;
            System.out.println(clazz.getSimpleName()+"加1之后"+anInt);
    }

}
