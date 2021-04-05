package com.balazsholczer.middlenode;

public class App {

	public static void main(String[] args) {

		List<Integer> myLinkedList = new LinkedList<>();

		myLinkedList.insert(1);
		myLinkedList.insert(2);
		myLinkedList.insert(3);
		
		System.out.println(myLinkedList.getMiddleNode());
	}
}
