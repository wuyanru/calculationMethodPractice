package com.wuyanru.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *请实现一个函数按照之字形打印二叉树，
 *即第一行按照从左到右的顺序打印，
 *第二层按照从右至左的顺序打印，
 *第三行按照从左到右的顺序打印，
 *其他行以此类推。
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
			if(node==null){//到达层分割符
				Iterator<TreeNode> iter=null;
				if(leftToRight){
					iter=queue.iterator();//从前往后遍历
				}else{
					iter=queue.descendingIterator();//从后往前遍历
				}
				leftToRight=!leftToRight;
				while(iter.hasNext()){
					TreeNode temp=iter.next();
					list.add(temp.val);
				}
				ret.add(new ArrayList<Integer>());
				list.clear();
				queue.addLast(null);//添加分层分隔符
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
 