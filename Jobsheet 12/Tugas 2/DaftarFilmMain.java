package com.jobsheet12.tugas02;
import java.util.Scanner;
public class DaftarFilmMain {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        DaftarFilm ve = new DaftarFilm();
        while (true) {
            int pilihan = Menu();
            if (pilihan == 1) {
                System.out.println("\n==================================================");
                String message = "TAMBAH DATA FILM";
                System.out.printf("%33s", message);
                System.out.println("\n==================================================");
                System.out.print("\nID FILM\t\t : ");
                int idFilm = userInput.nextInt();
                System.out.print("\nJUDUL FILM\t : ");
                userInput.nextLine();
                String judulFilm = userInput.nextLine();
                System.out.print("\nRATING FILM\t : ");
                double ratingFilm = userInput.nextDouble();
                ve.addFirst(idFilm, judulFilm, ratingFilm);
            }else if (pilihan == 2) {
                System.out.println("\n==================================================");
                String message = "TAMBAH DATA FILM";
                System.out.printf("%33s", message);
                System.out.println("\n==================================================");
                System.out.print("\nID FILM\t\t : ");
                int idFilm = userInput.nextInt();
                System.out.print("\nJUDUL FILM\t : ");
                userInput.nextLine();
                String judulFilm = userInput.nextLine();
                System.out.print("\nRATING FILM\t : ");
                double ratingFilm = userInput.nextDouble();
                ve.addLast(idFilm, judulFilm, ratingFilm);
            }else if (pilihan == 3) {
                System.out.println("\n==================================================");
                String message = "TAMBAH DATA FILM";
                System.out.printf("%33s", message);
                System.out.println("\n==================================================");
                System.out.print("\nID FILM\t\t : ");
                int idFilm = userInput.nextInt();
                System.out.print("\nJUDUL FILM\t : ");
                userInput.nextLine();
                String judulFilm = userInput.nextLine();
                System.out.print("\nRATING FILM\t : ");
                double ratingFilm = userInput.nextDouble();
                System.out.print("\nURUTAN FILM KE-  : ");
                int urutanFilm = userInput.nextInt();
                ve.add(urutanFilm ,idFilm, judulFilm, ratingFilm);
            }else if (pilihan == 4) {
                String removedName = ve.removeFirst();
                if (removedName != null) {
                    System.out.println("\n" + (removedName.toUpperCase()) + " TELAH DIHAPUS DARI DAFTAR");
                }
            }else if (pilihan == 5) {
                String removedName = ve.removeLast();
                if (removedName != null) {
                    System.out.println("\n" + (removedName.toUpperCase()) + " TELAH DIHAPUS DARI DAFTAR");
                }
            }else if (pilihan == 6) {
                System.out.print("\nMASUKKAN URUTAN FILM YANG INGIN DIHAPUS : ");
                int urutanFilm = userInput.nextInt();
                String removedName = ve.remove(urutanFilm);
                if (removedName != null) {
                    System.out.println("\n" + (removedName.toUpperCase()) + " TELAH DIHAPUS DARI DAFTAR");
                }
            }else if (pilihan == 7) {
                System.out.println("\n==================================================");
                String message = "DAFTAR FILM LAYAR LEBAR";
                System.out.printf("%36s", message);
                System.out.println("\n==================================================");
                ve.print();
            }else if (pilihan == 8) {
                System.out.print("\nMASUKKAN ID FILM : ");
                int idFilms = userInput.nextInt();
                ve.cariFilmBerdasarkanId(idFilms);
            }else if (pilihan == 9) {
                System.out.println("\n==================================================");
                String message = "DAFTAR FILM BERDASARKAN RATING";
                System.out.printf("%40s", message);
                System.out.println("\n==================================================");
                ve.urutFilmBerdasarkanRatingDESC();
                ve.print();
            }else if (pilihan == 10) {
                break;
            }else {
                System.out.println("\nPILIHAN YANG ANDA MASUKKAN TIDAK TERSEDIA");
            }
        }
    }
    static int Menu() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\n==================================================");
        String message = "DATA FILM LAYAR LEBAR";
        System.out.printf("%35s", message);
        System.out.println("\n==================================================");
        System.out.println("\n1. TAMBAH DATA AWAL\n \n2. TAMBAH DATA AKHIR\n \n3. TAMBAH DATA INDEX TERTENTU\n \n4. HAPUS DATA PERTAMA\n \n5. HAPUS DATA TERAKHIR\n \n6. HAPUS DATA TERTENTU\n \n7. CETAK\n \n8. CARI ID FILM\n \n9. URUT DATA RATING FILM-DESC\n \n10. KELUAR");
        System.out.print("\nMASUKKAN PILIHAN ANDA : ");
        int pilihan = userInput.nextInt();
        return pilihan;
    }
}