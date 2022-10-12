/*
  WAP to calculate the rate of interest of different bank by using Multiple inheritance.
*/
// as java doesn't support multiple inheritance concept so using inheritance concept given problem statement can be solved
package bank;
public interface sbi  // 1st banks interface
{
	public void sbi_int();
}
--------------------------------------------------
package bank;
public interface hdfc   // 2nd banks interface
{
	public void hdfc_int();
}
---------------------------------------------------
package bank;
public interface icici  // 3rd banks interface
{
	public void ici_int();
}
----------------------------------------------------
  
// main class 

package bank;
import java.util.*;
public class show implements sbi, hdfc, icici // inherits all 3 banks interfaces
{
	static int p,t;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principle amount :");
		p=sc.nextInt();
		System.out.println("Enter time :");
		t=sc.nextInt();
		
		show obj = new show();
		obj.sbi_int();
		obj.hdfc_int();
		obj.ici_int();
	}
	@Override
	public void sbi_int()
	{
		int r=5;
		double s = p*r*t/100;
		System.out.println("For SBI BANK, the principle amount "+p+ " for time "+t+"  has rate :"+s );
	}
	@Override
	public void hdfc_int() 
	{
		int r=8;
		double s = p*r*t/100;
		System.out.println("For HDFC BANK, the principle amount "+p+ " for time "+t+"  has rate :"+s );
	}
	@Override
	public void ici_int() {
		int r=11;
		double s = p*r*t/100;
		System.out.println("For ICICI BANK, the principle amount "+p+ " for time "+t+"  has rate :"+s );
	}	
}
