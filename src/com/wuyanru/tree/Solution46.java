package com.wuyanru.tree;



/**
 * ����һ�������������е�һ����㣬
 * ���ҳ��������˳�����һ����㲢�ҷ��ء�
 * ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
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
