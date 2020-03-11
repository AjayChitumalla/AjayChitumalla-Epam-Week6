package com.epam.vnrvjiet;
public class FunctionsofList {
	private Object[] List =new Object[10];
	private int count=0;
	FunctionsofList()
	{
		for( count=0;count<10;count++)
		{
			List[count]=count;
		}
	}
	public void addElement(Object obj) {
		if(count==List.length)
		{
			createNewList();
		}
		List[count]=obj;
		count++;
	}
	public void deleteElement(int index)
	{
		try {
			Object[] newList=new Object[count];
			
			
			for(int i=0;i<index;i++)
			{
				newList[i]=List[i];
			}
			for(int i=index+1;i<count;i++)
			{
				newList[i-1]=List[i];
			}
			List=newList;
			count--;
		}
		catch(Exception e)
		{
			System.out.println("Exception caught"+e);
			
		}
		
			
		
		
		
	}
	public void printList()
	{
	  System.out.println("Elements in the List are");
	  for(int i=0;i<count;i++)
	  {
		  System.out.println(List[i]+" ");
	  }
	}
	public void fetchElement(int index)
	{
		try {
			System.out.println("Element at"+index+"is"+List[index]);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception caught+e");
			
		}
		
	
			
	}
	public void createNewList() {
		int Capacity=List.length*2;
		Object[] newList=new Object[Capacity];
		for(int i=0;i<List.length;i++)
		{
			newList[i]=List[i];
		}
		List=newList;
	}
}