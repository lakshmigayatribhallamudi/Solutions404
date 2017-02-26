package com.mani.gayi.tree;

import java.util.Stack;

public class BinaryTreeTraversal {
	
	
	/**
	 * This function traversals thought the root and prints the following order:
	 * Left -- Root -- Rights
	 * */
	public static void inOrderUsingRecursion(BinaryTreeNode root)
	{
		// if the given tree node is null...
		if(root==null)
		{
			return;
		}
		
		// traversal through the left node.
		inOrderUsingRecursion(root.getLeftNode());
		
		// print the data.
		System.out.print(":"+root.getData()+":");
		
		// treversal through the right node.
		inOrderUsingRecursion(root.getRightNode());
	}
	
	

	
}
