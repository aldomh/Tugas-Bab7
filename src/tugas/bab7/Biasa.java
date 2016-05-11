/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakproglan.bab7;

/**
 *
 * @author Aldo
 */
public class Biasa extends Salon {
    
    public Biasa(){
        System.out.println("Non Anggota Tidak Mendapat Diskon");
        System.out.println("Jasa : ");
        System.out.println("\t Potong\t\tRp 30000");
        System.out.println("\t Rebounding\tRp 60000");
        System.out.println("\t Facial\t\tRp 50000");
        System.out.println("Produk Obat : ");
        System.out.println("\t Rambut\tRp 30000");
        System.out.println("\t Wajah\tRp 75000");
    }
        
    public void jasa(String a){
        if ("potong".equalsIgnoreCase(a)){
            total = potong;
            System.out.println("Jasa Potong");
            System.out.println("Total\t: Rp "+total);
        }
        else if ("rebounding".equalsIgnoreCase(a)){
            total = rebounding;
            System.out.println("Jasa Rebounding");
            System.out.println("Total\t: Rp "+total);
        }
        else if ("facial".equalsIgnoreCase(a)){
            total = facial;
            System.out.println("Jasa Facial");
            System.out.println("Total\t: Rp "+total);
        }
        else
            System.out.println("Input tidak sesuai...");
    }
    
    public void produk(String b){
        if ("Rambut".equalsIgnoreCase(b)){
            total = obatRambut;
            System.out.println("Produk Obat Rambut");
            System.out.println("Total\t: Rp "+total);
        }
        else if ("Wajah".equalsIgnoreCase(b)){
            total = obatWajah;
            System.out.println("Produk Obat Wajah");
            System.out.println("Total\t: Rp "+total);
        }
        else
            System.out.println("Input tidak sesuai...");
    }
}
