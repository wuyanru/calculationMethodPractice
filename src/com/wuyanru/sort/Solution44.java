package com.wuyanru.sort;

import java.util.ArrayList;


/**
 *����һ����������������һ������S���������в������������ǵ����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
 * @author wuyanru
 *
 */
public class Solution44 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};   
		Solution44 s=new Solution44();
		ArrayList<Integer> ar=s.FindNumbersWithSum(a, 21);
		System.out.println(ar.get(0)+" "+ar.get(1));
	}

	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		if(array==null)
			return new ArrayList<Integer>();
		ArrayList< ArrayList<Integer>> arr=new  ArrayList<ArrayList<Integer>>();
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]+array[j]>sum)
					break;
				else if(array[i]+array[j]==sum){
					ArrayList<Integer> a=new ArrayList<Integer>();
					a.add(array[i]);
					a.add(array[j]);
					arr.add(a);
				}
					
			}
		}
		
		if(arr.size()==0)
			return new ArrayList<Integer>();
		else{
			ArrayList<Integer> result=null;
			int m=9999999;
			for (ArrayList<Integer> it : arr) {
				if(it.get(0)*it.get(1)<m){
					m=it.get(0)*it.get(1);
					result=it;
				}
			}
			return result;
		}
		
    }
}
