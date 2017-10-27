package com.wuyanru.sort;

/* 
 * Javaʵ��ϣ��������С�������� 
 * author:wyr 
 * 2016-7-14 
 *�������裺1������  2���Զ���ѵ����һ��Ԫ�ؽ���λ�� 
 */  
public class ShellSort {  
  
    public static void main(String[] args) {  
        int a[] = {3,1,5,7,2,4,9,6,10,8};    
        ShellSort  obj=new ShellSort();  
        System.out.println("��ʼֵ��");  
        obj.print(a);  
        obj.shellSort(a);  
        System.out.println("\n�����");  
        obj.print(a);  
  
    }  
    private void shellSort(int[] a) {  
       int dk=a.length;
       while(dk>=1){
    	   ShellInsertSort(a,dk);
    	   dk=dk/2;
       }
    }  
    private void ShellInsertSort(int[] a, int dk) {//���Ʋ�������ֻ�ǲ�������������1������������dk,��1����dk�Ϳ�����  
       for(int i=dk;i<a.length;i++){
    	   int j;
    	   int s=a[i];
    	   for(j=i;j>=dk && a[j-dk]>a[j];j=j-dk){
    		   a[j]=a[j-dk];
    	   }
    	   a[j]=s;
       }
          
    }  
    public void print(int a[]){  
        for(int i=0;i<a.length;i++){  
            System.out.print(a[i]+" ");  
        }  
    }  
}  