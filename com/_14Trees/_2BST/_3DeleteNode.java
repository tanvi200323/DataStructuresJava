package com._14Trees._2BST;

import java.util.Scanner;

class Node2 {
    int val;
    Node3 left;
    Node3 right;
    Node2(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _3DeleteNode {
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
    static Node3 delete(Node3 root, int key) {
        if(root == null){
            return root;
        }
        if (key < root.val) {
            root.left = delete(root.left, key);
        } else if (key > root.val) {
            root.right = delete(root.right, key);
        } else { //root.val == key
            //case 1: 0 child
            if (root.left == null && root.right == null) {
                return null;
            }

            //case 2: 1 child(left or right)
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //case 3: 2 children
            Node3 IS = inorderSuccessor(root.right);
            root.val = IS.val;
            root.right = delete(root.right, IS.val);
        }
        return root;
    }
    static Node3 inorderSuccessor(Node3 root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    static void inOrder(Node3 root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        Node3 root = buildTree();
        delete(root, 3);
        inOrder(root);
    }
}
