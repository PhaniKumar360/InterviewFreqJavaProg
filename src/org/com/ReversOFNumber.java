package org.com;

public class ReversOFNumber {
	public static void main(String[] args) {
	
		int num=792;
		System.out.println("given number is ::" +num);
		int rev=0;
		while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
		
		}
		System.out.println("the rev of given number is::"+rev);
		}
	}
		



