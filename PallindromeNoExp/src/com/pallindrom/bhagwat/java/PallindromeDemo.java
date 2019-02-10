package com.pallindrom.bhagwat.java;

public class PallindromeDemo {

	public static void main(String[] args) {
	
     int n=151;
     int r,sum=0,temp;
     temp=n;
     while (n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if (temp==sum){
		
	
		System.out.println(" is pallindrome");
	}
	else
	{
		System.out.println("is not pallindrome");
	}
		
		
	}

}
