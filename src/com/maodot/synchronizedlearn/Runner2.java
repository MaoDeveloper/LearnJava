package com.maodot.synchronizedlearn;

public class Runner2 implements Runnable {

    private ClassA classA = new ClassA();

    @Override
    public void run() {
        while (true){
            try {
                //ClassA.staticMethodA();
                //this.wait(100000);
                //classA.methodB(this.getClass());
               // Thread.sleep(2000);
                classA.methodC(this.getClass());
            }catch (Exception e){
                e.printStackTrace();
                System.out.println(this.getClass().getSimpleName()+"发生异常");
            }
        }
    }
}
