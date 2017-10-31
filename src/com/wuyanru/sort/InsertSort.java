package com.wuyanru.sort;

public class InsertSort {
	
	public static void main(String[] args) {
		 	int a[] = {3,1,5,7,2,4,9,6,10,8};      
	        InsertSort  obj=new InsertSort();    
	        System.out.println("初始值：");    
	        obj.print(a);    
	        obj.insertSort(a);    
	        System.out.println("\n排序后：");    
	        obj.print(a);    
		
	}
	 public void print(int a[]){    
	        for(int i=0;i<a.length;i++){    
	            System.out.print(a[i]+" ");    
	        }    
	    }    
    public void insertSort(int[] a) {    
       for(int i=1;i<a.length;i++){//i之前的为已经排序的
    	   int s=a[i];
    	   int j;
    	   for( j=i;j>0 && a[j-1]>s;j--){
    		  a[j]=a[j-1];
    	   }
    	   a[j]=s;
       }
            
    }    

}
