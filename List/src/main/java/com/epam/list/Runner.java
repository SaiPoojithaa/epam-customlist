package com.epam.list;

import java.util.Scanner;

public class Runner {
	public static void main(String args[])
	{
		System.out.println("1.Insert at Beginning");
		System.out.println("2.Insert at the end");
		System.out.println("3.Insert at given position");
		System.out.println("4.Delete at Beginning");
		System.out.println("5.Delete at the end");
		System.out.println("6.Delete at given position");
		System.out.println("7.Display the Elements");
		System.out.println("Enter 0 to stop");
		System.out.println("Enter your choice");
		
		 Linkedlist list=new Linkedlist();
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int choice;
		choice=scan.nextInt();
		int data;
		int position;
		while(choice!=0)
		{
		switch(choice)
		{
		case 1: 
			System.out.println("Enter the data to be inserted");
			data=scan.nextInt();
			list.insertFirst(data);
			System.out.println("List after inserting at beginning");
			list.print();
			break;
		case 2:
			System.out.println("Enter the data to be inserted");
			data=scan.nextInt();
			list.insert(data);
			System.out.println("List after inserting the end");
			list.print();
			break;
		case 3:
			System.out.println("Enter the data to be inserted");
			data=scan.nextInt();
			System.out.println("Enter the position");
			position=scan.nextInt();
			list.insertPosition(data, position);
			System.out.println("List after inserting at given position");
			list.print();
			break;
		case 4:
			list.deleteBeginning();
			System.out.println("List after deleting at beginning");
			list.print();
			break;
		case 5:
			list.deleteEnd();
			System.out.println("List after deleting at end");
			list.print();
			break;
		case 6:
			System.out.println("Enter the position to be deleted");
			position=scan.nextInt();
			list.deletePosition(position);
			System.out.println("List after deleting at given position");
			list.print();
			break;
		   	}
		  System.out.println("Enter your choice");
		choice=scan.nextInt();
	}
		System.out.println("The final list is");
	    list.print();

}
}
