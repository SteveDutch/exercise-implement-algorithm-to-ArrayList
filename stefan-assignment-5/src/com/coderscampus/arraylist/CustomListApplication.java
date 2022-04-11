package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {
		
		CustomList<String> myCustomList = new CustomArrayList<>();

		for (int j = 1; j <= 111; j++) {
			String elem = "element " + String.valueOf(j);
			myCustomList.add(elem);
		}

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}

	}

}
