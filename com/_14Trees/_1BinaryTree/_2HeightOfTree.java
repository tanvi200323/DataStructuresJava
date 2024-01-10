package com._14Trees._1BinaryTree;

import java.util.Scanner;

class Node1{
    int val;
    Node1 left;
    Node1 right;
    Node1(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _2HeightOfTree {
    static Node1 buildTree(){
        Node1 root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int val = sc.nextInt();
        if(val == -1){
            return null;
        }
        root = new Node1(val);

        System.out.println("Enter left node of "+val);
        root.left = buildTree();
        System.out.println("Enter right node of "+val);
        root.right = buildTree();

        return root;
    }
    static int heightTree(Node1 root){
        if (root == null){
            return 0;
        }
        return Math.max(heightTree(root.left),heightTree(root.right)) + 1;
    }
    public static void main(String[] args) {
        Node1 root = buildTree();
        System.out.println(heightTree(root));
    }
}
