package com.jobsheet12.praktikum01;
public class Node {
    int data;
    Node prev, next;
    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}