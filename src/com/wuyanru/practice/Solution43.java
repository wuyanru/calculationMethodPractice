package com.wuyanru.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


/**
 *牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 *同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 *例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 *正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
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
