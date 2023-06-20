package org.example;

public class Node<T> {
    private T data;
    public Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }

    public T getData(){
        return data;
    }

    public void set (T e){
        data = e;
    }

    public void setNext(Node<T> n){
        next = n;
    }

}