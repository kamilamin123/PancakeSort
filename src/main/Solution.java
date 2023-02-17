package main;

import java.util.Arrays;

class Solution {
    public static void pancakeSort(int[] inputArray) {
    	
    	for (int i=1; i<=inputArray.length;i++) {
    		int target=find(inputArray,inputArray.length-i+1);
    		System.out.println(target);
    		flip(inputArray,target);
    		flip(inputArray,inputArray.length-i);
    		
    	}
    }
    
    private static int find(int[] a, int target) {
    	int indMax=0;
    	for (int i=1; i<target; i++) {
    	  if(a[indMax]<=a[i]) {
    		  indMax=i;
    	  }
    	  
      }
    	return indMax;
    }
    private static void flip(int[] a, int index) {
    	int temp;
    	for (int i=0; i<=index-i; i++) {
    		temp=a[i];
    		a[i]=a[index-i];
    		a[index-i]=temp;
    		
    		}
    }
//start
    public static void main(String[] args){
        int[] arr = {7,2,5,1,7,8,9};
    
        pancakeSort(arr);
        for(int a:arr) {
        	System.out.print(a);
        }
       
    
    }
}
