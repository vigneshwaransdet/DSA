package com.sdet.classtimetasks24July2021;

/*
 * 
 * LinkedList :  1 -> 3 -> 5
LinkedList :  2 -> 4 -> 6 
Sorted LinkedList -> Merge Both LinkedList -> Return the sorted Linked List !!
1 -> 2 -> 3 -> 4 -> 5 -> 6
 * 
 * * linkedList1: 1,3,5
 * linkedList2: 2,4,6
 * 
 * currentNode1 is of linked list 1
 * currentNode2 is of linked list 2
 * currentNode1.value<currentNode2.value
 
 */

public class Node {

	int value;
	Node next;

	Node(int key) {
		this.value = key;
		next = null;
	}
	
	public Node addNode(int key) {
        return new Node(key);
    }
    public void printAllNodes(Node node) {
        while(node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }
    
    
}
