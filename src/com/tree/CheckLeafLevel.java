package com.tree;

import java.util.ArrayList;

public class CheckLeafLevel {

	static ArrayList  leafLevel=new ArrayList();
	
	
	
	public static void checkLeafLevel(Node root,int level){
		
		if(root==null){
			return;
		}
		
		if(root.left==null && root.right==null){
			leafLevel.add(level);
		}
		checkLeafLevel(root.left,level+1);
		checkLeafLevel(root.right,level+1);
	}
	
	
	public static void main(String[] args) {
		
		BinaryTree tree=new BinaryTree();
		tree.insert(22);
		tree.insert(15);
		tree.insert(19);
		tree.insert(17);
		tree.insert(13);
		tree.insert(12);
		
		checkLeafLevel(tree.root,0);
		boolean leaf=true;
		for(int i=0;i<leafLevel.size()-1;i++){
			if(leafLevel.get(i)!=leafLevel.get(i+1)){
				leaf=false;
				break;
			}
		}
		
		if(leaf){
			System.out.println("leaf level same ");
		}else{
			System.out.println("leaf level not same ");
		}
	}
	
	
}
