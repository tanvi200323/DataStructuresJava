package com._14Trees._1BinaryTree;

import java.util.Scanner;

class Node13 {
    int val;
    Node13 left;
    Node13 right;
    Node13(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class _13DiameterOfBT {
    public static void main(String[] args) {
        Node13 root = buildTree();
        System.out.println(diameter(root));
    }
    static Node13 buildTree(){
        Node13 root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:" );
        int val= sc.nextInt();
        if(val==-1){
            return null;
        }
        root = new Node13(val);

        System.out.println("Enter left of "+val);
        root.left = buildTree();
        System.out.println("Enter right of "+val);
        root.right = buildTree();

        return root;
    }
    static int diameter(Node13 root){
        if(root == null){
            return 0;
        }
        int d1 = diameter(root.left);
        int d2 = diameter(root.right);
        int d3 = height(root.left) + height(root.right) + 1;

        return Math.max(d3, Math.max(d1,d2));
    }
    static int height(Node13 root){
        if(root == null){
            return 0;
        }
        return 1+ Math.max(height(root.left), height(root.right));
    }
}

