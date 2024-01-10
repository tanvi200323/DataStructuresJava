package com._14Trees._1BinaryTree;

import java.util.Scanner;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _1Implementation {
    static Node buildtree(){
        Node root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int val = sc.nextInt();

        if(val == -1){
            return null;
        }
        root = new Node(val);

        System.out.println("Enter data for inserting in left of "+val+": ");
        root.left = buildtree();
        System.out.println("Enter data for inserting in right of "+val+": ");
        root.right = buildtree();

        return root;
    }
    static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args){
        //Creating a tree
        Node root = buildtree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }
}
