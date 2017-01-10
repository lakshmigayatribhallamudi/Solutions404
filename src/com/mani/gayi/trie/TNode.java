package com.mani.gayi.trie;

public class TNode<T> {
	
	private T data;
	
	private TNode<T>[] children = new TNode[26];
	
	private boolean isEndOfWord;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public TNode<T>[] getChildren() {
		return children;
	}

	public void setChildren(TNode<T>[] children) {
		this.children = children;
	}

	public boolean isEndOfWord() {
		return isEndOfWord;
	}

	public void setEndOfWord(boolean isEndOfWord) {
		this.isEndOfWord = isEndOfWord;
	}
	
	
	

}
