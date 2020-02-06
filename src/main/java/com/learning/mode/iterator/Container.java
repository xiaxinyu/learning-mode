package com.learning.mode.iterator;

public interface Container {
	public void add(Object obj);

	public void remove(Object obj);

	public Iterator getIterator();

	public int size();

	public Object get(int index);
}
