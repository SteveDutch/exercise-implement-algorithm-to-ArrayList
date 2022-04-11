package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	
	private int place;
	private int size = items.length; 
	
	@Override
	public boolean add(T item) {
		// TODO Auto-generated method stub
		System.out.println("I'm in add, index " + place + " it's round " + (place+1));
		if (place == items.length - 1) {
			size = size *2;
			items = Arrays.copyOf(items, size);
		}
		items[place] = item;
		place++;
		return true;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		System.out.println("I'm in getSize");
		System.out.println(items.length);
		return place ;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		System.out.println("I'm in get");
		T output = (T) items[index];
		return output;
	}
	
}
