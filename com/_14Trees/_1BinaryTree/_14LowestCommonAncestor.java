package com._14Trees._1BinaryTree;

import java.util.Scanner;

class Node14 {
    int val;
    Node15 left;
    Node15 right;
    Node14(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _14LowestCommonAncestor {
    static Node15 buildTree(){
        Node15 root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:" );
        int val= sc.nextInt();
        if(val==-1){
            return null;
        }
        root = new Node15(val);

        System.out.println("Enter left of "+val);
        root.left = buildTree();
        System.out.println("Enter right of "+val);
        root.right = buildTree();

        return root;
    }
    static Node15 lca(Node15 root, int n1, int n2){
        if(root==null){
            return null;
        }

        if(root.val == n1 || root.val == n2){  // 1. curr = a or b
            return root;
        }
        Node15 left = lca(root.left, n1, n2);
        Node15 right = lca(root.right, n1, n2);

        if(left == null){ //2. left-null, ans must be from right
            return right;
        }
        if(right == null){ //3. vice-versa
            return left;
        }

        return root; //4. both a and b are not in the tree;
    }
    public static void main(String[] args) {
        Node15 root = buildTree();
        System.out.println(lca(root, 3,2).val);
    }
}
