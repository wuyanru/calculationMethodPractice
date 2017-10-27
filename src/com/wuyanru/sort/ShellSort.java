package com.wuyanru.sort;

/* 
 * Java实现希尔排序（缩小增量排序） 
 * author:wyr 
 * 2016-7-14 
 *两个步骤：1，建堆  2，对顶与堆的最后一个元素交换位置 
 */  
public class ShellSort {  
  
    public static void main(String[] args) {  
        int a[] = {3,1,5,7,2,4,9,6,10,8};    
        ShellSort  obj=new ShellSort();  
        System.out.println("初始值：");  
        obj.print(a);  
        obj.shellSort(a);  
        System.out.println("\n排序后：");  
        obj.print(a);  
  
    }  
    private void shellSort(int[] a) {  
       int dk=a.length;
       while(dk>=1){
    	   ShellInsertSort(a,dk);
    	   dk=dk/2;
       }
    }  
    private void ShellInsertSort(int[] a, int dk) {//类似插入排序，只是插入排序增量是1，这里增量是dk,把1换成dk就可以了  
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