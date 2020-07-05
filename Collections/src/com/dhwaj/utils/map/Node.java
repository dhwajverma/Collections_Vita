package com.dhwaj.utils.map;

import java.util.Objects;

public class Node<T, E> {

	private T key;
	private E value;
	private int hash;
	private Node<?, ?> next;

	public Node(T key, E value, int hashCode, Node<?, ?> next) {
		this.key = key;
		this.value = value;
		this.hash = hashCode;
		this.next = next;
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

	public int getHash() {
		return hash;
	}

	public void setHash(int hashCode) {
		this.hash = hashCode;
	}

	public Node<?, ?> getNext() {
		return next;
	}

	public void setNext(Node<?, ?> next) {
		this.next = next;
	}

	@Override
	public int hashCode() {
		return (Objects.hash(key) * Objects.hash(value));
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		Node<?, ?> n = (Node<?, ?>) o;
		if (Objects.equals(key, n.getKey()) && Objects.equals(value, n.getValue()))
			return true;
		return false;

	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", value=" + value + ", hash=" + hash + ", next=" + next + "]";
	}

}
