package com.tree;

public class IsoMorphic {
	
	
	public static boolean checkIsoMorphic(Node root1,Node root2){
		
		if(root1==null && root2==null){
			return true;
		}
		
		if(root1.data!=root2.data){
			
			
			return false;
		}
		
		
		return checkIsoMorphic(root1.left,root2.right)&&checkIsoMorphic(root1.right,root2.left);
		
		
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
	}

}
