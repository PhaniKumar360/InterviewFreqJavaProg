package org.com;

public class PalindromeNumberOrNot {
	public static void main(String[] args) {
		int num=99;
		int orginal_num=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(orginal_num==rev) {
			System.out.println("given number is palindorme::");
		}
		else {
			System.out.println("given number is not palindrome::");
		}
	}
}
