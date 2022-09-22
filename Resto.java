//order food items and generate a bill

import java.util.*;

public class Resto 
{
	public static void main(String args[]) 
	{
		System.out.println("... Welcome ...");
		System.out.println("Please order....");
		int menu_item,order,item_amt=0,count=0,req=0;
		char ch;
		String item_name = "";
		Scanner s = new Scanner(System.in);
		do
		{
			System.out.println(" Menu:\n 1 : STARTERS \n 2 : MAIN COURSE \n 3 : DESERTS ");
			menu_item = s.nextInt();
			switch(menu_item)
			{
			case 1:
				System.out.println(".. STARTERS MENU..");
				System.out.println("1: Item 1 \t 320Rs.");
				System.out.println("2: Item 2 \t 400Rs.");
				System.out.println("3: Item 3 \t 580Rs.");
				order = s.nextInt();
				if(order==1) 
				{
					 System.out.println("enter quantity : ");
					 req = s.nextInt();
					 if(count<req)
					 {
					 item_amt = item_amt + 320;
					 item_amt = item_amt * req;
					 item_name+="\n STARTERS - Item 1";
					 }
				}
				else if(order==2)
				{
					System.out.println("enter quantity : ");
					 req = s.nextInt();
					 if(count<req)
					 {
					 item_amt = item_amt + 400;
					 item_amt = item_amt * req;
					 item_name+="\n STARTERS - Item 2";
					 }
				}
				else 
				{
					System.out.println("enter quantity : ");
					 req = s.nextInt();
					 if(count<req)
					 {
					 item_amt = item_amt + 580;
					 item_amt = item_amt * req;
					 item_name+="\n STARTERS - Item 3";
					 }
				}
				break;
			case 2:
				System.out.println(".. MAIN COURSE MENU ..");
				System.out.println("1: Item 1 \t 450Rs.");
				System.out.println("2: Item 2 \t 520Rs.");
				System.out.println("3: Item 3 \t 780Rs.");
				order = s.nextInt();
				if(order==1) 
				{
					System.out.println("enter quantity : ");
					 req = s.nextInt();
					 if(count<req)
					 {
					 item_amt = item_amt + 450;
					 item_amt = item_amt * req;
					 item_name+="\n MAIN COURSE - Item 1";
					 }
				}
				else if(order==2)
				{
					System.out.println("enter quantity : ");
					 req = s.nextInt();
					 if(count<req)
					 {
					 item_amt = item_amt + 520;
					 item_amt = item_amt * req;
					 item_name+="\n MAIN COURSE - Item 2";
					 }
				}
				else
				{
					System.out.println("enter quantity : ");
					 req = s.nextInt();
					 if(count<req)
					 {
					 item_amt = item_amt + 780;
					 item_amt = item_amt * req;
					 item_name+="\n MAIN COURSE - Item 3";
					 }
				}
				break;
			case 3:
				System.out.println(".. DESERTS MENU ..");
				System.out.println("1: Item 1 \t 220Rs.");
				System.out.println("2: Item 2 \t 280Rs.");
				System.out.println("3: Item 3 \t 350Rs.");
				order = s.nextInt();
				if(order==1) 
				{
					System.out.println("enter quantity : ");
					 req = s.nextInt();
					 if(count<req)
					 {
					 item_amt = item_amt + 220;
					 item_amt = item_amt * req;
					 item_name+="\n DESERTS - Item 1";
					 }
				}
				else if(order==2)
				{
					System.out.println("enter quantity : ");
					 req = s.nextInt();
					 if(count<req)
					 {
					 item_amt = item_amt + 280;
					 item_amt = item_amt * req;
					 item_name+="\n DESERTS - Item 2";
					 }
				}
				else 
				{
					System.out.println("enter quantity : ");
					 req = s.nextInt();
					 if(count<req)
					 {
					 item_amt = item_amt + 350;
					 item_amt = item_amt * req;
					 item_name+="\n DESERTS - Item 3";
					 };
				}
				break;
				default:
					System.out.println("Invalid choice");
					break;
			}
			System.out.println("Do you want to try any another item y/n");
			ch = s.next().charAt(0);
		}
		while(ch=='Y'||ch=='y');
		
		System.out.println("\t \t ...Thank You and Visit Again...");
		System.out.println("Food Items : \t "+item_name);
		System.out.println("quantity:");
		System.out.println("Total bill amount : \t"+item_amt);
	}
}
