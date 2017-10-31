package com.wuyanru.tree;




/**
 *请实现两个函数，分别用来序列化和反序列化二叉树
 * @author wuyanru
 *
 */
public class Solution47 {

	public static void main(String[] args) {
		String str="1,2,3,4,5,6";
		Solution47 s=new Solution47();
		s.Deserialize(str);
		
		

	}
	
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
