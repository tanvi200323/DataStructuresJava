package com._14Trees._2BST;

import java.util.Scanner;

class Node1 {
    int val;
    Node1 left;
    Node1 right;
    Node1(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _2InsertNode {
//    static Node4 buildTree(){
//        Node4 root = null;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter data:");
//        int val = sc.nextInt();
//        if(val==-1){
//            return null;
//        }
//        root = new Node4(val);
//        System.out.println("Enter left node for "+val);
//        root.left = buildTree();
//        System.out.println("Enter right node for "+val);
//        root.right = buildTree();
//
//        return root;
//    }
    static Node1 insertNode(Node1 root, int key){
        if(root==null){
            return new Node1(key);
        }
        if(root.val > key){
            root.left = insertNode(root.left, key);
        }
        else if(root.val < key){
            root.right = insertNode(root.right, key);
        }
        return root;
    }
    static void inOrder(Node1 root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        Node1 root = null;
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[7];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int elt : arr){
            root = insertNode(root, elt);
        }
        inOrder(root);
    }
}
