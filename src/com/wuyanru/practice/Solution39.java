package com.wuyanru.practice;


/**
 * ��Ŀ����
 *��һ���ַ���ת����һ��������Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0
 *��������:
 *����һ���ַ���,����������ĸ����,����Ϊ��
 *�������:
 *����ǺϷ�����ֵ����򷵻ظ����֣����򷵻�0
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
		int flag=1;//0Ϊ��1Ϊ��
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
