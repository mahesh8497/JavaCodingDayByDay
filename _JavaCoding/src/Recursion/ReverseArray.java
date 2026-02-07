package Recursion;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int[]arr= {1,2,3,4,5};
	rev(arr,0);
	System.out.println(Arrays.toString(arr));
}

private static void rev(int[] arr, int i) {
	// TODO Auto-generated method stub
	int tem= arr[i];
	arr[i]=arr[arr.length-1-i];
	arr[arr.length-1-i]=tem;
	if(i<arr.length/2)
		i++;
	if(i<arr.length/2)
		rev(arr,i);
	
	
}
}
