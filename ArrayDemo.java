/*Q1:Write a program using array accept the size from the user than accordingly 
  accept the no from the user and find out the greater no,smaller no, ascending, Descending
  */
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args)
	{
		ArrayDemo obj=new ArrayDemo();
		int[] num=obj.acceptValue();
		obj.greaterNo(num);
		obj.smallerNo(num);
		obj.ascendingNo(num);
		obj.descendingNo(num);
	}
	public int[] acceptValue()
	{
		Scanner sc=new Scanner(System.in);
		int size,i;
		System.out.println("\nEnter the size");
		size=sc.nextInt();
		int num[]=new int[size];
		System.out.println("Enter " +size+ "Number:");
		for(i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		return num;
		
	}
	
	public void greaterNo(int[] num)
	{
		//int[] num=acceptValue();
        int biggest = num[0];
       
        for(int i=1; i< num.length; i++)
        {
                if(num[i] > biggest)
                        biggest = num[i];
        }
       
        System.out.println("Largest Number is : " + biggest);
	}
	
	public void smallerNo(int[] num)
	{
        int smallest = num[0];
       
        for(int i=1; i< num.length; i++)
        {
                if(num[i] < smallest)
                        smallest = num[i];
        }
       
        System.out.println("Smallest Number is : " + smallest);
	}
	public void ascendingNo(int[] num)
	{
		int i,temp=0;
		
		System.out.println("\nElements of original array: ");    
        for(i=0;i<num.length;i++)
        {     
            System.out.print(num[i] + "\n ");    
        }    
               
        for(i=0;i<num.length;i++) 
        {     
            for(int j=i+1;j<num.length;j++)
            {     
               if(num[i] > num[j])
               {    
                   temp = num[i];    
                   num[i] = num[j];    
                   num[j] = temp;    
               }     
            }     
        }
        System.out.println("\nElements of array in Ascending order: ");    
        for (i=0;i<num.length;i++)
        {     
            System.out.print(num[i] + "\n ");    
        }   
         
  	}
	
	
	public void descendingNo(int[] num)
	{
		int i,temp=0;
        for(i=0;i<num.length;i++) 
        {     
            for(int j=i+1;j<num.length;j++)
            {     
               if(num[i] < num[j])
               {    
                   temp = num[i];    
                   num[i] = num[j];    
                   num[j] = temp;    
               }     
            }     
        }
        System.out.println("\nElements of array in Descending order: ");    
        for (i=0;i<num.length;i++)
        {     
            System.out.print(num[i] + "\n ");    
        }
	}
	

}
