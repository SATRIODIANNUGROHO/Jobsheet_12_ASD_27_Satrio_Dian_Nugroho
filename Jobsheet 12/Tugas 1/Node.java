package com.jobsheet12.tugas01;
public class Node {
    int nomorAntrian;
    String namaPenerima;
    Node prev, next;
    Node(Node prev, int nomorAntrian, String namaPenerima, Node next) {
        this.prev = prev;
        this.nomorAntrian = nomorAntrian;
        this.namaPenerima = namaPenerima;
        this.next = next;
    }
}