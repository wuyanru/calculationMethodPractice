package com.wuyanru.sort;

/* 
 * Javaѡ������
 * author:wyr 
 */  
public class SimpleSelectSort {  
  
    public static void main(String[] args) {  
        int a[] = {3,1,5,7,2,4,9,6,10,8};    
        SimpleSelectSort  obj=new SimpleSelectSort();  
        System.out.println("��ʼֵ��");  
        obj.print(a);  
        obj.selectSort(a);  
        System.out.println("\n�����");  
        obj.print(a);  
  
    }  
    private void selectSort(int[] a) {  
        for(int i=0;i<a.length;i++){  
            int k=i;//k�����Сֵ�±ꡣÿ��ѭ����Сֵ�±�+1  
            for(int j=i+1;j<a.length;j++){//�ҵ���Сֵ�±�  
                if(a[k]>a[j])  
                    k=j;  
            }  
            swap(a,k,i);//����Сֵ�ŵ����÷ŵ�λ����  
        }  
    }  
    public void print(int a[]){  
        for(int i=0;i<a.length;i++){  
            System.out.print(a[i]+" ");  
        }  
    }  
     public  void swap(int[] data, int i, int j) {    
            if (i == j) {    
                return;    
            }    
            data[i] = data[i] + data[j];    
            data[j] = data[i] - data[j];    
            data[i] = data[i] - data[j];    
        }    
}  