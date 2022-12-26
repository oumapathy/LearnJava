package AnuJava;

import java.util.LinkedList;

public class LinkedListNode 
{
	
	public static void main(String[] args) 
	{
		EntryClass2 e =new EntryClass2();
		e.createLinkedList();
		e.printLInkedList();
		e.sortLInkedList();
		e.printLInkedList();

	}
	
}
class Node
{
	String name=null;
	int age=0;
	Node(String name1, int age1)
	{
		name=name1;
		age=age1;
		
	}
	public String toString()
	{
		return "[ "+name+", "+age+" ]";
	}

}

class EntryClass2
{
	LinkedList <Node>l = null;
	void createLinkedList() 
	{
		// TODO Auto-generated method stub
		l = new LinkedList<Node>();
		Node n = new Node("ouma",24);l.add(n);
		n = new Node("anu",45);l.add(n);
		n = new Node("avinash",19);l.add(n);
		n = new Node("rithika",16);l.add(n);
		n = new Node("sarang",78);l.add(n);
		n = new Node("raji",70);l.add(n);
		n = new Node("vani",48);l.add(n);
		n = new Node("thanya",17);l.add(n);		
		System.out.println(l);
	}
	
	void printLInkedList()
	{
		for(int i =0;i<l.size();i++)
		{
			Node a = l.get(i);
			System.out.print(a+" -> ");
		}
		System.out.println("null");
		
	}
	
	void sortLInkedList()
	{
		for(int i=0;i<l.size()-1;i++)
		{
			for(int j=i+1;j<l.size();j++)
			{
		
				if (l.get(i).age>l.get(j).age)
				{
					Node temp = l.get(i);
					l.set(i, l.get(j));
					l.set(j, temp);
					
				}
			}
		}
		System.out.println("Sorting done");
	}	
}
