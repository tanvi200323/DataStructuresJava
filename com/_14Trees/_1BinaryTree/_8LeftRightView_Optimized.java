package com._14Trees._1BinaryTree;

import java.util.ArrayList;
import java.util.Scanner;

class Node7{
    int val;
    Node7 left;
    Node7 right;
    Node7(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _8LeftRightView_Optimized {
    static Node7 buildTree(){
        Node7 root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int val = sc.nextInt();
        if(val == -1){
            return null;
        }
        root = new Node7(val);
        System.out.println("Enter left of "+val);
        root.left = buildTree();
        System.out.println("Enter right of "+val);
        root.right = buildTree();

        return root;
    }
    static void printLeftView(Node7 root){
        ArrayList<Node7> al = new ArrayList<>();
        helper1(root, al, 0);
        for(Node7 curr: al){
            System.out.print(curr.val+" ");
        }
    }
    static void printRightView(Node7 root){
        ArrayList<Node7> al = new ArrayList<>();
        helper2(root, al, 0);
        for(Node7 curr: al){
            System.out.print(curr.val+" ");
        }
    }
    static void helper1(Node7 root, ArrayList<Node7> list, int level){
        if(root == null){
            return;
        }
        else if(level == list.size()){
            list.add(root);
        }
        helper1(root.left, list, level+1);
        helper1(root.right, list, level+1);
    }
    static void helper2(Node7 root, ArrayList<Node7> list, int level){
        if(root == null){
            return;
        }
        else if(level == list.size()){
            list.add(root);
        }
        helper2(root.right, list, level+1); //right view
        helper2(root.left, list, level+1);
    }
    public static void main(String[] args) {
        Node7 root = buildTree();
        printLeftView(root);
        System.out.println();
        printRightView(root);
    }
}
