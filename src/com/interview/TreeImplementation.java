package com.interview;

class Node
{
	int num;
	Node left;
	Node right;
	
	Node(int num,Node left,Node right)
	{
		this.num=num;
		this.left=left;
		this.right=right;
	}
	Node(int num)
	{
		this.num=num;
		this.left=null;
		this.right=null;
	}
}
class Tree
{
	Node root;
	Tree(Node root)
	{
		this.root=root;
	}

	
	void insertnode(Node n)
	{
		
			if(this.root.num >= n.num)
			{
				
				root.left=n;
			}
			else
			{
				if(root.right!=null )
				{
					
					if(root.right.num>n.num)
					{
						
					}
					
				}
				else
				root.right=n;
			}
		}
		
	
	
}
public class TreeImplementation {

	public static void main(String[] args) {
	
		Node rootnode=new Node(10);
		Tree t= new Tree(rootnode);
		Node n=new Node(20);
		t.insertnode(n);
		int leftofrootnode=t.root.left.num;
		int rightofrootnode=t.root.right.num;
	
		
		//System.out.println(leftofrootnode);
		System.out.println(rightofrootnode);
		

	}

}
