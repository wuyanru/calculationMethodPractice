package com.wuyanru.sort;

/* 
 * Javaʵ�ֶ������㷨���Ľ��� 
 * �ɴ�С���� 
 * author:wyr 
 * 2017-10-24 
 *�������裺1������  2���Զ���ѵ����һ��Ԫ�ؽ���λ�� 
 */  
public class HeapSort {  
  
    public static void main(String[] args) {  
        int a[] = {3,1,5,7,2,4,9,6,10,8};    
        HeapSort  obj=new HeapSort();  
        System.out.println("��ʼֵ��");  
        obj.print(a);  
          
        for(int i=0;i<a.length;i++){  
            obj.createLittleHeap(a,a.length-1-i);//������,��������С���ѡ�ÿ��ѭ���꣬�������ĸ��ڵ㶼����Сֵ���������ʱ��δ�źò������һ��ֵ����λ��  
            obj.swap(a, 0, a.length - 1 - i);//�����һ��ֵ����λ�ã���Сֵ�ҵ���λ��  
            obj.print(a);  
            System.out.println();  
              
        }  
          
        System.out.println("\n�����");  
        obj.print(a);  
  
    }  
    /* 
     * ����С���ѣ�˫�׽ڵ�С���ӽڵ��ֵ����Ҷ�ӽڵ㿪ʼ��ֱ�����ڵ㡣���������ĶѶ�λ��Сֵ 
     */  
    private void createLittleHeap(int[] data, int last) {  
    	for(int i=last;i>0;i--){
    		int parent=(i-1)/2;//��ǰ�ڵ��˫�׽ڵ�
    		if(data[parent]> data[i])
    		swap(data, parent, i);   
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
