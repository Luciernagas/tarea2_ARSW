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

    public void setNext(Node<T> n){
        next = n;
    }

}