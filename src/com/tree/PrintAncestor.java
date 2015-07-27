package com.tree;

public class PrintAncestor {
	
	
	public static void printAncestor(Node root,int []path,int data,int level){
		
		if(root==null)
			return ;
		
		
         if(root.data==data){
        	 
        	 
        	 for(int i=0;i<path.length;i++){
        		 
        		 System.out.println(path[i]+" ");
        	 }
         }
		
         path[level]=root.data;
         
         printAncestor(root.left,path,data,level+1);
         printAncestor(root.right,path,data,level+1);
		
         path[level]=Integer.MIN_VALUE;
		
		
	}
	
	public static void NonRecursive(Node root){
		
		
	}
	
	public static int getHeight(Node root){
		
		if(root==null){
			return 0;
		}
		
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
		
	}
	
	
	public static void main(String[] args) {
		

		 BinaryTree tree=new BinaryTree();
			tree.insert(10);
			
			tree.insert(7);
			tree.insert(8);
			tree.insert(9);
			tree.insert(6);
			
			tree.insert(5);
			tree.insert(15);
			
			int []path=new int[getHeight(tree.root)];
			
			printAncestor(tree.root,path,9,0);
		
		
	}
	

}
