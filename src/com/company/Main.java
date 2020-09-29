package com.company;


public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        String res = list.toString();
        System.out.println(res);

        Node test = removeNthFromEnd(list.head, 2);
        String prtTest = printTest(test);
        System.out.println(prtTest);
    }

    // method to print the node values after leetcode questions alter the linked list
    static String printTest(Node test) {
        StringBuilder result = new StringBuilder("[" + test.val);
        Node prtTest = test.next;
        while(prtTest != null) {
            result.append(", ").append(prtTest.val);
            prtTest = prtTest.next;
        }
        result.append("]");
        return result.toString();
    }

    // Runtime: O(N) where N is the number of nodes in our list.
    // Space complexity: O(1) or constant.
    public static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node slow = dummy;
        Node fast = dummy;

        while(n >= 0) {
            fast = fast.next;
            n--;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }

    // Did not test
    // need to add functionality to have a node point to a node in the list
    // tested on leetcode https://leetcode.com/problems/linked-list-cycle/submissions/
    // Runtime: O(N) where N is the number of nodes in our list.
    //Space complexity: O(1) or constant.
    public static boolean containsCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}
