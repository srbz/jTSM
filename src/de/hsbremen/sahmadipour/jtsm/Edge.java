package de.hsbremen.sahmadipour.jtsm;

public class Edge {
	private Node fromNode;
	private Node toNode;
	private int weight;
	
	public Edge(Node from, Node to,int weight_p) {
		this.fromNode = from;
		this.toNode = to;
		this.weight = weight_p;
	}

	public Node getFromNode() {
		return fromNode;
	}

	public void setFromNode(Node fromNode) {
		this.fromNode = fromNode;
	}

	public Node getToNode() {
		return toNode;
	}

	public void setToNode(Node toNode) {
		this.toNode = toNode;
	}
	
	public int getWeight()
	{
		return this.weight;
	}
	
	public void setWeight(int w)
	{
		this.weight = w;
	}
	
	public String toString()
	{
		return "";
	}

}
