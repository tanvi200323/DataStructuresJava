package com._14Trees._1BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node6{
    int val;
    Node6 left;
    Node6 right;
    Node6(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _7LeftRightView_Naive {
    static Node6 buildTree(){
        Node6 root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int val = sc.nextInt();
        if(val == -1){
            return null;
        }
        root = new Node6(val);
        System.out.println("Enter left of "+val);
        root.left = buildTree();
        System.out.println("Enter right of "+val);
        root.right = buildTree();

        return root;
    }
    static void leftViewNaive(Node6 root){
        if(root == null){
            return;
        }
        Queue<Node6> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();

            for(int i=1; i<=n; i++){
                Node6 curr = q.poll();

                if(i==n){ //ensures that it prints only the first element of the level
                    System.out.print(curr.val+" ");
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        Node6 root = buildTree();
        leftViewNaive(root);
    }
}
