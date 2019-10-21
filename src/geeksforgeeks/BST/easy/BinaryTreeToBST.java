package geeksforgeeks.BST.easy;


import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {
    Node node;
    private List<Integer> list = new ArrayList<>();
    private void inorder(Node root){
        if(root != null){
            inorder(root.left);
            list.add(root.data);
            inorder(root.right);
        }
    }
    private Node insert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data)
            root.left = insert(root.left, data);
        if(data > root.data)
            root.right = insert(root.right, data);
        return root;
    }
    private Node newTree(){
        for(int i : list)
            node = insert(node, i);
        return node;
    }
    Node binaryTreeToBST(Node root){
        inorder(root);
        return newTree();
    }
}
