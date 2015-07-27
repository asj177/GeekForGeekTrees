package com.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.linkedlist.ListNode;

public class BinaryTreeToDoublyLinkedList {
	ListNode head=null;
	ListNode rear=null;
	
	Queue q=new LinkedList();
	
	
	public   void addInorderToQ(Node root){
		if(root==null){
			return;
		}
		
		addInorderToQ(root.left);
		q.add(root.data);
		addInorderToQ(root.right);
	}
	
	
	public void createDoublyLinkedList(){
		
		while(!q.isEmpty()){
			
			ListNode n=new ListNode((Integer)q.remove());
			
			if(head==null){
				head=n;
				
			}else{
				ListNode a=head;
				ListNode b=head;
				ListNode c=b;
				
				while(a!=null){
					b=a;
					c=b;
					a=a.next;
					
				}
				
				b.next=n;
				b=n;
				b.previous=c;
				
				rear=b;
			}
			
			
		}
		
	}
	
	public void forwardPrint(){
		
		ListNode forward=head;
		
		while(forward!=null){
			System.out.println(forward.data);
			forward=forward.next;
		}
	}
	
	public void backWardPrint(){
		
		ListNode backward=rear;
		
		while(backward!=null){
			System.out.println(backward.data);
			backward=backward.previous;
		}
	}
	
	
	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.insert(2);
		tree.insert(1);
		tree.insert(5);
		
		tree.insert(4);
		tree.insert(6);
		BinaryTreeToDoublyLinkedList db=new BinaryTreeToDoublyLinkedList();
		db.addInorderToQ(tree.root);
		db.createDoublyLinkedList();
		System.out.println("forward ");
		db.forwardPrint();
		System.out.println("backward");
		db.backWardPrint();
		
	}

}
