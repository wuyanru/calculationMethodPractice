package com.wuyanru.sort;

/* 
 * Javaʵ�ֿ��������㷨 
 * author:wyr 
 * 2016-7-14 
 */  
public class QuickSort {  
    public static void main(String[] args) {  
      
        int a[] = {3,1,5,7,2,4,9,6,10,8};    
        QuickSort  obj=new QuickSort();  
        System.out.println("��ʼֵ��");  
        obj.print(a);  
        int h=a.length-1;  
        obj.quickSort(a,0,h);  
        System.out.println("\n�����");  
        obj.print(a);  
    }  
    private  void quickSort(int[] a,int low, int high) {  
         if(low<high){ //�����������жϵݹ���޷��˳����¶�ջ����쳣  
              int middle=getMiddle(a,low,high);  
              quickSort(a,  0,  middle-1);          //�ݹ�Ե��ӱ�ݹ�����    
              quickSort(a,   middle + 1, high);        //�ݹ�Ը��ӱ�ݹ�����    
         }  
    }  
    public int getMiddle(int[] a, int low, int high){  
          
        int key = a[low];//��׼Ԫ�أ������л�ճ���һ��λ��  
        while(low<high){  
            while(low<high && a[high]>=key){//��high��ʼ�ұȻ�׼С�ģ���low��λ��  
                high--;  
            }  
            a[low]=a[high];  
            while(low<high && a[low]<=key){//��low��ʼ�ұȻ�׼��,�ŵ�֮ǰhigh�ճ�����λ����  
                low++;  
            }  
            a[high]=a[low];  
        }  
        a[low]=key;//��ʱlow=high �ǻ�׼Ԫ�ص�λ�ã�Ҳ�ǿճ������Ǹ�λ��  
        return low;  
        
    }  
    public void print(int a[]){  
        for(int i=0;i<a.length;i++){  
            System.out.print(a[i]+" ");  
        }  
    }  
}  

