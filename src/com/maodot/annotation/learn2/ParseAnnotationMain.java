package com.maodot.annotation.learn2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ParseAnnotationMain {
    public static void main(String[] args) {
        ParseAnnotationMain main = new ParseAnnotationMain();
        main.reflect1();
        main.reflect2();
    }


    /**
     * 获取类上面的注解信息
     */
    private void reflect1() {
        //使用类加载器加载类
        try {
            Class clazz = Class.forName("com.maodot.annotation.learn2.ChildrenTwo");
            //找到类上面的注解
            boolean isExist = clazz.isAnnotationPresent(Description.class); //判断这个类是否存在某类型的注解
            if (isExist){
                Description annotation = (Description) clazz.getAnnotation(Description.class);
                String desc = annotation.desc();
                System.out.println(desc);
                System.out.println(annotation.author());
                System.out.println(annotation.age());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取方法上面的注解信息
                    */
            private void reflect2() {
                try {
                    Class c = Class.forName("com.maodot.annotation.learn2.ChildrenTwo");
                    //获取这个类的方法对象数组
                    Method[] methods = c.getMethods();
            for (Method method : methods){
                boolean isExist = method.isAnnotationPresent(Description.class);
                if(isExist){
                    Description annotation = method.getAnnotation(Description.class);
                    System.out.println(annotation.desc());
                    System.out.println(annotation.author());
                    System.out.println(annotation.age());
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("can't find that class,sorry!!");
            e.printStackTrace();
        }
    }
}
