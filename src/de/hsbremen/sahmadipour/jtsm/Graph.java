package de.hsbremen.sahmadipour.jtsm;

import java.util.ArrayList;

public class Graph {
	private ArrayList<Node> nodes;
	private ArrayList<Edge> edges;
	
	public Graph()
	{
		
	}
	
	public Graph(ArrayList<Node> graphNodes) 
	{
		this.nodes = graphNodes; 
	}

	public ArrayList<Node> getNodes()
	{
		return this.nodes;
	}
	
	public int getNodeAmount()
	{
		return nodes.size();
	}
	
	public String toString()
	{
		return "";
	}
}
