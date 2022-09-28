import java.util.Scanner;
public class Student_info
{
	public static void main(String[] args)
	{
		acceptName();
		accept_Marks();

	}
	public static String[] acceptName()
	{
		Scanner sc=new Scanner(System.in);
		int size,i;
		System.out.println("Enter the size");
		size=sc.nextInt();
		String[] name=new String[size];
		System.out.println("Enter "+size+" Names:");
		for(i=0;i<size;i++)
		{
			name[i]=sc.next();
		}
		System.out.println("The Names are :");
		for(i=0;i<size;i++)
		{
			System.out.println(name[i]);
		}
		return name;
	}
	
	public static void accept_Marks()
	{

		Scanner sc = new Scanner(System.in);
		int mark;    
		float percentage;
		System.out.println("Enter the total subjects ");
		mark=sc.nextInt();
   
    
		int arr[] = new int[mark];
		System.out.println("Enter the marks secured in each subject ");
		for(int i=0;i<mark;i++)  
		{
			arr[i]=sc.nextInt();
		}
   
		int score=0;
		
		//Calculate the total marks
		for(int i=0;i<mark;i++)
		{
			score=score+arr[i];
		}
		System.out.println("The total marks obtained is "+score);
    
		//calculate percentage 
		percentage = (score / (float)mark);
		System.out.println( "Total Percentage : " + percentage + "%");
    
		//find out Grade
		System.out.print("The student Grade is: ");
		if(percentage>=90)
        {
            System.out.print("A+");
        }
		else if(percentage>=80)
        {
            System.out.print("A");
        }
        else if(percentage>=60 && percentage<80)
        {
           System.out.print("B");
        } 
        else if(percentage>=40 && percentage<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
		
	}
}
