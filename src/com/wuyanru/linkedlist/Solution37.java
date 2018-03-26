package com.wuyanru.linkedlist;

import com.wuyanru.sort.InsertSort;

/**
 * ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻������
 * ��������ͷָ�롣 ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
 * @author Administrator
 */
public class Solution37 {
	public ListNode deleteDuplication(ListNode pHead)
    {	
		if(pHead==null)
			return null;
		ListNode t=pHead.next;
		ListNode p=pHead;
		ListNode pre=pHead;
		int val=99999999;
		while(t !=null){
			if(p.val==t.val){
				val=p.val;
				p.next=t.next;
				t=p.next;
			}else if(p.val== val){
				pre.next=p.next;
				p=t;
				t=t.next;
			}else{
			
				pre=p;
				p=t;
				t=t.next;
			}
		}
		
		return pHead;
    }
	//�ݹ�ʵ��
	public ListNode deleteDuplication2(ListNode pHead)
    {	
		if(pHead==null || pHead.next == null)
			return null;
		if(pHead.val==pHead.next.val){
			ListNode node=pHead;
			while(node.val == pHead.val){
				node=node.next;
			}
			return deleteDuplication2(node);
		}else{
			pHead.next=deleteDuplication2(pHead.next);
			return pHead;
		}
    }
	
	public static void main(String[] args) {
		 int a[] = {1,1,1,1,1,1,2};
		 ListNode list=new ListNode();
		 list=list.createList(a);
		 list.printList(list);
		 Solution37 s=new Solution37();
		 s.deleteDuplication2(list);
		 list.printList(list);
		 	
	}
}
