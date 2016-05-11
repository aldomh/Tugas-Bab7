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
public abstract class Salon {
    public String jasa;
    public String produk;  
    public int total;
    public int potong = 30000;
    public int rebounding = 60000;
    public int facial = 50000;
    public int obatRambut = 30000;
    public int obatWajah = 75000;
    
    public abstract void jasa(String a);
    public abstract void produk(String b);   
}
