package com.alogs.dijikstra;

public class Edge {
	
	private int FromNodeIndex;
	private int ToNodeIndex;
	private int length;
	
	public int getLength()
	{
		return length;
	}
	public int getFromNodeIndex()
	{
		return FromNodeIndex;
	}
	public int getToNodeIndex()
	{
		return ToNodeIndex;
	}
	public Edge(int FromNodeIndex,int ToNodeIndex,int length)
	{
		
		this.FromNodeIndex=FromNodeIndex;
		this.ToNodeIndex=ToNodeIndex;
		this.length=length;
		
		
	}
	public int getNeighbourIndex(int Nodeindex)
	{
		if(this.FromNodeIndex==Nodeindex)
		{
			
			return this.ToNodeIndex;
		}
		else
		{
			return this.FromNodeIndex;
		}
	}
	

}
