package AnuJava;

import java.util.LinkedList;

public class sortLinkedListInteger 
{
	
	public static void main(String[] args) 
	{
		EntryClass e =new EntryClass();
		e.createLinkedList();
		e.printLInkedList();
		e.sortLInkedList();
		e.printLInkedList();

	}
	
}

class EntryClass
{
	LinkedList <Integer>l = null;
	void createLinkedList() 
	{
		// TODO Auto-generated method stub
		l = new LinkedList<Integer>();
		l.add(10);l.add(30);l.add(80);l.add(50);l.add(40);l.add(60);l.add(20);l.add(70);l.add(90);
		System.out.println(l);
	}
	void printLInkedList()
	{
		for(int i =0;i<l.size();i++)
		{
			Integer a = l.get(i);
			System.out.print("["+a+"] -> ");
		}
		System.out.println("null");
		
	}
	
	void sortLInkedList()
	{
		for(int i=0;i<l.size()-1;i++)
		{
			for(int j=i+1;j<l.size();j++)
			{
		
				if (l.get(i)>l.get(j))
				{
					Integer temp = l.get(i);
					l.set(i, l.get(j));
					l.set(j, temp);
					
				}
			}
		}
		System.out.println("Sorting done");
	}
	

	
}
