package com.bridgelabz.bst;

public class BinarySearchTree<T extends Comparable<T>> {
     Node<T> root;

     public void add(T key){
         this.root=this.addRecursively(root,key);
     }
     Node<T> addRecursively(Node<T> current, T key) {
         if (current==null){
             return new Node<>(key);
         }
         int compareResult=key.compareTo(current.key);
         if (compareResult==0){
             return current;
         }
         if (compareResult<0){
             current.left=addRecursively(current.left,key);
         }else {
             current.right=addRecursively(current.right,key);
         }
         return current;
    }
    public int getSize(){
        System.out.println(this.getSizeRecursive(root));
         return this.getSizeRecursive(root);
    }

    public int getSizeRecursive(Node<T> current) {
       return current==null ?0:1+this.getSizeRecursive(current.left)+this.getSizeRecursive(current.right);

    }
    public void display(){
        System.out.println(root);
    }

    public void search(T key) {
         if (root==null){
             System.out.println("Tree is empty");
         }
         if (root.key.compareTo(key)>0){
             System.out.println("Element found in the data");
         }
         else {
             System.out.println("Element not found in the data");
         }
    }
}
