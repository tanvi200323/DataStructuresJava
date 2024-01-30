package com._14Trees._2BST;

import java.util.Scanner;

class Node3 {
    int val;
    Node3 left;
    Node3 right;
    Node3(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _4CheckForBST {
    static Node3 buildTree(){
        Node3 root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        int val = sc.nextInt();
        if(val==-1){
            return null;
        }
        root = new Node3(val);
        System.out.println("Enter left node for "+val);
        root.left = buildTree();
        System.out.println("Enter right node for "+val);
        root.right = buildTree();

        return root;
    }
    static boolean checkBST(Node3 root, int min, int max){
        if(root==null){
            return true;
        }

        if(root.val >= min && root.val <= max){
            boolean left = checkBST(root.left, min, root.val);
            boolean right = checkBST(root.right, root.val, max);
            return left && right;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Node3 root = buildTree();
        boolean ans = checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(ans);
    }
}
