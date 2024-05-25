package com.jobsheet12.praktikum03;
public class DoubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();
        System.out.println("Size : " + (dll.size()));
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + (dll.size()));
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + (dll.size()));
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        dll.clear();
        dll.print();
        System.out.println("Size : " + (dll.size()));
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + (dll.size()));
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + (dll.size()));
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + (dll.size()));
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + (dll.size()));
        dll.clear();
        dll.print();
        System.out.println("Size : " + (dll.size()));
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + (dll.size()));
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        try {
          dll.add(40, 1);
        } catch (Exception e) {
          System.err.println("Nilai indeks di luar batas");
        }
        dll.print();
        System.out.println("Size : " + (dll.size()));
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        System.out.print("\nData awal pada linked list adalah\t : " + (dll.getFirst()));
        System.out.print("\nData akhir pada linked list adalah\t : " + (dll.getLast()));
        System.out.print("\nData indeks ke-1 pada linked list adalah : " + (dll.get(1)));
    }
}