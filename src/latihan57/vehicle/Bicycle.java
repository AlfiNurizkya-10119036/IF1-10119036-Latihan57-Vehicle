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
 * Deskripsi Program : Program Memasukan Data Bicycle
 */
public class Bicycle extends Vehicle{

    private int myGearCount;

    public Bicycle() {
        System.out.println("Bicycle");
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
}
