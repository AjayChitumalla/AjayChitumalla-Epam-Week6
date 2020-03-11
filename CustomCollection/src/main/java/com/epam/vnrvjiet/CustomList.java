package com.epam.vnrvjiet;

import java.util.*;
//import java.io.*;
public class CustomList 
{
  public static void main( String[] args )
  {
  	FunctionsofList listobj=new FunctionsofList();
  	char tocontinue='y';
  	Scanner sc=new Scanner(System.in);
  	while(tocontinue=='y')
  	{
	       System.out.println( "Enter an operation to perform: \n 1) Inserting an Element \n 2)Deleting an Element \n 3)Fetching an Element\n 4)Printing the elements of the List");
	       
	       int Selectedopt,index;
	       Selectedopt=sc.nextInt();
	    	switch(Selectedopt)
	    	{
	    	case 1:System.out.println("Enter an Element:");
	    		   Object element=sc.next();
	    		   listobj.addElement(element); break;
	    	case 2:System.out.println("Enter an index at which Element is to be deleted:");
	    			 index=sc.nextInt();
	    			listobj.deleteElement(index); break;
	    	case 3: System.out.println("Enter an index of element which is to be fetched:");
	    			 index=sc.nextInt();
	    			listobj.fetchElement(index);break;
	    	case 4: listobj.printList();break;
	    	default: System.out.println("Please choose a correct option");
	    	}
	    	System.out.println("DO you want to continue:(enter y for continue)");
	    	tocontinue=sc.next().charAt(0);
	    	
  	}
  	sc.close();
  }
}