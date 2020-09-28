package com.company;

public class LinkedList {

    Node head;

    public LinkedList() {
        head = null;
    }

    public void add(int val) {
        if(head == null) {
            head = new Node(val);
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = new Node(val);
        }
    }

    public String toString() {
        if(head == null) {
            return "[]";
        } else {
            StringBuilder result = new StringBuilder("[" + head.val);
            Node current = head.next;
            while(current != null) {
                result.append(", ").append(current.val);
                current = current.next;
            }
            result.append("]");
            return result.toString();
        }
    }

}

class Node {
    int val;
    Node next;
    Node() {}
    Node (int v) {val = v;}
    Node(int v, Node n) { val = v; next = n;}
}


