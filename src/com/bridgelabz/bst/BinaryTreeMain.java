package com.bridgelabz.bst;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree=new BinarySearchTree<>();
        binarySearchTree.add(56);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        binarySearchTree.display();
    }
}
