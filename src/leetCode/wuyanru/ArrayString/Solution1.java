package leetCode.wuyanru.ArrayString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/*
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。

注意：答案中不可以包含重复的三元组。

例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，

满足要求的三元组集合为：
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */
public class Solution1 {
	
	
	public List<List<Integer>> threeSum(int[] nums) {//三层循环超时了
		int a=0,b=0,c=0;
		List list=new ArrayList<ArrayList<Integer>>();
		Arrays.sort(nums);
		if(nums==null || nums.length==0)
			return list;
		for(int i=0;i<nums.length;i++){
			a=nums[i];
			if(a > 0)	break;
			for(int j=i+1;j<nums.length;j++){
				b=nums[j];
				for(int k=j+1;k<nums.length;k++){
					c=nums[k];
					if(a+b+c==0){
						ArrayList t=new ArrayList<Integer>();
						t.add(a);
						t.add(b);
						t.add(c);
						Iterator it=list.iterator();
						boolean flag=true;
						while(it.hasNext()){
							List l=(List) it.next();
							if(l.contains(a) && l.contains(b) && l.contains(c) )
								flag=false;
							if(a==0 && b==0 && c==0 && !list.contains(t))
								flag=true;
						}
						if(flag==true)
							list.add(t); 
					}
				}
			}
		}
		return list;
    }

	public static void main(String[] args) {
		int[] arg={82597,-9243,62390,83030,-97960};
		Solution1 s=new Solution1();
		List<List<Integer>> list=s.threeSum(arg);
		for(List<Integer> item : list){
			for (Integer integer : item) {
				System.out.print(integer);
			}
			System.out.println();
		}
		

	}

}
