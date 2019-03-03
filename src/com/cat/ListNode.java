package com.cat;

public class ListNode {
    private class Node {
        private int value;
        private Node nextNode;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node firstNode;
    private Node headerNode;

    public void addNode(int value) {
        Node node = new Node(value);
        if (headerNode == null) {
            firstNode = node;
            headerNode = node;
        } else {
            headerNode.nextNode = node;
            headerNode = node;
        }
    }

    public void deleteDuplicates() {
        Node node = firstNode;
        while (node != null && node.nextNode != null) {
            if (node.value == node.nextNode.value) {
                node.nextNode = node.nextNode.nextNode;
            } else {
                node = node.nextNode;
            }
        }
    }

    public void printListNode() {
        Node node = firstNode;
        while (node != null) {
            System.out.print("[" + node.value + "]");
            node = node.nextNode;
        }
        System.out.println();
    }
}
