package com.dhwaj.utils.map;

import java.util.Objects;

import com.dhwaj.utils.Map;

public class HashMap<T, E> implements Map<T, E> {

	final static int maxListLength = 7;
	static int length = 16;
	Node<?, ?>[] arr = new Node[length];

	@Override
	public String put(T key, E value) {
		int hash = hashCode(key);
		Node<T, E> node = new Node<T, E>(key, value, hash, null);
		int index = hash % length;
		if (arr[index] == null) {
			arr[index] = node;
		} else {
			Node<T, E> head = (Node<T, E>) arr[index];
			while (head.getNext() != null) {
				head = (Node<T, E>) head.getNext();
			}
			head.setNext(node);
		}
		return null;
	}

	@Override
	public E get(T key) {
		int hash = hashCode(key);
		int index = hash % length;
		Node<T, E> head = (Node<T, E>) arr[index];
		return findValueFromList(head, key, hash);
	}

	@Override
	public E Remove(T key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containKey(T key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(E key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer size() {
		// TODO Auto-generated method stub
		return null;
	}

	private int hashCode(T key) {
		return Math.abs((Objects.hash(key) * Objects.hash(key)));
	}

	private E findValueFromList(Node<T, E> head, T key, int hash) {
		E value=null;
		if (head.getNext() == null && head.getHash() == hash && head.getKey() == key)
			value=head.getValue();
		else {
			while (head.getNext() != null) {
				if (head.getHash() == hash && head.getKey() == key) {
					value=head.getValue();
					break;
				}
				head=(Node<T, E>) head.getNext();
			}
			if (value == null && head.getHash() == hash && head.getKey() == key) 
				value=head.getValue();
		}
		return value;
	}
}
