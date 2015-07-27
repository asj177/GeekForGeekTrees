package com.tree;

import java.util.Stack;

public class NonRecursivePostOrder {
	
	public static void postOrder(Node root){
		Stack s=new Stack();
		
		s.push(root);
		Stack s2=new Stack();
		
		while(!s.isEmpty()){
			Node n=(Node)s.pop();
			s2.push(n);
			if(n.left!=null){
				s.push(n.left);
			}
			
			if(n.right!=null){
				s.push(n.right);
			}
			
		}
		
		while(!s2.isEmpty()){
			Node n=(Node)s2.pop();
			
			System.out.println(n.data);
		}
		
		
	}
	
	public static void postOrderRecursive(Node root){
		if(root==null){
			return;
		}
		postOrderRecursive(root.left);
		postOrderRecursive(root.right);
		System.out.println(root.data);
		
		
	}
	
	
	public static void main(String[] args) {

		 BinaryTree tree=new BinaryTree();
			tree.insert(10);
			
			tree.insert(7);
			tree.insert(8);
			tree.insert(6);
			
			tree.insert(5);
			tree.insert(15);
			tree.insert(16);
			tree.insert(12);
			tree.insert(13);
			tree.insert(11);
			System.out.println("**********Non recursive******************");
			postOrder(tree.root);
			System.out.println("*************Recursive*********");
			postOrderRecursive(tree.root);
			
			
	}

}
