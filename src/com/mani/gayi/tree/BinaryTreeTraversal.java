package com.mani.gayi.tree;

import java.util.Stack;

public class BinaryTreeTraversal {
	
	
	/**
	 * This function traversals thought the root and prints the following order:
	 * Left -- Root -- Right
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
	
	
	/**
	 * This function traversals thought the root and print the following orders
	 * Left -- Root -- Right in a Iterative Order.
	 * */
	public static void inOrderUsingIteration(BinaryTreeNode root)
	{
		// if the given tree node is null...
		if(root == null)
		{
			return;
		}
		
		// Given a Stack...
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		
		// Iterate till the root's left node is null...
		while(root!=null)
		{
			//push the root in to the stack.
			stack.push(root);
			
			// iterative to the left of the root.
			root=root.getLeftNode();
		}
		
		// iterate till the stack is empty.
		while(stack.size()>0)
		{
			// now after this loop stack contains left most element...
			BinaryTreeNode element = stack.pop();
			
			System.out.println("Stack Size : "+stack.size()+":"+element.getData()+":");
			
			// get the right node...
			// check for the right node
			if(element.getRightNode()!=null)
			{
				// if the right node exists.
				element = element.getRightNode();
				
				// if the element is not null
				while(element!=null)
				{
					stack.push(element);
					element = element.getLeftNode();
				}
			}
			
			
			
		}
		
		
	}
	
}
