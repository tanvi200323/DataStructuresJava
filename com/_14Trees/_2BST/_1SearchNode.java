package com._14Trees._2BST;

import java.util.Scanner;

class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class _1SearchNode {
    static Node buildTree(){
        Node root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        int val = sc.nextInt();
        if(val==-1){
            return null;
        }
        root = new Node(val);
        System.out.println("Enter left node for "+val);
        root.left = buildTree();
        System.out.println("Enter right node for "+val);
        root.right = buildTree();

        return root;
    }
    static boolean searchNodeBST(Node root, int target){
        if(root==null){
            return false;
        }
        if(root.val == target){
            return true;
        }
        if(root.val > target){
            return searchNodeBST(root.left, target);
        }
        return searchNodeBST(root.right, target);
    }
    public static void main(String[] args) {
        Node root = buildTree();
        boolean ans = searchNodeBST(root, 56);
        System.out.println(ans);
    }
}
