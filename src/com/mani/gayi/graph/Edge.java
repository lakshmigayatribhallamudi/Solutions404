package com.mani.gayi.graph;

public class Edge<T> {

	// Edge is surrounded by vertex1.
	private Vertex v1;

	// Edge is surrounded by vertex2.
	private Vertex v2;

	// Edge may contains weights or data describing about the vertices.
	private T edgeData;

	public Vertex getV1() {
		return v1;
	}

	public void setV1(Vertex v1) {
		this.v1 = v1;
	}

	public Vertex getV2() {
		return v2;
	}

	public void setV2(Vertex v2) {
		this.v2 = v2;
	}

	public T getEdgeData() {
		return edgeData;
	}

	public void setEdgeData(T edgeData) {
		this.edgeData = edgeData;
	}

}
