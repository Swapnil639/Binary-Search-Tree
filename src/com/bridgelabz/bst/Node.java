package com.bridgelabz.bst;

public class Node<T extends Comparable<T>> {
    T key;
    Node<T> left;
    Node<T> right;

    public Node(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
