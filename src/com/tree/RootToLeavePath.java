package com.tree;

public class RootToLeavePath {

	
	
	static void printrootToLeafPath(int level,int[] path,Node root){
		
		if(root==null){
			return ;
		}
		
		if(root.left==null && root.right==null){
			path[level]=root.data;
			
			for(int i=path.length-1;i>=0;i--){
				System.out.print(path[i]+" ");
			}
			System.out.println(" ");
		}
		
		path[level]=root.data;
		printrootToLeafPath(level+1,path,root.left);
		printrootToLeafPath(level+1,path,root.right);
	}
	
	
      
	
	
	static int getSize(Node root){
		
		if(root==null){
			return 0;
		}
		
		return Math.max(getSize(root.left), getSize(root.right))+1;
	}
	
	
	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.insert(5);
		tree.insert(3);
		tree.insert(2);
		tree.insert(4);
		
		
		tree.insert(8);
		tree.insert(7);
		tree.insert(9);
		
		int sizeOfTree=getSize(tree.root);
		
		int []path=new int[sizeOfTree];
		printrootToLeafPath(0,path,tree.root);
	}
	
}
