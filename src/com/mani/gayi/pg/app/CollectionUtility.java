package com.mani.gayi.pg.app;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtility<T> {
	
	public List<T> addObjectToList(T obj)
	{
		List<T> l=new ArrayList<T>();
		l.add((T) obj);
		return l;
	} }
