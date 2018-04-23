package selenium;
import java.lang.*;
import java.io.*;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		
		String input = "INDIGEN";
		StringBuilder input1 =new StringBuilder();
		input1.append(input);
        input1 =input1.reverse();
        
        
        System.out.print(input1);	
	}

}
