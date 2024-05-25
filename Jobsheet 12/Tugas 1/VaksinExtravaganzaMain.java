package com.jobsheet12.tugas01;
import java.util.Scanner;
public class VaksinExtravaganzaMain {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        VaksinExtravaganza ve = new VaksinExtravaganza();
        while (true) {
            int pilihan = Menu();
            if (pilihan == 1) {
                System.out.println("\n==================================================");
                String message = "DATA PENERIMA VAKSIN";
                System.out.printf("%35s", message);
                System.out.println("\n==================================================");
                System.out.print("\nNOMOR ANTRIAN : ");
                int nomorAntrian = userInput.nextInt();
                System.out.print("\nNAMA PENERIMA : ");
                userInput.nextLine();
                String namaPenerima = userInput.nextLine();
                ve.addLast(nomorAntrian, namaPenerima);
            }else if (pilihan == 2) {
                String removedName = ve.removeFirst();
                if (removedName != null) {
                    System.out.println("\n" + (removedName.toUpperCase()) + " TELAH SELESAI DIVAKSINASI.");
                }
            }else if (pilihan == 3) {
                System.out.println("\n==================================================");
                String message = "DAFTAR PENERIMA VAKSIN";
                System.out.printf("%36s", message);
                System.out.println("\n==================================================");
                ve.print();
            }else if (pilihan == 4) {
                break;
            }else {
                System.out.println("PILIHAN YANG ANDA MASUKKAN TIDAK TERSEDIA");
            }
        }
    }
    static int Menu() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\n==================================================");
        String message = "PENGANTRI VAKSIN EXTRAVAGANZA";
        System.out.printf("%39s", message);
        System.out.println("\n==================================================");
        System.out.println("\n1. TAMBAH DATA PENERIMA FAKSIN\n \n2. HAPUS DATA PENGANTRI VAKSIN\n \n3. DAFTAR PENERIMA VAKSIN\n \n4. KELUAR");
        System.out.print("\nMASUKKAN PILIHAN ANDA : ");
        int pilihan = userInput.nextInt();
        return pilihan;
    }
}
