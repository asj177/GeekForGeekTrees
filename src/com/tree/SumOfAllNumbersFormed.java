package com.tree;

public class SumOfAllNumbersFormed {
	
	public static void formNumber(int[]numbers){
		
		int sum=0;
		
		int place=1;
		System.out.println("Path with ");
		for(int i=numbers.length-1;i>=0;i--){
			if(numbers[i]!=0){
			sum=sum+numbers[i]*place;
			place=place*10;
			System.out.print(numbers[i]+" ");
			}
		}
		System.out.print("====>>>"+sum);
		System.out.println(" ");
	}
	
	public static void pathPrint(Node root,int []number,int level){
		if(root==null){
			return;
		}
		
		
		if(root.left==null&& root.right==null){
			number[level]=root.data;
			formNumber(number);
			
		}
		
		number[level]=root.data;
		
		pathPrint(root.left,number,level+1);
		pathPrint(root.right,number,level+1);
		number=new int[4];
	}
	
	public static void main(String[] args) {
		 BinaryTree tree=new BinaryTree();
			tree.insert(7);
			tree.insert(8);
			tree.insert(9);
			tree.insert(3);
			tree.insert(5);
			tree.insert(4);
			tree.insert(6);
			tree.insert(2);
			
			int[]numbers=new int[4];
			pathPrint(tree.root,numbers,0);
			
	}

}
