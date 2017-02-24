package com.mani.gayi.tree;

public class BinaryTreeNode {
	
	private int data;
	
	private BinaryTreeNode leftNode;
	
	private BinaryTreeNode rightNode;
	
	private int heightOfNode;
	
	private boolean isChildNode;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BinaryTreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(BinaryTreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public BinaryTreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(BinaryTreeNode rightNode) {
		this.rightNode = rightNode;
	}

	public int getHeightOfNode() {
		return heightOfNode;
	}

	public void setHeightOfNode(int heightOfNode) {
		this.heightOfNode = heightOfNode;
	}

	public boolean isChildNode() {
		return isChildNode;
	}

	public void setChildNode(boolean isChildNode) {
		this.isChildNode = isChildNode;
	}
	
	

}
