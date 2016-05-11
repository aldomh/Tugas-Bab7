/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakproglan.bab7;

import java.util.Scanner;

/**
 *
 * @author Aldo
 */
public class MainSalon {
    public static void main(String[] args) {
        String jasa;
        String produk;
        Scanner in = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~SALON PAS~~~~~~~~~~~~~");
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        System.out.println("Jenis Keanggotaan Anda : (1/2/3/4))");
        System.out.println("1. Premium");
        System.out.println("2. Gold");
        System.out.println("3. Silver");
        System.out.println("4. Non Anggota");
        System.out.print("Masukkan Keanggotaan Anda : ");
        int pilihan = in.nextInt();
        switch(pilihan){
            case 1 :
                Premium pre = new Premium();
                System.out.println("");
                System.out.println("Jasa yang anda pilih : ");
                jasa = in.next();
                System.out.println("Produk yang diambil : ");
                produk = in.next();
                System.out.println("");
                pre.jasa(jasa);
                pre.produk(produk);
                break;
            case 2 :
                Gold mas = new Gold();
                System.out.println("");
                System.out.println("Jasa yang anda pilih : ");
                jasa = in.next();
                System.out.println("Produk yang diambil : ");
                produk = in.next();
                System.out.println("");
                mas.jasa(jasa);
                mas.produk(produk);
                break;
            case 3 :
                Silver sil = new Silver();
                System.out.println("");
                System.out.println("Jasa yang anda pilih : ");
                jasa = in.next();
                System.out.println("Produk yang diambil : ");
                produk = in.next();
                System.out.println("");
                sil.jasa(jasa);
                sil.produk(produk);
                break;
            case 4 :
                Biasa non = new Biasa();
                System.out.println("");
                System.out.println("Jasa yang anda pilih : ");
                jasa = in.next();
                System.out.println("Produk yang diambil : ");
                produk = in.next();
                System.out.println("");
                non.jasa(jasa);
                non.produk(produk);
                break;
            default :
                System.out.println("Input tidak sesuai...");
        }       
    }
}
