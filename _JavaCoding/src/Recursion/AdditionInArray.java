package Recursion;

public class AdditionInArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7};
	
	int sum=summary(a,a.length);
	System.out.println(sum);	
}
private static int summary(int[] a, int n)
{
	if(n<=0)
	return 0;
	return (summary(a, n-1)+ a[n-1]);
}
}
