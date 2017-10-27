package com.wuyanru.linkedlist;

public class ListNode {
	int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
    ListNode() {   
    }
    
    ListNode createList(int a[]){//带空头结点的尾插发创建链表
    	ListNode head=new ListNode();
    	ListNode rel=head;
    	for(int i=0;i<a.length;i++){
    		ListNode p=new ListNode(a[i]);
    		p.next=null;
    		rel.next=p;
    		rel=p;
    	}
    	return head;
    }
    
    void printList(ListNode list){
    	list=list.next;
    	while(list !=null){
    		System.out.print(list.val+" ");
    		list=list.next;
    	}
    	System.out.println();
    }
}
