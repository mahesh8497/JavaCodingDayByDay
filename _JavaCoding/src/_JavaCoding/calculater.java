package _JavaCoding;

import java.util.Scanner;

public class calculater {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter first number");
	int num1 =sc.nextInt();
	System.out.println("Enter first number");
	int num2 =sc.nextInt();
	
	  System.out.println("Choose an operation:");
      System.out.println("+  Addition");
      System.out.println("-  Subtraction");
      System.out.println("*  Multiplication");
      System.out.println("/  Division");
      
      System.out.print("Enter operator: ");
      char operator = sc.next().charAt(0);
      double result;
	switch (operator) {
	case  '+':
		result=num1+num2;
		System.out.println("Addition: "+result);
		break;
	case '-':
		result=num1-num2;
		System.out.println("substraction"+result);
		break;
	case '*':
		result=num1*num2;
		System.out.println("multiplication"+result);
		break;
		
	case '/':
		if(num2!=0) {
			result=num1/num2;
			System.out.println("Division:"+result);
		}
		else {
            System.out.println("Error: Division by zero is not allowed");
        }
	
		break;
	   default:
           System.out.println("Invalid operator");
   }
		
	
}
}
