package main;

import java.util.Arrays;

class Solution {
    public static void pancakeSort(int[] inputArray) {
    	
    	for (int i=inputArray.length; i>1; i--) {
    		int maxIndex=find(inputArray,i);
    		if (maxIndex!=i-1) {
    			flip(inputArray,maxIndex);
    			flip(inputArray,i-1);
    		}
    	}
    }
    
    private static int find(int[] a, int target) {
    	int maxInd=0;
    	for (int i=1; i<target; i++) {
    	  if(a[maxInd]<=a[i]) {
    		  maxInd=i;
    	  }
    	  
      }
    	return maxInd;
    }
    private static void flip(int[] a, int index) {
    	int temp;
    	for (int i=0; i<index/2; i++) {
    		temp=a[i];
    		a[i]=a[index-i];
    		a[index-i]=temp;
    		
    		}
    }
//start
    public static void main(String[] args){
        int[] arr = {7,2,5,23,21,38,1,7,8,9,10,20,200,300};
    
        pancakeSort(arr);
        for(int a:arr) {
        	System.out.print(a+", ");
        }
       
    
    }
}
