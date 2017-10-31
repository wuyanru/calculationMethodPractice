package com.wuyanru.practice;

import java.util.ArrayList;


/**
 *汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 *对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，
 *即“XYZdefabc”。是不是很简单？OK，搞定它！
 * @author wuyanru
 *
 */
public class Solution42 {

	public static void main(String[] args) {
		Solution42 s=new Solution42();
		String str="";
		System.out.println(s.LeftRotateString(str, 3));;
	}

	public String LeftRotateString(String str,int n) {
		if(str.isEmpty())
			return "";
		char[] c=str.toCharArray();
		StringBuffer s=new StringBuffer();
		int m=c.length;
		for(int i=n;i<m+n;i++){
			s.append(c[i%(m)]);
		}
		return s.toString();
        
    }
}
