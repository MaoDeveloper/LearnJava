package com.maodot.mode.iteratormode;

import java.util.*;

/**
 * 迭代器模式
 * 迭代器模式: 提供一种方法顺序访问聚合对象(如List、Set)内的每个元素, 而又不暴露聚合对象的内部实现.
 * @author maodot
 */
public class MaoAggregate implements Iterable<String> {

    private List<String> list;

    public MaoAggregate() {
        list = new ArrayList<>();
    }

    @Override
    public Iterator<String> iterator() {
        return new MaoIterator();
    }

    public void add(String string){
        this.list.add(string);
    }

    public String get(int index){
        return this.list.get(index);
    }

    private class MaoIterator implements Iterator<String> {
        /**
         * 游标
         */
        int cursor = 0;
        /**
         * 比游标慢一个元素
         */
        int lastRet = -1;

        @Override
        public boolean hasNext() {
            return cursor != list.size();
        }

        @Override
        public String next() {
            if(cursor >= list.size()){
                throw new NoSuchElementException();
            }
            ++ cursor;
            return list.get(lastRet = cursor-1);
        }

        @Override
        public void remove() {
            System.out.println("lastRet:"+lastRet);
            list.remove(lastRet);
            cursor = lastRet;
            lastRet = -1;
        }
    }
}
