/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan57.vehicle;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program : Program Memasukan Data Vehicle
 */
public class Latihan57Vehicle {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        // memasukkan data 
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);
        // menampilkan data
        System.out.println("Brand : ".concat(bicycle.getMyBrand()));
        System.out.println("Model : ".concat(bicycle.getMyModel()));
        System.out.println("Jumlah Gear : " + bicycle.getMyGearCount());
        
        System.out.println();
        
        Skateboard skateboard = new Skateboard();
        // memasukkan data
        skateboard.setMyBrand("Ally Skate");
        skateboard.setMyModel("Rocket");
        skateboard.setMyBoardLength(54.5);
        // menampilkan data
        System.out.println("Brand : ".concat(skateboard.getMyBrand()));
        System.out.println("Model : ".concat(skateboard.getMyModel()));
        System.out.println("Jumlah Gear : " + skateboard.getMyBoardLength());
    }
}

