package main;

import java.util.Arrays;
import java.util.ArrayList;

class Solution {
	 //static list to keep track of flips
	static ArrayList<Integer> k = new ArrayList<>();
	
	public static void pancakeSort(int[] inputArray) {
		
		//Go through all items starting from the end
		for (int i=inputArray.length; i>=1; i--) {
			//Find max value with current item
			int maxIndex=find(inputArray,i);
			//If max value is not found at the end, flip twice to
			if (maxIndex!=i-1) { 
				//Flip twice:
				flip(inputArray,maxIndex); //From the index it was found
				flip(inputArray,i-1); //From where the end position is
				//Record the two flips:
				k.add(maxIndex + 1); //where the maximum value was found
				k.add(i); //End position
			}
		}
	}

	private static int find(int[] a, int target) {
		int maxInd=0; //Set search for max value at the beginning
		//Go through all the items
		for (int i=1; i<target; i++) {
			//Assign new max value if current item is greater equal
			if(a[maxInd]<=a[i]) {
				maxInd=i;
			}

		}
		return maxInd; //return max value index
	}
	private static void flip(int[] a, int index) {
		int temp; //Initialize temp value
		//Swap values from beginning to index until the loop reaches the middle
		for (int i=0; i<=index/2; i++) {
			temp=a[i];
			a[i]=a[index-i];
			a[index-i]=temp;

		}
	}
	//start
	public static void main(String[] args){
		int[] arr = {7,2,5,23,21,38,1,7,8,9,10,20,200,300};
		//int[] arr = {3, 2, 4, 1};

		pancakeSort(arr);
			System.out.println(Arrays.toString(arr));
			
		System.out.println("\nFlip(k) Iterations:");
		System.out.print(k.toString());


	}
}
