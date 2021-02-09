package org.com;

import java.util.Scanner;

public class SwapUsingThird {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values from Key board:: for a is::");
		int a=scan.nextInt();
		System.out.println("Enter the values from Key board:: for b is::");
		int b=scan.nextInt();
		int t;
		System.out.println("Print values before swapping " +"a is::="+a +" and "+ "b is::="+b);
		
		t=a;
		a=b;
		b=t;
		System.out.println("Print values after swapping " +"a is::="+a +" and "+ "b is::="+b);
	}

}
