package com.wuyanru.tree;



/**
 * 给定一个二叉树和其中的一个结点，
 * 请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * @author wuyanru
 *
 */
public class Solution46 {

	public static void main(String[] args) {
		

	}
	public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
		if(pNode==null)return null;
		TreeLinkNode res;
		if(pNode.right==null){
		res=pNode;
		while(res.next!=null && res.next.right == res){
		res = res.next;
		}
		return res.next;
		}
		res=pNode.right;
		while(res.left!=null){
		res=res.left;
		}
		return res;
        
    }
	
}
