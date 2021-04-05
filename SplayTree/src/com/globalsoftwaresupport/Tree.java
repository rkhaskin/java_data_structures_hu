package com.globalsoftwaresupport;

public interface Tree<T> {
	public void insert(T data);
	public T find(T data);
	public void traverse();
	public T getRoot();
}
