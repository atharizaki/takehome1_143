/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung.berhitung;

/**
 *
 * @author athar
 */
public class input {
    public int banyakBelanja (int harga, int jumlah){
        int banyakbelanja = harga * jumlah;
        return banyakbelanja;
    }
    public int diskon(int harga, int jumlah){
        int banyakbelanja = harga * jumlah;
        int diskon;
        
        if(banyakbelanja < 10000){
            diskon = banyakbelanja - (banyakbelanja * 0/100);
        }
        else if((banyakbelanja > 10000) || (banyakbelanja < 50000)){
            diskon = banyakbelanja - (banyakbelanja * 5/100);
        }
        else if((banyakbelanja > 50000) || (banyakbelanja < 100000)){
            diskon = banyakbelanja - (banyakbelanja * 10/100);
        }
        else{
            diskon = banyakbelanja - (banyakbelanja * 15/100);
        }
        return diskon; 
    }
    public int Getdiskon(int harga, int jumlah){
        int banyakbelanja = harga * jumlah;
        int diskon;
        
        if(banyakbelanja < 10000){
            diskon = 0;
        }
        else if((banyakbelanja > 10000) || (banyakbelanja < 50000)){
            diskon = 5;
        }
        else if((banyakbelanja > 50000) || (banyakbelanja < 100000)){
            diskon = 10;
        }
        else{
            diskon = 15;
        }
        return diskon;    
    }
}
