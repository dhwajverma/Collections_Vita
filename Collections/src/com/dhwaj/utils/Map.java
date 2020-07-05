package com.dhwaj.utils;

public interface Map<T, E> {

	public String put(T key, E value);

	public E get(T key);

	public E Remove(T key);

	public boolean containKey(T key);

	public boolean containsKey(E key);

	public Integer size();
}
