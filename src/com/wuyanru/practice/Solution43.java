package com.wuyanru.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


/**
 *ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�
 *ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼��
 *���磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ�
 *��ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 * @author wuyanru
 *
 */
public class Solution43 {

	public static void main(String[] args) {
		Solution43 s=new Solution43();
		System.out.print(s.ReverseSentence(" "));
	}

	public String ReverseSentence(String str) {
		if(str==null||str.length()==0||str.trim().length()==0)
	            return str;
		String s[] =str.split(" ");
		StringBuffer buf=new StringBuffer();
		for(int i=s.length-1;i>=0;i--){
			buf.append(s[i]);
			if(i!=0 || str.trim().length()==0)
			buf.append(" ");
		}
		
		Queue list=new LinkedList();
		list.add("111111111");
		list.add("2222222222");
		Iterator it=list.iterator();
		while(it.hasNext()){
		     String node=(String) it.next();
		    
		}
		return buf.toString();
    }
}
