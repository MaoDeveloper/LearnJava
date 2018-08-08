package com.maodot.annotation.learn1;

/**
 * 过时
 * @author maodot
 */
public class TestDeprecated {

    private People people;

    @SuppressWarnings("deprecation")
    public void test(){
        people = new Children();

        people.work();
    }
}
