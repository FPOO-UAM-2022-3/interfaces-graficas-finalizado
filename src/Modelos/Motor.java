/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;

/**
 *
 * @author pipet
 */
public class Motor implements Serializable{
    private String id;
    private double peso;
    private int caballosFuerza;

    public Motor(String id, double peso, int caballosFuerza) {
        this.id = id;
        this.peso = peso;
        this.caballosFuerza = caballosFuerza;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the caballosFuerza
     */
    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    /**
     * @param caballosFuerza the caballosFuerza to set
     */
    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }
    
}
