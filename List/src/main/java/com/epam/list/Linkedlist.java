package com.epam.list;

public class Linkedlist 
{
	Node head;
	public Node insert(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
			return head;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=node;	
			
		return head;
	}
	public void print()
	{  
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data);
			if(temp.next!=null)
			System.out.print("->");
			temp=temp.next;
		}
		System.out.println();
		
	}
	public Node insertFirst(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
			return head;
		}
		node.next=head;
		head=node;
		return head;
	}
	public Node insertPosition(int data,int position)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(position==1 && head==null)
		{
			head=node;
			return head;
		}
		if(head!=null && position==1)
		{
			node.next=head;
			head=node;
			return head;
		}
		Node temp=head;
		for(int i=1;i<position-1;i++)
		{
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
		return head;
	}
	Node deleteBeginning()
	{
		Node temp=head;
		head=temp.next;
		temp.next=null;
		return head;
	}
	Node deleteEnd()
	{
		Node temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
		return head;
	}
	Node deletePosition(int position)
	{
		
		if(position==1)
		{
			Node temp=head;
			head=temp.next;
			temp.next=null;
			return head;
		}
		Node temp=head;
		for(int i=0;i<position-2;i++)
		{
			temp=temp.next;
		}
		Node ptr=temp.next;
		temp.next=ptr.next;
		return head;
	}
}
