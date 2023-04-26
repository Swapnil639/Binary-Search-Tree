package com.bridgelabz.bst;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        int[] element = {50, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67};
        for (Integer i : element) {
            binarySearchTree.add(i);
        }
        binarySearchTree.display();

        binarySearchTree.getSize();


    }
}
