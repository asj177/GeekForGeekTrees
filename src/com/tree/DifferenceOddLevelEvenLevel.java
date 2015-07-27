package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class DifferenceOddLevelEvenLevel {

	 
	
	public  static  void insertLevels(Node root){
		int odd=0;
		 int even=0;
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		q.add(null);
		
		int levelNumber=1;
		while(!q.isEmpty()){
			Node n=q.remove();
			
			if(n==null){
				if(q.peek()==null){
					break;
				}
				levelNumber=levelNumber+1;
				q.add(null);
			}else{
				
				if(levelNumber%2==0){
					even=even+n.data;
				}else{
					odd=odd+n.data;
				}
				
				if(n.left!=null){
					q.add(n.left);
				}
				
				if(n.right!=null){
					q.add(n.right);
				}
				
			}
			
			
			
		}
		
		System.out.println("Even is "+even);
		System.out.println("odd is "+odd);
		
		System.out.println("Difference between odd and even level is "+Math.abs(even-odd));
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
			insertLevels(tree.root);
			
	}
}
