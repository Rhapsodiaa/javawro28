package com.sda.nested;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public class MyLinkedList<T> {

    private Node head;


    public void add(T value) {
        Node nodeToInsert = new Node(value, null);

        if (head == null) {
            head = nodeToInsert;
        } else {
            Node actualNodeInIteration = head;

            while (head.nextNode != null) {
                actualNodeInIteration = head.nextNode;
            }

            actualNodeInIteration.nextNode = nodeToInsert;
        }

    }


    private static class Node<T> {
        T value;
        Node nextNode;

        public Node(T value, Node nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }
    }


    public static void main(String[] args) {

        MyLinkedList<String> stringMyLinkedList = new MyLinkedList<>();

        stringMyLinkedList.add("TEst");

    }

}


