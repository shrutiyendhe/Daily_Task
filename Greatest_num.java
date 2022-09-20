// WAP to accept 5 no.s from user and find out the greatest no.

import java.util.*;
class Greatest_num
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3,n4,n5;

		System.out.println("enter 1st no.");
		n1=sc.nextInt();	
		System.out.println("enter 2nd no.");
		n2=sc.nextInt();
		System.out.println("enter 3rd no.");
		n3=sc.nextInt();
		System.out.println("enter 4th no.");
		n4=sc.nextInt();
		System.out.println("enter 5th no.");
		n5=sc.nextInt();
		
		if(n1>n2 && n1>n3 && n1>n4 && n1>n5)
		{
			System.out.println(" FIRST number is Greatest " +n1);
		}
		else if(n2>n1 && n2>n3 && n2>n4 && n2>n5)
		{
			System.out.println(" SECOND number is Greatest " +n2);
		}
		else if(n3>n1 && n3>n2 && n3>n4 && n3>n5)
		{
			System.out.println(" THIRD number is Greatest " +n3);
		}
		else if(n4>n1 && n4>n2 && n4>n3 && n4>n5)
		{
			System.out.println(" FROTH number is Greatest " +n4);
		}
		else
		{
			System.out.println(" FIFTH number is Greatest " +n5);
		}
	}
}