package com.wuyanru.linkedlist;

import com.wuyanru.sort.InsertSort;

/**
 * 一个链表中包含环，请找出该链表的环的入口结点。
 * @author Administrator
 */
public class Solution38 {
		public ListNode EntryNodeOfLoop(ListNode pHead){
			if(pHead==null || pHead.next==null || pHead.next.next==null)
				return null;
			ListNode fast=pHead.next.next;
			ListNode slow=pHead.next;
			while(fast!=slow){
				fast=fast.next.next;
				slow=slow.next;
			}
			fast=pHead;
			while(fast!=slow){
				fast=fast.next;
				slow=slow.next;
			}
			
			return slow;
		}
	public static void main(String[] args) {
		 int a[] = {1,2,3,1,1,1,2};
		 ListNode list=new ListNode();
		 list=list.createList(a);
		 list.printList(list);
		 list.next.next.next.next=list.next.next;
		 Solution38 s=new Solution38();
		 list=s.EntryNodeOfLoop(list);
		 list.printList(list);
	}
}
