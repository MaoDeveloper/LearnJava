package com.maodot.iterable;

/**
 * 自定义节点
 * @author maodot
 * @param <T>
 */
public class Node<T> {

    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
        next = null;
    }

    public T getValue(){
        return this.value;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }


}
