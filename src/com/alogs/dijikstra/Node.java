package com.alogs.dijikstra;

import java.util.ArrayList;

public class Node {
	
	private int distanceFromSource=Integer.MAX_VALUE;
	private boolean isVisited;
	private ArrayList<Edge> edges=new ArrayList<Edge>();
	
	public int getDistanceFromSource()
	{
		return distanceFromSource;
	}
	public void setDistanceFromSource(int distanceFromsource)
	{
		this.distanceFromSource=distanceFromsource;
	}
	public boolean isVisited()
	{
		return isVisited;
	}
	public void setVisited(boolean isVisited)
	{  
		this.isVisited=isVisited;
	}
	public ArrayList<Edge> getEdges()
	{
		return edges;
	}
	public void setEdges(ArrayList edges)
	{
		this.edges=edges;
	}

}
