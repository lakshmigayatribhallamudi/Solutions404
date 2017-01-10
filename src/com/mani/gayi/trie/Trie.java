package com.mani.gayi.trie;

public interface Trie {
	
	public Trie add(String data);
	
	public boolean isPresent(String data);
	
	public boolean delete(String word);

}
