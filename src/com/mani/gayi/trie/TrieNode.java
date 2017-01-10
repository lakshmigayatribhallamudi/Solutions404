package com.mani.gayi.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
	
	// a trie node contains one parent only.
	private TrieNode parent;
	private Map<Character,TrieNode> children= new HashMap<>();
	private boolean isEndOfWrod;
	public TrieNode getParent() {
		return parent;
	}
	public void setParent(TrieNode parent) {
		this.parent = parent;
	}
	public Map<Character, TrieNode> getChildren() {
		return children;
	}
	public void setChildren(Map<Character, TrieNode> children) {
		this.children = children;
	}
	public boolean isEndOfWrod() {
		return isEndOfWrod;
	}
	public void setEndOfWrod(boolean isEndOfWrod) {
		this.isEndOfWrod = isEndOfWrod;
	}
	
	

}
