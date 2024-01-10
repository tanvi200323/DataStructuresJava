package com._14Trees._1BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node5 {
    int val;
    Node5 left;
    Node5 right;
    Node5(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class _6LevelOrderLineByLine {
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
    static void levelOrderTraversal(Node5 root) {
        Queue<Node5> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node5 curr = q.poll();
            if(curr == null){
                if(q.isEmpty()){
                    return;
                }
                q.add(null); //queue k piche bhj do
                System.out.println(); //for new line
                continue;
            }
            System.out.print(curr.val + " ");

            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }
    public static void main(String[] args) {
        Node5 root = buildTree();
        levelOrderTraversal(root);
    }
}
