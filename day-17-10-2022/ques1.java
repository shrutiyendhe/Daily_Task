/*
  WAP using interface to create a process where you have to do the following process:
    1:Display the Basic info of an employee (name,phno,email,address,DOB)
    2:Display the Details of emp_info (Emp_id,dep,des,location,salary)
    
    Interface 1 method ()
    2 class same interface
      1st class(Basic info)
      2nd class(EMP Info)
*/

package abstraction;
public interface Employee 
{
	public void empInfo();  //method

}
--------------------------------------------------
package abstraction;
import java.util.Scanner;
public class BasicInfo implements Employee
{
	@Override
	public void empInfo() // interface method to take employee information from user
	{
		Scanner sc =new Scanner(System.in);
		String name,address,email,pNo;
		int d,m,y;
    
    // take the personal details of employee from user
		System.out.println("\n Enter the Name of Employee:");
		name=sc.next();
		
		System.out.println("\n Enter the Address of Employee:");
		address=sc.next();
		
		System.out.println("\n Enter the Email Id of Employee:");
		email=sc.next();
		
		System.out.println("\n Enter the Phone No. of Employee:");
		pNo=sc.next();
		
		System.out.println("\n Enter the Date Of Birth of Employee(as in format date-month-year):");
		d=sc.nextInt();
		m=sc.nextInt();
		y=sc.nextInt();
		System.out.println("\n Name of Employee:"+name);
		System.out.println("\n Employee Address:"+address);
		System.out.println("\n Employee Email Id:"+email);
		System.out.println("\n Employee Phone Number:"+pNo);
		System.out.println("\n Employee Date Of Birth:"+d+"-"+m+"-"+y);
	}
}
-------------------------------------------------------------------------------------------------
package abstraction;
import java.util.Scanner;
public class EMP_Info implements Employee
{
	@Override
	public void empInfo() // interface method to take employee information from user
	{
		Scanner sc =new Scanner(System.in);	
		int empId,salary;
		String dep,des,loc;
    
		// take the work details of employee from user
		System.out.println("\n Enter The Employee Id:");
		empId=sc.nextInt();
		
		System.out.println("\n Enter The Employee Department:");
		dep=sc.next();
		
		System.out.println("\n Enter The Designation of Employee:");
		des=sc.next();
		
		System.out.println("\n Enter The Location:");
		loc=sc.next();
		
		System.out.println("\n Enter The Salary:");
		salary=sc.nextInt();
		
		System.out.println("\n Employee Id:"+empId);
		System.out.println("\n Employee Department :"+dep);
		System.out.println("\n Employee Designation :"+des);
		System.out.println("\n Employee Location:"+loc);
		System.out.println("\n Employee Salary:"+salary);
	}
}
-------------------------------------------------------------------------------------
package abstraction;
public class Display  // this class is used to display employee's basic and work information
{

	public static void main(String[] args)  //main method
	{
		System.out.println("\n\t .... Basic Information of Employee .... ");
		BasicInfo obj=new BasicInfo();  // create object for BasicInfo.class to display basic info of employee
		obj.empInfo();
    
		System.out.println("\n\t .... Work Information of Employee .... ");
		EMP_Info ob=new EMP_Info(); // create object for EMP_Info.class to display work info of employee
		ob.empInfo();
	}
}
