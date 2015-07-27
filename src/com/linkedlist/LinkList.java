package com.linkedlist;

public class LinkList {
	
	public ListNode head;
	
	public void insetIntoLinkedList(int data){
		
		ListNode n=new ListNode(data);
		
		if(head==null){
			head=n;
		}else{
			ListNode a=head;
			ListNode b=head;
			
			
			while(a!=null){
				b=a;
				a=a.next;
			}
			
			b.next=n;
			
		}
		
		
		
	}
	
	
	public void printData(){
		
		ListNode n=head;
		
		
		while(n!=null){
			
			System.out.println(n.data);
			n=n.next;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		LinkList l=new LinkList();
		l.insetIntoLinkedList(9);
		l.insetIntoLinkedList(10);
		l.insetIntoLinkedList(12);
		l.insetIntoLinkedList(13);
		l.printData();
	}
	
}
