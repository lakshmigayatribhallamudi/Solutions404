package com.mani.gayi.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * This contains vertex data.
 * */
public class Vertex<T> {
	
	private T data;
	
	private List<Vertex<T>> neighbours = new ArrayList<>();
	
	private int numberOfNeighbours ;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<Vertex<T>> getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(List<Vertex<T>> neighbours) {
		this.neighbours = neighbours;
		numberOfNeighbours = neighbours.size();
	}

	public int getNumberOfNeighbours() {
		return numberOfNeighbours;
	}

	public void setNumberOfNeighbours(int numberOfNeighbours) {
		this.numberOfNeighbours = numberOfNeighbours;
	}
	
	
}
