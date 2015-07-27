package com.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.sun.org.apache.bcel.internal.generic.IFNE;

public class BoundaryTraversal {
	
	
	public static void printLeaves(Node root){
		
		
		if(root ==null){
			return ;
		}
		if(root.left==null && root.right==null){
			System.out.println(root.data);
			
		}
		
		printLeaves(root.left);
		printLeaves(root.right);
	}
	
	public static void printLeftBoundary(Node root){
		
		
		if(root==null){
			return;
		}
		
		if(root.left!=null){
			
			System.out.println(root.data);
			printLeftBoundary(root.left);
			
		}else{
			System.out.println(root.data);
			printLeftBoundary(root.right);
		}
	}
	
	public static void printRightBoundary(Node root){
		
		if(root==null){
			return;
		}
		
		if(root.right!=null){
			
			System.out.println(root.data);
			printLeftBoundary(root.right);
			
		}else{
			System.out.println(root.data);
			printLeftBoundary(root.left);
		}
	}
	
	public static void printBoundary(Node root){
		printLeftBoundary(root.left);
		printLeaves(root.left);
		printLeaves(root.right);
		
		printLeftBoundary(root.right);
		System.out.println(root.data);
		
	}
	
	
	public static void main(String[] args) {
		 BinaryTree tree=new BinaryTree();
			tree.insert(20);
			
			tree.insert(8);
			tree.insert(22);
			tree.insert(4);
			tree.insert(12);
			
			tree.insert(10);
			tree.insert(14);
			tree.insert(25);
			printBoundary(tree.root);
	}

}
