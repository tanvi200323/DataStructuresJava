package com._14Trees._2BST;

import java.util.Scanner;

class Node4 {
    int val;
    Node4 left;
    Node4 right;
    Node4(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _5FloorCeilBST {
    static Node4 buildTree(){
        Node4 root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        int val = sc.nextInt();
        if(val==-1){
            return null;
        }
        root = new Node4(val);
        System.out.println("Enter left node for "+val);
        root.left = buildTree();
        System.out.println("Enter right node for "+val);
        root.right = buildTree();

        return root;
    }
    static int FloorBST(Node4 root, int key){
        int ans = Integer.MAX_VALUE;

        while(root != null){
            if(root.val == key){
                return root.val;
            }
            if(root.val > key){
                root = root.left; //left mein lesser values hoti h
            }else{
                ans = root.val; // found floor value
                root = root.right;  //maybe right one is larger than above ans
            }
        }
        return ans;
    }
    static int CeilBST(Node4 root, int key){
        int ans = Integer.MIN_VALUE;

        while(root != null){
            if(root.val == key){
                return root.val;
            }

            if(root.val < key){
                root = root.right;
            }else {
                ans = root.val;
                root = root.left;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Node4 root = buildTree();
        System.out.println(FloorBST(root, 25));
        System.out.println(CeilBST(root, 25));
    }
}
