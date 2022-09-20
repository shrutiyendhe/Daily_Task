//WAP to accept no. from user & display square if no. is divisible by 5

import java.util.*;
class If_num
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("enter number:");
		num = sc.nextInt();
		if(num%5==0)
		{
			System.out.println("\nNumber is:" +num);
			System.out.println("Number is divisible by 5");
			System.out.println("Square of number is:" +num*num);
		}
 	}
}
