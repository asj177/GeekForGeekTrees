package com.tree;

import java.util.*;

public class VerticalSum {

	static HashMap<Integer,Integer> verticalSum=new HashMap<Integer,Integer>();
	

	public static void calculateVerticalSum(Node root,int sum){
		
		
		if(root==null){
			return ;
		}
		if(verticalSum.containsKey(sum)){
			int data=verticalSum.get(sum);
			verticalSum.put(sum, root.data+data);
			
		}else{
			verticalSum.put(sum, root.data);
		}
		
		calculateVerticalSum(root.left,sum-1);
		calculateVerticalSum(root.right,sum+1);
	}
	
	public static void main(String[] args) {
		
		 BinaryTree tree=new BinaryTree();
			tree.insert(10);
			
			tree.insert(7);
			tree.insert(8);
			tree.insert(9);
			tree.insert(5);
			
			tree.insert(6);
			tree.insert(4);
			tree.insert(15);
			
			calculateVerticalSum(tree.root,0);
		Iterator i=verticalSum.entrySet().iterator();
		
		while(i.hasNext()){
			
			Map.Entry pair=(Map.Entry)i.next();
			
			
			System.out.println("Vertical Sum of "+pair.getKey()+" is "+pair.getValue());
		}
		
		
	}
	
	
}
