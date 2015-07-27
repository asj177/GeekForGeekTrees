package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestOddLevelNode {

	public static void deepestOddLevelNode(Node root){
		int levelCount=1;
		int data=Integer.MIN_VALUE;
		Queue<Node> q=new LinkedList<Node>();
		
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()){
			
			Node n=q.remove();
			
			if(n==null){
				if(q.peek()==null){
					break;
				}
				q.add(null);
				levelCount++;
				
			}else{
				if(levelCount%2!=0){
					if(n.left==null && n.right==null){
						data=n.data;
					}
					
				}
				
				if(n.left!=null){
					q.add(n.left);
				}
				if(n.right!=null){
					q.add(n.right);
				}
			}
			
		}
		
		System.out.println("Deepest level node is "+data);
		
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
			deepestOddLevelNode(tree.root);
	}
}
