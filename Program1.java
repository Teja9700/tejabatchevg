package teja.mmm;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in); 
	System.out.println("please enter the number");
	int num = scanner.nextInt();
	//System.out.println(num);
	int remainder = num%2;                               // key is in this program is remainder
	switch(remainder) {                                  //  switch is key and values are in case
	case 0 :                                             // if 1lakh numbers are there, we cant create 1 lakh cases.
	      System.out.println("given num is even");       // thats why we use remainder option here.
	      break;                                         // default is always optional.
	case 1:
		System.out.println("given num is odd");
	      break;
	
	
	}
	
	scanner.close();

	}
	}
// only we can do == statements