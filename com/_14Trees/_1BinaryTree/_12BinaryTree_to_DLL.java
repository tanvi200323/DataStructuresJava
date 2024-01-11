package com._14Trees._1BinaryTree;

import java.util.Scanner;

class Node12 {
    int val;
    Node12 left;
    Node12 right;
    Node12(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _12BinaryTree_to_DLL {
    public static void main(String[] args) {
        Node12 root = buildTree();
        convertToDLL(root);
        printDLL(head);
    }
    static Node12 buildTree(){
        Node12 root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:" );
        int val= sc.nextInt();
        if(val==-1){
            return null;
        }
        root = new Node12(val);

        System.out.println("Enter left of "+val);
        root.left = buildTree();
        System.out.println("Enter right of "+val);
        root.right = buildTree();

        return root;
    }
    static Node12 prev = null, head=null;
    static void convertToDLL(Node12 root){
        if(root == null){
            return;
        }
        convertToDLL(root.left); //inorder (LNR)
        if(prev == null){ //for 1st element
            head = root;
        }
        else{
            root.left = prev;  //linking
            prev.right = root;
        }
        prev = root; //update of prev
        convertToDLL(root.right);
    }
    static void printDLL(Node12 curr){
        while(curr != null){
            System.out.print(curr.val+" ");
            curr = curr.right;
        }
    }
}
