package com.mani.gayi.tree;

public class BinaryTree {
	
	private static BinaryTreeNode root;

	public BinaryTreeNode getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode root) {
		this.root = root;
	}

	
	public static BinaryTreeNode get3LevelBalancedTree()
	{
		root = new  BinaryTreeNode();
		root.setData(50);
		
		BinaryTreeNode firstLeftNode = new BinaryTreeNode();
		firstLeftNode.setData(30);
		
		BinaryTreeNode firstRightNode = new BinaryTreeNode();
		firstRightNode.setData(70);
		
		root.setChildNode(true);
		root.setLeftNode(firstLeftNode);
		root.setRightNode(firstRightNode);
		
//				50
//			30		70

		BinaryTreeNode firstLeftNodeleft = new BinaryTreeNode();
		firstLeftNodeleft.setData(20);
		
		BinaryTreeNode firstLeftNoderight = new BinaryTreeNode();
		firstLeftNoderight.setData(40);
		
		firstLeftNode.setChildNode(true);
		firstLeftNode.setLeftNode(firstLeftNodeleft);
		firstLeftNode.setRightNode(firstLeftNoderight);
		
//				    	50
//					30		70
//				  20  40
		
		
		BinaryTreeNode firstRightNodeleft = new BinaryTreeNode();
		firstRightNodeleft.setData(60);
		
		BinaryTreeNode firstRightNoderight = new BinaryTreeNode();
		firstRightNoderight.setData(80);
		
		firstRightNode.setChildNode(true);
		firstRightNode.setLeftNode(firstRightNodeleft);
		firstRightNode.setRightNode(firstRightNoderight);
		
//						50
//					30		70
//				  20  40  60  80
		
//		20 30 40 50 60 70 80
		return root;
	}
	
	public static BinaryTreeNode get2LevelBalancedTree()
	{
		root = new  BinaryTreeNode();
		root.setData(50);
		
		BinaryTreeNode firstLeftNode = new BinaryTreeNode();
		firstLeftNode.setData(30);
		
		BinaryTreeNode firstRightNode = new BinaryTreeNode();
		firstRightNode.setData(70);
		
		root.setChildNode(true);
		root.setLeftNode(firstLeftNode);
		root.setRightNode(firstRightNode);
		
//				50
//			30		70

		
		
//		20 30 40 50 60 70 80
		return root;
	}
	
	
	public static void main(String[] args) {
		
		BinaryTreeNode root = get3LevelBalancedTree();
		BinaryTreeTraversal.inOrderUsingRecursion(root);
		System.out.println("=============================");
		BinaryTreeTraversal.inOrderUsingIteration(root);
	}
}
