package com.wuyanru.practice;

import java.util.ArrayList;


/**
 *�����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ�����������
 *����һ���������ַ�����S���������ѭ������Kλ���������������磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ����
 *����XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
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
