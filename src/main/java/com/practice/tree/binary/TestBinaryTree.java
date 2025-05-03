package com.practice.tree.binary;

public class TestBinaryTree {

    public static void main(String[] args) {

    }
/*
    public static BinaryTreeNode getLca(BinaryTreeNode tree, int node1, int node2, int node3) {
        if(tree == null) {
            return null;
        }
        if(tree.root.data == node1 || tree.root.data == node2 || tree.root.data == node3) {
            return tree;
        }
        BinaryTreeNode lcaLeft = getLca(tree.root.leftNode, node1, node2, node3);
        BinaryTreeNode lcaRight = getLca(root.right, node1, node2, node3);
        if(lcaLeft == null && lcaRight == null) {
            return null;
        } else if(lcaLeft == null && lcaRight != null) {
            return lcaRight;
        } else if(lcaLeft != null && lcaRight == null) {
            return lcaRight;
        }else {
            return root;
        }
    }
*/
}
