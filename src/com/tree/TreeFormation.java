package com.tree;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TreeFormation {
	
	Node rootTree;
	static int index=0;
	public static Node buildTree(int []inorder,int[]preorder,int start,int end){
		
		if(start>end){
			return null;
		}
		
		if(index>preorder.length-1){
			return null;
		}
		
		
		Node root=new Node(preorder[index++]);
		if(start==end){
			return root;
		}
		//int numpreorder=preorder[index++];
		
		int inorderindex=findIndexInInorder(inorder,root.data,start,end);
		//root=createNode(inorder[inorderindex]);
		
		root.left=buildTree(inorder,preorder,start,inorderindex-1);
		root.right=buildTree(inorder,preorder,inorderindex+1,end);
		
		return root;
	}
	
	public static  int findIndexInInorder(int []inorder,int num,int start,int end){
		
		int j=0;
		for(int i=start;i<=end;i++){
			
			if(inorder[i]==num){
				
				j=i;
				break;
			}
			
		}
		
		return j;
	}
	
	
	public static Node createNode(int data){
		Node n=new Node();
		n.data=data;
		n.left=null;
		n.right=null;
		return n;
	}
	
	
	public void printInorder(Node root){
		if(root==null)
			return ;
		printInorder(root.left);
		System.out.print(root.data+" ");
		printInorder(root.right);
		
		
	}
	public static void main(String[] args) {
		int []inorder={9,10,11,12,14,15};
		int []preorder={12,10,9,11,15,14};
		TreeFormation treeform=new TreeFormation();
		treeform.rootTree=treeform.buildTree(inorder,preorder,0,inorder.length-1);
		treeform.printInorder(treeform.rootTree);
	}
	
	
	

}
