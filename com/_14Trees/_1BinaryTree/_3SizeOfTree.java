package com._14Trees._1BinaryTree;

import java.util.Scanner;

class Node2{
    int val;
    Node2 left;
    Node2 right;
    Node2(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _3SizeOfTree {
    static Node2 buildTree(){
        Node2 root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int val = sc.nextInt();
        if(val == -1){
            return null;
        }
        root = new Node2(val);

        System.out.println("Enter left node of "+val);
        root.left = buildTree();
        System.out.println("Enter right node of "+val);
        root.right = buildTree();

        return root;
    }
    static int size(Node2 root){
        if(root == null){
            return 0;
        }
        return size(root.left) + size(root.right) + 1;
    }
    public static void main(String[] args) {
        Node2 root = buildTree();
        System.out.println(size(root));
    }
}
