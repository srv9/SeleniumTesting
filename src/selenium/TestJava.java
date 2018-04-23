package selenium;

import java.util.*;

public class TestJava {

	public static void main(String[] args) {
	int num, temp, sum=0; 	
	Scanner sc =new Scanner(System.in);
	num =sc.nextInt();
	System.out.println("Enter Integer number");
	temp=num;
	while (temp>0)
	{
		sum =(sum*10)+(temp%10);
		temp /=10;
	}
	if(num==sum);
	System.out.println(num+"number is Palindrome");
	

	}

}
