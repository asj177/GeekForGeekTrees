package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class DoubleTree {
	
	
	public static void createDoubleTree(Node root){
		if(root==null){
			
			return ;
			
		}
		
		
		createDoubleTree(root.left);
		createDoubleTree(root.right);
Node temp=root.left;
		
		Node newNode=new Node(root.data);
		
		root.left=newNode;
		newNode.left=temp;
		
	}
	
	public static void printInorder(Node root){
		if(root==null)
			return ;
		printInorder(root.left);
		System.out.print(root.data+" ");
		printInorder(root.right);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
	    BinaryTree tree=new BinaryTree();
		tree.insert(2);
		tree.insert(1);
		tree.insert(5);
		
		tree.insert(4);
		tree.insert(6);
		
		createDoubleTree(tree.root);
		printInorder(tree.root);
	}

}
