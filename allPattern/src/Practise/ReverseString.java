
package Practise;

import java.util.Scanner;

public class ReverseString{
    
    public static void main(String[] args)
	{
		System.out.println("Enter string to reverse:");
		
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		String c = "";
		
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			c += str.charAt(i);
		}
		
		System.out.println("Reversed string is:");
		System.out.println(c);
	}
    
}
