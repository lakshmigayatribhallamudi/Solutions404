package com.mani.gayi.trie;

import java.util.HashMap;
import java.util.Map;

public class StandardTrie implements Trie {
	
	TrieNode root;
	
	@Override
	public Trie add(String data) {

		
		// convert the given data in to char array.
			char[] chararray = data.toCharArray();
			int index =0;
			// this is first node.
			if(root ==null && data.length()>0)
			{
				root = new TrieNode();
				Map<Character,TrieNode> map = new HashMap<>();
				map.put(chararray[index], new TrieNode());
				root.setChildren(map);
				root.setEndOfWrod(false);
			}
			else
			{
				
			}
		
		return null;
	}

	@Override
	public boolean isPresent(String data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String word) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	

}
