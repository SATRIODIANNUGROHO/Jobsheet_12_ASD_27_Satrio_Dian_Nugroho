package com.jobsheet12.tugas02;
public class Node {
    int idFilm;
    String judulFilm;
    double ratingFilm;
    Node prev, next;
    Node(Node prev, int idFilm, String judulFilm, double ratingFilm,Node next) {
        this.prev = prev;
        this.idFilm = idFilm;
        this.judulFilm = judulFilm;
        this.ratingFilm = ratingFilm;
        this.next = next;
    }
}