//Haiqel Aziizul Hakeem - 1217050060 - PBO - B
//Challenge
//Manusia memiliki poin untuk setiap tindakan baik dan buruknya

import java.util.*;

class Manusia{
    String nama;
}

class Amal{
    int poin = 0;
    String jawabAmal;
}

public class latihan1{
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Amal tindakan = new Amal();
        Scanner inputAmal = new Scanner(System.in);
        Scanner nama = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        manusia.nama = nama.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.print("Apakah " + manusia.nama + " berbuat baik? (y/n): ");
            tindakan.jawabAmal = inputAmal.nextLine();
            if (tindakan.jawabAmal.equalsIgnoreCase("y")) {
                tindakan.poin = tindakan.poin + 1;
            } else if (tindakan.jawabAmal.equalsIgnoreCase("n")){
                tindakan.poin = tindakan.poin - 1;
            } else {
                i = i-1;
                System.out.println("Jawaban anda tidak valid");
            }
            System.out.println("Jumlah poin sekarang: " + tindakan.poin);
        }
        
        if (tindakan.poin > 5) {
            System.out.println("Kebaikan anda lebih banyak daripada keburukan anda. Anda berhak masuk surga :)");
        } else {
            System.out.println("Berbuat lebih banyak kebaikan lagi ya " + manusia.nama + " :)");
        }
    }
}



