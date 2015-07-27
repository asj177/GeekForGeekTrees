package com.tree;

import com.linkedlist.*;


public class CmpleteBinaryTreeCreation {
	
	public static Node root=new Node();
	
	
	
	public static Node create(int data){
		
		Node n=new Node();
		n.data=data;
		n.left=null;
		n.right=null;
		return n;
	}
	
	
	public static void completeTreeUsingLinkedList(Node node,ListNode head){
		
		if(head==null){
			return ;
		}
		
		node.data=head.data;
		
		if(head.next!=null){
			node.left=create(head.next.data);
		}
		
		if(head.next!=null){
			if(head.next.next!=null){
				node.right=create(head.next.next.data);
			}
		}
		
		completeTreeUsingLinkedList(node.left,head.next);
		
		if(head.next!=null){
		completeTreeUsingLinkedList(node.right,head.next.next);
		}
		
		
	}
	
	
	public static void createComplete(int []array,int index,Node n){
		
		if(index>array.length/2 || n==null){
			return ;
		}
		//System.out.println("index is "+index);
		int i=index;
	    n.data=array[index];
	    
	    int leftIndex=2*i+1;
	    int rightIndex=2*i+2;
	    
	    if(leftIndex<array.length){
	    n.left=create(array[leftIndex]);
	    }
	    
	    if(rightIndex<array.length){
	    n.right=create(array[rightIndex]);
	    }
		
	    createComplete(array,2*index+1,n.left);
	    createComplete(array,2*index+2,n.right);
		
	}
	
	public static void inorder(Node root){
		if(root==null){
			return ;
		}
		
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	
	public static void main(String[] args) {
		
		//int []array={1,2,3,4,5,6,7,8};
		
		
		//createComplete(array,0,root);
		
		
		LinkList l=new LinkList();
		l.insetIntoLinkedList(10);
		l.insetIntoLinkedList(12);
		l.insetIntoLinkedList(15);
		l.insetIntoLinkedList(25);
		l.insetIntoLinkedList(30);
		l.insetIntoLinkedList(36);
		completeTreeUsingLinkedList(root,l.head);
		
		inorder(root);
	}

}
