package com.mani.gayi.tree;

import java.util.Stack;

public class BinaryTreeTraversal {
	
	
	/**
	 * This function traversals thought the root and prints the following order:
	 * Left -- Root -- Rights
	 * */
	public static void inOrderUsingRecursion(BinaryTreeNode root)
	{
		if(root==null)
		{
			return;
		}
		inOrderUsingRecursion(root.getLeftNode());
		System.out.print(":"+root.getData()+":");
		inOrderUsingRecursion(root.getRightNode());
	}
	
	

	
	
}
