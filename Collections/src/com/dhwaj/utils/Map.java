package com.dhwaj.utils;

public interface Map<T, E> {

	public String put(T key, E value);

	public E get(T key);

	public E Remove(T key);

	public boolean containsKey(T key);

	public boolean containsValue(E value);

	public Integer size();
	
}
