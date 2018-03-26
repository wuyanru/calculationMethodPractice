package leetCode.wuyanru.tree;

import com.wuyanru.tree.Solution47;
import com.wuyanru.tree.TreeNode;


/**
 * 
 * @author Administrator
 *Description:Given a binary tree, find its minimum depth.The minimum depth is the number of
              nodes along the shortest path from the root node down to the nearest leaf node.
           给定一个二叉树,找到最小深度。的最小深度是沿着最短路径节点的数量从根节点到最近的叶节点。    
 */

public class Solution1 {
	

	public int run(TreeNode root) {
		if(root==null)
			return 0;
		else if(root.left==null || root.right==null)
			return 1+run(root.left)+run(root.right);
		else
			return 1+min(run(root.left),run(root.right));
		
    }
	public int min(int a,int b){
		if(a>=b)
			return b;
		else 		
			return a;
	}
	
	public static void main(String[] args) {
		String str="1,2,3,4,5,6";
		Solution1 s=new Solution1();
		TreeNode root=s.Deserialize(str);
	    int minDepth=s.run(root);
	    System.out.println(minDepth);
		
		
		
		

	}
	/*
	 * 以下为基础构建树的代码
	 */
	//序列化树
	String Serialize(TreeNode root) {
		StringBuffer sb=new StringBuffer();
		if(root==null){
			sb.append("#,");
            return sb.toString();
		}
		sb.append(root.val+",");
		sb.append(Serialize(root.left));
		sb.append(Serialize(root.right));
		return sb.toString();
	}
	//构建树
	int index=-1;
    TreeNode Deserialize(String str) {
    	index++;
    	String[] strs=str.split(",");
    	if(index>=strs.length){
    		return null;
    	}
		TreeNode tree=null;
		if(!strs[index].equals("#")){
			tree=new TreeNode(Integer.valueOf(strs[index]));
			tree.left=Deserialize(str);
			tree.right=Deserialize(str);
		}
		return tree;
    }
}
