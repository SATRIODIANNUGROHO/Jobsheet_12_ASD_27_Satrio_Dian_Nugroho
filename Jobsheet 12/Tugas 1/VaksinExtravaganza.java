package com.jobsheet12.tugas01;
public class VaksinExtravaganza {
    Node head;
    Node tail;
    int size;
    public VaksinExtravaganza() {
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addLast(int nomorAntrian, String namaPenerima) {
        if (isEmpty()) {
            head = tail = new Node(null, nomorAntrian, namaPenerima, null);
        } else {
            Node newNode = new Node(tail, nomorAntrian, namaPenerima, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public int size(int size) {
        return size;
    }
    public void print() {
        int nomorWidth = 23;
        int namaWidth = 24;
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("\n+-----------------------+------------------------+");
            System.out.println("|         NOMOR         |          NAMA          |");
            System.out.println("+-----------------------+------------------------+");
            while (tmp != null) {
                System.out.println("|" + padRight(" " + (tmp.nomorAntrian) + " ", nomorWidth) + "|" + padRight(" " + (tmp.namaPenerima).toUpperCase() + " ", namaWidth) + "|");
                tmp = tmp.next;
            }
            System.out.println("+-----------------------+------------------------+");
        }else {
            System.out.println("\nDAFTAR KOSONG");
        }
        System.out.println("\nSISA ANTRIAN : " + size);
    }
    // Metode untuk mengisi spasi ke kanan
    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }
    // Metode untuk mencetak garis
    public static void printLine(int nomorWidth, int namaWidth) {
        System.out.print("+" + repeat("-", nomorWidth) + "+" + repeat("-", namaWidth) + "+\n");
    }
    // Metode untuk mengulang karakter tertentu
    public static String repeat(String str, int n) {
        return new String(new char[n]).replace("\0", str);
    }
    public String removeFirst() {
        if (isEmpty()) {
            System.out.println("\nDAFTAR KOSONG");
            return null;
        } else {
            String namaPenerima = head.namaPenerima;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
            return namaPenerima;
        }
    }
}