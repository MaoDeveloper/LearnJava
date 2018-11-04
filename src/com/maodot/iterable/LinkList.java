package com.maodot.iterable;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 实现 Iterable 接口
 * @author maodot
 */
public class LinkList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;

    public LinkList() {
        head = null;
        tail = null;
    }

    public void add(T value){
        Node<T> node = new Node<>(value);
        if (tail == null){
            this.head = node;
        }else{
            this.tail.setNext(node);
        }
        this.tail = node;
    }

    private class ListIterator implements Iterator<T> {

        private Node<T> currentNode;

        public ListIterator(Node<T> head) {
            this.currentNode = head;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if (currentNode == null){
                throw new NoSuchElementException();
            }
            T value = currentNode.getValue();
            this.currentNode = currentNode.getNext();
            return value;
        }
    }

    @Override
    public Iterator iterator() {
        return new ListIterator(head);
    }
}
