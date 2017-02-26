package com.mani.gayi.tree;

public class HeightOfANode {
	
	
	public int height(BinaryTreeNode node)
	{
		
		if(node==null)
			return 0;
		
		int leftNodeHeight = height(node.getLeftNode());
		int rightNodeHeight = height(node.getRightNode());
		
		if(leftNodeHeight>rightNodeHeight)
		{
			return leftNodeHeight+1;
		}
		else
			return rightNodeHeight+1;
				
		
	}

}
