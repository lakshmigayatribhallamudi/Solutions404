package com.mani.gayi.pg.app;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtility<T> {

	public List<T> addObjectToList(T obj) {
		List<T> l = new ArrayList<T>();
		l.add(obj);
		return l;
	}
	
	public List<T> addObjectToList(T obj,int size) {
		List<T> l = new ArrayList<T>(size);
		l.add(obj);
		return l;
	}
}
