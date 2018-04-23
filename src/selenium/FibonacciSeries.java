package selenium;

import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		int i,no, first=0, second =1, next;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of terms of series");
        no =sc.nextInt();
        System.out.println("Fibonacci series are:");
        for(i=0; i<=no; i++)
        {
        	System.out.println(first); 
        	next=first+second;
        	first=second;
        	second=next;
        }
        
      
	}

}
