package com.wuyanru.practice;


/**
 * 题目描述
 *将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 *输入描述:
 *输入一个字符串,包括数字字母符号,可以为空
 *输出描述:
 *如果是合法的数值表达则返回该数字，否则返回0
 * @author wuyanru
 *
 */
public class Solution39 {

	public static void main(String[] args) {
		String str="-12342342";
		Solution39 s=new Solution39();
		int m=s.StrToInt(str);
		System.out.println(m);
	}

	public int StrToInt(String str) {
		if(str ==null || str.isEmpty())
			return 0;
		int sum=0;
		int flag=1;//0为负1为正
		char[] a=str.toCharArray();
		for(int i=0;i<a.length;i++){
			if(a[i]=='+' || a[i]=='-')
			{
				if(a[i]=='+')
						flag=1;
					else
						flag=0;
				continue;
			}
			if(a[i]-48>=0 && a[i]-48<=9 )
					sum=sum*10+a[i]-48;
				else
					return 0;
			
		}
		if(flag==0)
			sum=sum*(-1);
		return sum;
	}
}
