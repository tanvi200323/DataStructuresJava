package com._14Trees._1BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node4{
    int val;
    Node5 left;
    Node5 right;
    Node4(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _5OptimizedLevelOrder {
    static Node5 buildTree(){
        Node5 root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int val = sc.nextInt();
        if(val ==-1){
            return null;
        }
        root = new Node5(val);

        System.out.println("Enter left for "+val);
        root.left = buildTree();
        System.out.println("Enter right for "+val);
        root.right = buildTree();

        return root;
    }
    static void levelOrderTraversal(Node5 root){
        Queue<Node5> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node5 curr = q.poll();
            System.out.print(curr.val+" ");

            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
    public static void main(String[] args) {
        Node5 root = buildTree();
        levelOrderTraversal(root);  
    }
}
