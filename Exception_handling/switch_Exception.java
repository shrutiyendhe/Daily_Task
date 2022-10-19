/*	EXCEPTION HANDLING
	WAP to choice option from user and to do the following operations : 
  		1.try catch	-> arithmetic operation
		2:try catch finally	-> accept the size and than accept no arr[size+1]=45;
		3:nested try catch	-> arithmetic, array, accept name from user than display the name, assign null value to name. display the hascode
		4:multiple catch block	-> arithmetic, array, accept name from user than display the name, assign null value to name. display the hascode
*/

package exception;
import java.util.Scanner;
public class switch_Exception 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int ch;
		char ans;

		do {
			System.out.println( "Enter choice to perform :  \n\t 1. try-catch \n\t 2. try-catch-finally \n\t 3. nested try-catch block \n\t 4. multiple catch block ");
			ch = sc.nextInt();
			switch (ch) 
			{
				case 1:	// try-catch block with arithmetic operation
				try 
				{
					int n1, n2, res;
					System.out.println("Enter two numbers : ");
					n1 = sc.nextInt();
					n2 = sc.nextInt();

					res = n1 + n2;
					System.out.println("The Addition is =" + res);
					
					res = n1 / n2;
					System.out.println("Division is =" + res);
					
					res = n1 * n2;
					System.out.println("Multiplication is =" + res);
					
					res = n1 - n2;
					System.out.println("Subtraction is =" + res);
					
				} 
				catch (Exception e) 
				{
					System.out.println("2nd number cann't be zero");
				}
				break;
			case 2:		//try-catch-finally with array
				try 
				{
					int size, i;
					System.out.println("Enter size to array elements : ");
					size = sc.nextInt();
					int arr[] = new int[size];
					arr[size + 1] = 45;
					for (i = 0; i < size; i++) 
					{
						System.out.println("Array=" + arr[i]);
					}
				} 
				catch (ArrayIndexOutOfBoundsException e) 
				{
					System.out.println("Array size is greater from  declared ");
				} 
				finally 
				{
					System.out.println(" WARNING! This Operation can raise an exception");
				}
				break;
			case 3:		//nested try-catch block with arithmetic operation, array, name
				try 
				{
					int n1, n2, res;

					System.out.println("Enter two numbers : ");
					n1 = sc.nextInt();
					n2 = sc.nextInt();

					res = n1 + n2;
					System.out.println("The Addition is =" + res);
					res = n1 / n2;
					System.out.println("Division is =" + res);
					res = n1 * n2;
					System.out.println("Multiplication is =" + res);
					res = n1 - n2;
					System.out.println("Subtraction is =" + res);
				} 
				catch (Exception e) 
				{
					System.out.println("2nd number cann't be zero");
				}
				try 
				{
					int size, i;
					System.out.println("Enter size to array elements : ");
					size = sc.nextInt();
					int arr[] = new int[size];
					arr[size + 1] = 45;
					for (i = 0; i < size; i++) {
						System.out.println("Array=" + arr[i]);
					}
				} 
				catch (ArrayIndexOutOfBoundsException e) 
				{
					System.out.println("Array size is greater from  declared");
				}
				try 
				{
					String name;
					name = null;	// assign name to NUll
					System.out.println("Enter name:");	//  accept name
					name = sc.next();

					System.out.println("The name is=" + name.hashCode());	// display name's hash code
				} 
				catch (NullPointerException n) 
				{
					System.out.println("Name cannot be NULL");
				} 
				finally 
				{
					System.out.println("Expection can be raised for name");
				}
				break;
			case 4:		//multiple catch block with with arithmetic operation, array, name
				try {
					int num1, num2, res;

					System.out.println("Entre two number:");
					num1 = sc.nextInt();
					num2 = sc.nextInt();

					res = num1 * num2;
					System.out.println("multiplication of two numbers =" + res);

					res = num1 / num2;
					System.out.println("division of two  numbers =" + res);

					res = num1 + num2;
					System.out.println("addition of two numbers =" + res);

					res = num1 - num2;
					System.out.println("Substraction of two numbers =" + res);

					int size, i;
					System.out.println("Enter size for array to store elements : ");
					size = sc.nextInt();
					int arr[] = new int[size];
					arr[size + 1] = 45;
					for (i = 0; i >= 0; i++)
						System.out.println("Array=" + arr[i]);

					String name;
					name = null;
					System.out.println("Enter your name:");
					name = sc.next();
					System.out.println("The name is=" + name.hashCode());

				} 
				catch (ArrayIndexOutOfBoundsException e) 
				{
					System.out.println("The Array size is greater than it's declared.\n");
				}
				catch (NullPointerException n) 
				{
					System.out.println("Nme can not be NULL");
				}
				catch (Exception e) 
				{
					System.out.println("2nd number cann't be zero");
				} 
				finally 
				{
					System.out.println("This is an example of Expection Handling.");
				}
				break;
			}
			System.out.println("Do you want to select another option Yes/No");
			ans = sc.next().charAt(0);
		} 
    while (ans == 'Y' || ans == 'y');
		System.out.println("You have selected No, so the proccess is stoped");
	}
}
