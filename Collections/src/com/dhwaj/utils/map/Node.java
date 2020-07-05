package com.dhwaj.utils.map;

public class Node<T, E> {

	T key;
	E value;
	int hashCode;
	Node<?, ?> next;
	
	public Node(T key, E value, int hashCode, Node<?, ?> next)
	{
		this.key=key;
		this.value=value;
		this.hashCode=hashCode;
		this.next=next;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public int getHashCode() {
		return hashCode;
	}

	public void setHashCode(int hashCode) {
		this.hashCode = hashCode;
	}

	public Node<?, ?> getNext() {
		return next;
	}

	public void setNext(Node<?, ?> next) {
		this.next = next;
	}
	
	
	

}
