package de.hsbremen.sahmadipour.jtsm;

import java.util.ArrayList;

public class Node {
	private String identifier;
	
	public Node(String identifier_p) 
	{
		identifier = identifier_p;
	}
	
	public String getIdentifier()
	{
		return identifier;
	}
	
	public void setIdentifier(String newId)
	{
		this.identifier = newId;
	}
	
	public String toString()
	{
		return "";
	}
}
