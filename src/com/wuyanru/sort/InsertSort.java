package com.wuyanru.sort;

public class InsertSort {
	
	public static void main(String[] args) {
		 	int a[] = {3,1,5,7,2,4,9,6,10,8};      
	        InsertSort  obj=new InsertSort();    
	        System.out.println("��ʼֵ��");    
	        obj.print(a);    
	        obj.insertSort(a);    
	        System.out.println("\n�����");    
	        obj.print(a);    
		
	}
	 public void print(int a[]){    
	        for(int i=0;i<a.length;i++){    
	            System.out.print(a[i]+" ");    
	        }    
	    }    
    public void insertSort(int[] a) {    
       for(int i=1;i<a.length;i++){//i֮ǰ��Ϊ�Ѿ������
    	   int s=a[i];
    	   int j;
    	   for( j=i;j>0 && a[j-1]>s;j--){
    		  a[j]=a[j-1];
    	   }
    	   a[j]=s;
       }
            
    }    

}
