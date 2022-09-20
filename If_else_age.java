//WAP to accept age from user & check eligible for voting or not

import java.util.*;
class If_else_age
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.println("enter number:");
		age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("person is eligible to vote...");
		}
		else
		{
			System.out.println("person is NOT eligible to vote...");
		}
 	}
}
