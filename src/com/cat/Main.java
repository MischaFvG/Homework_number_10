package com.cat;

public class Main {

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.addNode(1);
        listNode.addNode(2);
        listNode.addNode(3);
        listNode.addNode(3);
        listNode.addNode(3);
        listNode.addNode(5);
        listNode.addNode(5);
        listNode.addNode(5);
        listNode.addNode(234);
        listNode.printListNode();
        listNode.deleteDuplicates();
        listNode.printListNode();
    }
}
