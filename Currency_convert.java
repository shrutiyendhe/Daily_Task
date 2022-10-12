/*
	Interface:
		WAP to convert the currency by using interface.
*/


package currency;

public interface convert 
{
	public void curr_convert();
}
-----------------------------------------------------------------------
package currency;
import java.util.*;
public class dollar implements convert  // for dollars
{
	public static void main(String[] args) 
	{
		dollar obj = new dollar();
		obj.curr_convert();
	}

	@Override
	public void curr_convert() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter dollar : ");
		int number=sc.nextInt();
		
		double conv = number * 82.27 ;	// 1$ is 82.27rupee 
		System.out.println(number+ " dollar in indian rupees is " +conv);
	}
}
---------------------------------------------------------------------------
  package currency;
import java.util.*;
public class euro implements convert  // for euro's
{
	public static void main(String[] args) 
	{
		euro obj =new euro();
		obj.curr_convert();
	}

	@Override
	public void curr_convert() 
  {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter euro : ");
		int number=sc.nextInt();
		
		double conv = number * 79.67 ;	// 1 euro is 79.67 rupee
		System.out.println(number+ " euro in indian rupees is " +conv);
	}
}
-------------------------------------------------------------------------------------
  package currency;
import java.util.*;
public class pound implements convert   // for pound's
{

	public static void main(String[] args) 
	{
		pound obj = new pound();
		obj.curr_convert();
	}

	@Override
	public void curr_convert() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter pound : ");
		int number=sc.nextInt();
		
		double conv = number * 90.80 ;	// 1 pound is 90.80 rupee
		System.out.println(number+ " pound in indian rupees is " +conv);
	}
}


