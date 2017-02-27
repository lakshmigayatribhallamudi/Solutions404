package com.mani.gayi.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a class which stores the Graph data.
 * 
 * In Simple Graph is collection of nodes using Vertices using Edges.
 * 
 */
public class Graph<T> {

	private List<Vertex<T>> vertives;
	
	private List<Edge<T>> edges;

	private int numberOfVertices;

	private int numberOfEdges;

	public int getNumberOfVertices() {
		return numberOfVertices;
	}

	public void setNumberOfVertices(int numberOfVertices) {
		this.numberOfVertices = numberOfVertices;
	}

	public int getNumberOfEdges() {
		return numberOfEdges;
	}

	public void setNumberOfEdges(int numberOfEdges) {
		this.numberOfEdges = numberOfEdges;
	}

	public List<Vertex<T>> getVertives() {
		return vertives;
	}

	public void setVertives(List<Vertex<T>> vertives) {
		this.vertives = vertives;
	}

	public List<Edge<T>> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge<T>> edges) {
		this.edges = edges;
	}
	
	public static void main(String[] args) {
		
		Graph<String> graph = new Graph<String>();
		
		Vertex<String> a = new Vertex<String>();
		a.setData("A");
		
		Vertex<String> b = new Vertex<String>();
		a.setData("B");
		
		List<Vertex<String>> list = new ArrayList<>();
		list.add(b);
		
		a.setNeighbours(list);
		
		System.out.println("Number is : "+a.getNumberOfNeighbours());
		
	}
	
	
}
