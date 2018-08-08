package com.maodot.synchronizedlearn;

public class Runner1 implements Runnable {
    private ClassA classA = new ClassA();

    @Override
    public void run() {
        try{
            while (true){
               // classA.methodB(this.getClass());
              // Thread.sleep(1000);
                classA.methodC(this.getClass());
            }
        }catch (Exception e){e.printStackTrace();}
    }
}
