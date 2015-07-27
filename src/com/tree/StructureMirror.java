package com.tree;

public class StructureMirror {

	
	public static boolean checkStructure(Node root1,Node root2){
		
		if(root1==null&&root2==null){
			return true;
		}
		
		if(root1==null || root2==null){
			return false;
		}
		
		return (checkStructure(root1.left,root2.right) && checkStructure(root1.right,root2.left));
		
		
		
	}
	
	public static void main(String[] args) {
		
		 BinaryTree tree=new BinaryTree();
			tree.insert(10);
			
			tree.insert(7);
			tree.insert(8);
			tree.insert(6);
			
			tree.insert(5);
			
			
			boolean check=checkStructure(tree.root.left,tree.root.right);
			
			if(check){
				System.out.println("Foldable");
			}else{
				System.out.println("Not foldable");
			}
		
	}
}
