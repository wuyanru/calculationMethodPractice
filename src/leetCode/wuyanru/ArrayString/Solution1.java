package leetCode.wuyanru.ArrayString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/*
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。

注意：答案中不可以包含重复的三元组。

例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，

满足要求的三元组集合为：
[1
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
	//一下为正确解法，考虑的比较仔细的。
	public List<List<Integer>> threeSum2(int[] nums) {
		Set<List<Integer>> result = new HashSet<>();//避免[0,0,0]多次出现
		if (null == nums || nums.length < 3)
			return new LinkedList<List<Integer>>(result);
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++)
			for (int j = i + 1; j < nums.length - 1; j++) {
				int[] res = searchRange(nums, j + 1, nums.length - 1, -(nums[i] + nums[j]));//确定前面两个数再去判断最后一个数
				//（最后一个数必须是前面两个数的相反数才能和为0，且次数必定是正数或0）因此就转换成了查找问题。
				if (res[0] > -1) {
					result.add(Arrays.asList(nums[i], nums[j], nums[res[0]]));
				}
			}
		return new LinkedList<List<Integer>>(result);
	}

	int[] searchRange(int[] nums, int lo, int hi, int target) {//此为二分查找目标对象的方法
		if (target < nums[lo] || target > nums[hi] || lo > hi) {//目标小于最小，大于最大直接不合法。
			return new int[] { -1, -1 };
		}
		if (nums[lo] == nums[hi] && nums[lo] == target) {//最大=最小=目标对象
			return new int[] { lo, hi };//俩都返回
		}
		//二分法开始查找（递归）
		int mid = (lo + hi) / 2;
		if (target > nums[mid]) {
			return searchRange(nums, mid + 1, hi, target);
		} else if (target < nums[mid]) {
			return searchRange(nums, lo, mid, target);
		} else {
			int[] res1 = searchRange(nums, lo, mid, target);
			int[] res2 = searchRange(nums, mid + 1, hi, target);
			if (res2[0] > 0) {
				return new int[] { res1[0], res2[1] };
			} else {
				return res1;
			}
		}
	}

	public static void main(String[] args) {
		int[] arg={-1, 0, 1, 2, -1, -4};
		Solution1 s=new Solution1();
		List<List<Integer>> list=s.threeSum2(arg);
		for(List<Integer> item : list){
			for (Integer integer : item) {
				System.out.print(integer);
			}
			System.out.println();
		}
		

	}

}
