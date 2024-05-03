/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir.G2D;

import tugasakhir.Benda2D;

/**
 *
 * @author abaym
 */
public class Persegi implements Benda2D {
    private double rusuk;
    private double luas;

    public Persegi(double rusuk) {
        this.rusuk = rusuk;
    }

    public double getSisi() {
        return this.rusuk;
    }
    
    public double getLuas() {
        return luas;
    }

    @Override
    public double menghitungLuas() {
        luas = Math.pow(rusuk, 2);
        return luas;
    }
}
