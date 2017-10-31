package com.wuyanru.sort;

import java.util.ArrayList;


/**
 *统计一个数字在排序数组中出现的次数。
 * @author wuyanru
 *
 */
public class Solution41 {

	public static void main(String[] args) {
		int a[] = {1,1,3,5,5,6,7,8,8,8};   
		Solution41 s=new Solution41();
		System.out.println(s.GetNumberOfK(a, 8));
	}

	public int GetNumberOfK(int [] array , int k) {
		if(array==null || array.length==0){
			return 0;
		}
		int num=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==k)
				num++;
		}
		return num;
    }
}
