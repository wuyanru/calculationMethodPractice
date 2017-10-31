package com.wuyanru.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *��ʵ��һ����������֮���δ�ӡ��������
 *����һ�а��մ����ҵ�˳���ӡ��
 *�ڶ��㰴�մ��������˳���ӡ��
 *�����а��մ����ҵ�˳���ӡ��
 *�������Դ����ơ�
 * @author wuyanru
 */
public class Solution48 {

	public static void main(String[] args) {
		String str="1,2,3,4,5,6";
		Solution48 s=new Solution48();
	}
    		
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> ret=new ArrayList<>();
		if(pRoot == null){
			return ret;
		}
		ArrayList<Integer> list=new ArrayList<>();
		LinkedList<TreeNode> queue =new LinkedList<TreeNode>();
		queue.addLast(null);
		queue.addLast(pRoot);
		boolean leftToRight=true;
		while(queue.size()!=1){
			TreeNode node=queue.removeFirst();
			if(node==null){//�����ָ��
				Iterator<TreeNode> iter=null;
				if(leftToRight){
					iter=queue.iterator();//��ǰ�������
				}else{
					iter=queue.descendingIterator();//�Ӻ���ǰ����
				}
				leftToRight=!leftToRight;
				while(iter.hasNext()){
					TreeNode temp=iter.next();
					list.add(temp.val);
				}
				ret.add(new ArrayList<Integer>());
				list.clear();
				queue.addLast(null);//��ӷֲ�ָ���
				continue;
			}
			if(node.left!=null){
				queue.addLast(node.left);
			}
			if(node.right!=null){
				queue.addLast(node.right);
			}
			
		}
		return ret;
    }
	
}
 