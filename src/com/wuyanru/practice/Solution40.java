package com.wuyanru.practice;

import java.util.ArrayList;


/**
 * С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100�����������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22�����ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
�������:
������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
 * @author wuyanru
 *
 */
public class Solution40 {

	public static void main(String[] args) {
		int t=3;
		Solution40 s=new Solution40();
		ArrayList<ArrayList<Integer> > list=s.FindContinuousSequence(t);
		System.out.println("111111111111");
	}

	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer> > list=new ArrayList<ArrayList<Integer> >();
		for(int i=1;i<sum;i++){
			ArrayList<Integer> sumList=new ArrayList<Integer>();
			int  sumf=0;
			for(int j=i;j<=sum && sumf<=sum;j++){
				if(sumf<sum){
					sumf=sumf+j;
					sumList.add(j);
					continue;
				}else if(sumf==sum){
					list.add(sumList);
					break;
				}
			}
		}
		return list;
	       
    }
}
