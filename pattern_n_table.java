/*
 Question1 : print patterns using loops 
 Question2 : print multiplication table 
*/

import java.util.Scanner;

public class pattern_n_table 
{
	public static void main(String[] args) 
	{
		pattern_n_table obj=new pattern_n_table(); 
		obj.p1();
		obj.p2();
		obj.p3();
		obj.p4();
		obj.tab1();
		obj.tab2();
	}
	public void p1()
	{
		
		int i,j, alpha = 65; //ASCII value of capital A is 65   
		for (i=0;i<=5;i++)  
		{        
			for (j=0;j<i;j++)  
			{  
				System.out.print((char) (alpha + j) + " ");   
			}  
			System.out.println();  
		}  
	}
	
	public void p2()
	{
		Scanner s = new Scanner(System.in);
		int i,j,size;
		System.out.println("\n Enter size:");
		size = s.nextInt();
		
		for(i=1;i<=size;i++)
		{
			for(j=i;j<size;j++)
			{
				System.out.print(" ");
			}	
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void p3()
	{
		Scanner c=new Scanner(System.in);
		int i,j,size;
		System.out.println("\n Enter size:");
		size = c.nextInt();
		for(i=1;i<=size;i++)
		{
			for(j=i;j<size;j++)
			{
				System.out.print(" ");
			}	
			for(j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void p4()
	{
		Scanner sc=new Scanner(System.in);
		int size,i,j,p;
		char c;
		System.out.println("Enter size:");
		size = sc.nextInt();
		for(i=1;i<=size;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for( p=i;p<=size;p++)
			{
				if(p%2==0)
				{
					System.out.print("0");
				}
				else
				{
				System.out.print("1");
				}
			}
			System.out.println();
		}
	}
	
	// print multiplication table  
	public void tab1()
	{
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter number: ");       
		int num=sc.nextInt(); 
		for(int i=1; i <= 10; i++)  
		{  
		System.out.println(num+" * "+i+" = "+num*i);  
		}   
	}
	public void tab2()
	{
		System.out.println("The Table from 1 to 10: \n");
		for (int i = 1; i <= 10; i++) 
		{
			for (int j = 1; j <= 10; j++) 
			{
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}
	
}