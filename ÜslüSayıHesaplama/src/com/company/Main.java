package com.company;

import java.util.Scanner;

public class Main {
    static void usAlma() {
        int taban, us;
        double sonuc;
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        taban = scan.nextInt();
        System.out.print("Üs değerini giririniz: ");
        us = scan.nextInt();
        sonuc = Math.pow(taban, us);
        System.out.println("Sonuç: " + sonuc);
        usAlma();

    }

    public static void main(String[] args) {
        // Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
        usAlma();


    }


}
