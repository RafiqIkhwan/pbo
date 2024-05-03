/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import java.util.Scanner;
import tugasakhir.G2D.*;
import tugasakhir.G3D.Kubus;

/**
 *
 * @author abaym
 */
public class TugasAkhir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0;
        while(i==0){
            double d1 = input.nextDouble();
            Persegi belahKetupat = new Persegi(d1);
            System.out.println("Luas Persegi : " + belahKetupat.menghitungLuas());
            Kubus p = new Kubus(d1);
            System.out.println("Luas Permukaan Kubus : " +p.menghitungLuasPermukaan());
            System.out.println("Luas Volume Kubus : " +p.menghitungVolume());
        }
    }
}
