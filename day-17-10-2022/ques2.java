/*  Question2
  WAP to to do the following process by using abstract class:
    1) abstract class:(Gross, total deduction ,Net)
    2) another different class : which will display the Employee detilas and Final Salary in hand amount.
*/

package abstraction;
import java.util.Scanner;
public abstract class CalSalary extends Display // display class is from question1 
{	
	public static void calc()   // method to take Gross salary, Total Deduction and Net-wroth from user
	{
		Scanner sc =new Scanner(System.in);
		int gross,tot,net;
	
		System.out.println("Enter The Gross salary :");
		gross =sc.nextInt();
		System.out.println("Enter The Total Deduction:");
		tot =sc.nextInt();
		net = gross - tot;
		System.out.println("the total Net-wroth of employee:"+net);
	}
}
-------------------------------------------------------------------------------------------------------------------
package abstraction;
public class Disp extends CalSalary // calling abstract class 
{
	public static void main(String[] args)
	{
		Disp ob=new Disp(); // creating object
		ob.calc();  // method from abstract class
		ob.print(); // method from Display class
	}
}
