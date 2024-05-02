package com.dsa.linklist;

public class SinglyLL {
	private Node head;
	private int size;

	public SinglyLL() {
		head = null;
	}

	public int size() {
		return this.size;
	}

	public void traverse() {
		Node current = head;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}

	private void prepend(Object data) {
		Node header = new Node(data, (Node) null);
		header.setNext(this.head);
		this.head = header;
		this.size++;
	}

	public static void main(String[] args) {
		SinglyLL singlyLL = new SinglyLL();
		singlyLL.prepend(100);
		singlyLL.traverse();
		System.out.println("----------");

		singlyLL.prepend(200);
		singlyLL.prepend(300);
		singlyLL.prepend(400);
		singlyLL.traverse();
		
	}
}
