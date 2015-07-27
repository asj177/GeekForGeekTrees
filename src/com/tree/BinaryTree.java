package com.tree;

public class BinaryTree {
	
	 Node left;
	 Node root;
	 Node right;
	
	 void insert(int data){
		Node treedata=new Node(data);
		treedata.left=null;
		treedata.right=null;
		if(root==null){
		    root=treedata;
		}else{
			left=right=root;
			
			while(left!=null){
				right=left;
				if(left.data>treedata.data){
					
					left=left.left;
				}else{
					left=left.right;
				}
			}
			
			if(right.data>treedata.data){
				
				right.left=treedata;
			}else{
				
				right.right=treedata;
			}
			
			
			
		}
	}
	
	
	
	

}
