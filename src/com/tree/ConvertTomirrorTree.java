package com.tree;

public class ConvertTomirrorTree {

	static void convertToMirror(Node root){
		if(root==null)
			return;
		convertToMirror(root.left);
		convertToMirror(root.right);
		
		Node temp=root.left;
		root.left=root.right;
		root.right=temp;
		
		
	}
	
	static void inorder(Node root){
		
		
		if(root==null){
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data);
		inorder(root.right);
		
		
	}
	
	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.insert(2);
		tree.insert(1);
		tree.insert(5);
		
		tree.insert(4);
		tree.insert(6);
		inorder(tree.root);
		convertToMirror(tree.root);
		System.out.println("After mirror *************************");
		inorder(tree.root);
	}
}
