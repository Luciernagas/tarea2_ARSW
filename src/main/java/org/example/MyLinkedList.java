package org.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<T> implements List<T> {
    T obj;
    private Node<T> firstNode = null;
    private Node<T> lastNode = null;
    private int longitud;

    public MyLinkedList() {
    }

    @Override
    public int size() {
        return longitud;
    }

    @Override
    public boolean add(T e) {
        Node<T> nuevoNode = new Node<>(e);

        if(lastNode != null){
            lastNode.setNext(nuevoNode);
            lastNode = nuevoNode;
        }else {
            firstNode = nuevoNode;
            lastNode = nuevoNode;
        }
        longitud ++;
        return true;
    }

    @Override
    public T get(int index) {
        Node<T> elemento = firstNode;
        for (int i = 0; i < index; i++){
            elemento = elemento.next;
        }
        return elemento.getData();
    }

}