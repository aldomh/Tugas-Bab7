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
public class Premium extends Salon {
    
   public Premium(){
        System.out.println("Diskon 20% untuk seluruh jasa dan produk");
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
            total = potong - (potong*20/100);
            System.out.println("Jasa Potong");
            System.out.println("Harga\t: Rp "+potong);
            System.out.println("Diskon\t: Rp "+potong*20/100);
            System.out.println("Total\t: Rp "+total);
        }
        else if ("rebounding".equalsIgnoreCase(a)){
            total = rebounding - (rebounding*20/100);
            System.out.println("Jasa Rebounding");
            System.out.println("Harga\t: Rp "+rebounding);
            System.out.println("Diskon\t: Rp "+rebounding*20/100);
            System.out.println("Total\t: Rp "+total);
        }
        else if ("facial".equalsIgnoreCase(a)){
            total = facial - (facial*20/100);
            System.out.println("Jasa Facial");
            System.out.println("Harga\t: Rp "+facial);
            System.out.println("Diskon\t: Rp "+facial*20/100);
            System.out.println("Total\t: Rp "+total);
        }
        else
            System.out.println("Input tidak sesuai...");
    }
    
    public void produk(String b){
        if ("Rambut".equalsIgnoreCase(b)){
            total = obatRambut - (obatRambut*20/100);
            System.out.println("Produk Obat Rambut");
            System.out.println("Harga\t: Rp "+obatRambut);
            System.out.println("Diskon\t: Rp "+obatRambut*20/100);
            System.out.println("Total\t: Rp "+total);
        }
        else if ("Wajah".equalsIgnoreCase(b)){
            total = obatWajah - (obatWajah*20/100);
            System.out.println("Produk Obat Wajah");
            System.out.println("Harga\t: Rp "+obatWajah);
            System.out.println("Diskon\t: Rp "+obatWajah*20/100);
            System.out.println("Total\t: Rp "+total);
        }
        else
            System.out.println("Input tidak sesuai...");
    }
}
