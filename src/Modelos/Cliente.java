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
public class Cliente extends Persona implements Serializable{
    private int añosFidelidad;

    public Cliente(String cedula, String nombre, String telefono,int añosFidelidad) {
        super(cedula, nombre, telefono);
        this.añosFidelidad = añosFidelidad;
    }

    /**
     * @return the añosFidelidad
     */
    public int getAñosFidelidad() {
        return añosFidelidad;
    }

    /**
     * @param añosFidelidad the añosFidelidad to set
     */
    public void setAñosFidelidad(int añosFidelidad) {
        this.añosFidelidad = añosFidelidad;
    }
    
}
