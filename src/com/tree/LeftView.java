package com.tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LeftView {
	
	
	public static void printLeftView(Node root){
		
		Queue <Node>q=new LinkedList<Node>();
		int level=0;
		HashSet levelTace=new HashSet();
		
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()){
			
			Node n=q.remove();
			
			if(n==null){
				if(q.peek()==null){
					break;
				}
				level++;
				q.add(null);
			}else{
				
				if(!levelTace.contains(level)){
					System.out.println(n.data);
					
					
					
					
					
				}
				
				if(n.left!=null){
				q.add(n.left);
				}
				if(n.right!=null){
					q.add(n.right);
					}
				
				levelTace.add(level);
				
				
			}
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		 BinaryTree tree=new BinaryTree();
			tree.insert(10);
			tree.insert(7);
			tree.insert(6);
			tree.insert(20);
			tree.insert(14);
			tree.insert(17);
			tree.insert(16);
			tree.insert(21);
			tree.insert(22);
			tree.insert(25);
			tree.insert(24);
			printLeftView(tree.root);
	}

}
