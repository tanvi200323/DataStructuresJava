package com._14Trees._1BinaryTree;

import java.util.Scanner;

class Node3{
    int val;
    Node3 left;
    Node3 right;
    Node3(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _4NaiveLevelOrder {
    static Node3 buildTree(){
        Node3 root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int val = sc.nextInt();
        if(val == -1){
            return null;
        }
        root = new Node3(val);

        System.out.println("Enter left node of "+val);
        root.left = buildTree();
        System.out.println("Enter right node of "+val);
        root.right = buildTree();

        return root;
    }
    static int heightTree(Node3 root){
        if (root == null){
            return 0;
        }
        return Math.max(heightTree(root.left),heightTree(root.right)) + 1;
    }
    static void printCurrentLevel(Node3 root, int level){
        if(root == null){
            return;
        }
        if(level==1){
            System.out.print(root.val+" ");
        }
        else if(level>1){
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
        }
    }
    public static void main(String[] args) {
        Node3 root = buildTree();
        for(int i=1; i<=heightTree(root); i++){
            printCurrentLevel(root, i);
        }
    }
}
