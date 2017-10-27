package com.wuyanru.sort;

public class BubbleSort {
	public static void main(String[] args) {
		 int a[] = {3,1,5,7,2,4,9,6,10,8};      
	        InsertSort  obj=new InsertSort();    
	        System.out.println("≥ı º÷µ£∫");    
	        obj.print(a);    
	        obj.insertSort(a);    
	        System.out.println("\n≈≈–Ú∫Û£∫");    
	        obj.print(a);    
		
	}
	 public void print(int a[]){    
	        for(int i=0;i<a.length;i++){    
	            System.out.print(a[i]+" ");    
	        }    
	    }    
   public void bubbleSort(int[] a) {    
	   for(int i =0 ; i< a.length-1; ++i) {  
	        for(int j = 0; j < a.length-i-1; ++j) {  
	            if(a[j] > a[j+1])  
	            {  
	                int tmp = a[j] ; a[j] = a[j+1] ;  a[j+1] = tmp;  
	            }  
	        }  
	    }  
   }    
}
