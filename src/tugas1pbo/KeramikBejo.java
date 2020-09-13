/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1pbo;

/**
 *
 * @author Kirana
 */
public class KeramikBejo{

    int uk,hrg,isi;

    int ukuran(){
//        int luas = Math.round(100/(this.uk/10000));
        int luas = 1000000/this.uk;
        return luas;
    }
    
    int jumlahBox(){
        int jmlBox = this.ukuran()/this.isi;
        return jmlBox;
    }
    
    void harga(){
        int totalHarga = this.jumlahBox()*this.hrg;
        System.out.println("Total Box Keramik : "+this.jumlahBox()+" Box");
        System.out.println("Total Harga Keramik : "+totalHarga+ " Rupiah");

    }
    public static void main(String[] args) {
       
        KeramikBejo A = new KeramikBejo();
        A.uk = 30*30;
        A.hrg = 54000;
        A.isi = 10;
        A.harga();
        
        KeramikBejo B = new KeramikBejo();
        B.uk = 40*40;
        B.hrg = 65000;
        B.isi = 5;
        B.harga();
        
        KeramikBejo C = new KeramikBejo();
        C.uk = 30*40;
        C.hrg = 60000;
        C.isi = 8;
        C.harga();
    }
    
}
