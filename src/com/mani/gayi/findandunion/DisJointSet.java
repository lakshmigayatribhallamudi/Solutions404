package com.mani.gayi.findandunion;

import java.util.HashMap;
import java.util.Map;

public class DisJointSet {
	
	private Map<Long,Node> map = new HashMap<>();
	
	class Node
	{
		long data;
		Node parent;
		int rank;
	}
	
	public void makeSet(long data)
	{
		Node node = new Node();
		node.data=data;
		node.parent=null;
		node.rank = 0;
		// we are creating a node an inserting it in the map.
		map.put(data, node);
	}
	
	public void union(long data1,long data2)
	{
		Node node1 = map.get(data1);
		Node node2 = map.get(data2);
		
		Node parent1 = findSet(node1);
		Node parent2 = findSet(node2);
		
		if(parent1.data==parent2.data)
		{
			return;
		}
		
		if(parent1.rank>=parent2.rank)
		{
			parent1.rank = (parent1.rank==parent2.rank)?parent1.rank+1:parent1.rank;
			parent2.parent=parent1;
		}
		else
		{
			parent1.parent=parent2;
		}
	}

	private Node findSet(Node node1) {
		Node parent = node1.parent;
		
		if(parent==node1)
		{
			return parent;
		}
		
		node1.parent=findSet(node1.parent);
		return node1.parent;
	}
	

}
