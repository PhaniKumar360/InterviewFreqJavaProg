package org.com;

import java.util.Scanner;

public class SumOFNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number from Keyboard::");
		int num=scan.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println(sum + " is the sum of the given natural number::");

}
}