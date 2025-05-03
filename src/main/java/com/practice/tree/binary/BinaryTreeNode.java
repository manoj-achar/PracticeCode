package com.practice.tree.binary;

class Node {
    int data;
    Node leftNode;
    Node rightNode;
    public Node(int data) {
        this.data = data;
    }
}
public class BinaryTreeNode {
    Node root;

    public void insert(int data) {
        root = insertRecursive(root, data);
    }
    public Node insertRecursive(Node root, int data) {
        if(root == null) {
            root = new Node(data);
        } else if(data < root.data) {
            root.leftNode = insertRecursive(root.leftNode, data);
        } else if(data > root.data) {
            root.rightNode = insertRecursive(root.rightNode, data);
        }
        return root;
    }
}
