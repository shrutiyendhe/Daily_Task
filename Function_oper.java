/*
WAP to accept no. from user and perform following task:
1. logical operator
2. arithmetic operation
3. reverse of no.
4. swap a no. with using third variable
5. swap a no. withOUT using third variable
6. accept the value find out the factorial and pass the value of factorial to another function 7
7. find out sum of digit 
*/

import java.util.Scanner;
public class Function_oper
{
	int n1,n2,n3;
	int f;
	int sum_of=f;
	public static void main(String[] args) 
	{
		Function_oper obj = new Function_oper();	//creating object
		 obj.logic();
		 obj.arith();
		 obj.reve();
		 obj.swapp_with();
		 obj.swapp_with_out();
		 obj.facto();
		 obj.sod();
	}
	
	public void logic()
	{
		System.out.println("logical operation");
		Scanner s = new Scanner(System.in);
		System.out.println("enter three numbers: ");
		n1 = s.nextInt();
		n2 = s.nextInt();
		n3 = s.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("n1 is greater");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("n2 is greater");
		}
		else
		{
			System.out.println("n3 is greater");
		}
	}
	
	public void arith()
	{
		System.out.println("arithmetic operation");
		Scanner s = new Scanner(System.in);
		System.out.println("enter two numbers: ");
		n1 = s.nextInt();
		n2 = s.nextInt();
		n3=n1+n2;
		System.out.println("addition of numbers:"+n3);
	}
	
	public void reve()
	{
		System.out.println("Reverse a number");
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number: ");
		n1 = s.nextInt();
		
		int rev=0, temp=n1, rem;
		while(temp>0)
		{
			rem = temp % 10;
			rev = rev *10 + rem;
			temp = temp / 10;
		}
		System.out.println("reverse number:"+rev);
	}
	
	public void swapp_with()
	{
		System.out.println("swap with third variable");
		Scanner s = new Scanner(System.in);
		System.out.println("enter two numbers: ");
		n1 = s.nextInt();
		n2 = s.nextInt();
		System.out.println("before swap n1=" +n1+ "and n2="+n2);
		int temp;
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("after swap n1=" +n1+ "and n2="+n2);
	}
	
	public void swapp_with_out()
	{
		System.out.println("swap with_OUT third variable");
		Scanner s = new Scanner(System.in);
		System.out.println("enter two numbers: ");
		n1 = s.nextInt();
		n2 = s.nextInt();
		System.out.println("before swap n1=" +n1+ "and n2="+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("after swap n1=" +n1+ "and n2="+n2);
	}
	
	public void facto()
	{
		System.out.println("..Factorial Operation..");
		Scanner s = new Scanner(System.in);
		int n1,fact=1,f,i;
		System.out.println(" Enter number : ");
		n1 = s.nextInt();
		for(i=1; i<=n1; i++)
		{
			fact = fact * i;
		}
		f=fact;
		System.out.println("Factorial of number is : " +f);
		sum_of=f;
	}
	
	public void sod()
	{
		System.out.println("..Sum of Digits..");
		Scanner s = new Scanner(System.in);
		int digit, sum=0;
		//System.out.println("number:"+sum_of);
		while(sum_of>0)
		{
			digit = sum_of % 10;
			sum = sum + digit;
			sum_of = sum_of/ 10;
		}
		System.out.println("Sum of Digits of number is :" +sum);	
	}	
}
