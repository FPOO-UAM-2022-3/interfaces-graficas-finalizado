/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author pipet
 */
public class Tecnico extends Persona implements Serializable{
    private String especializacion;
    private int añosExperiencia;
    private LinkedList<Cubiculo> misCubiculos;
    LinkedList<Diagnostico> misDiagnosticos;
    public Tecnico(String cedula, String nombre, String telefono, String especializacion, int añosExperiencia) {
        super(cedula,nombre,telefono);
        this.especializacion = especializacion;
        this.añosExperiencia = añosExperiencia;
        this.misCubiculos=new LinkedList<>();
        this.misDiagnosticos=new LinkedList<>();
    }

  
    /**
     * @return the especializacion
     */
    public String getEspecializacion() {
        return especializacion;
    }

    /**
     * @param especializacion the especializacion to set
     */
    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    /**
     * @return the añosExperiencia
     */
    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    /**
     * @param añosExperiencia the añosExperiencia to set
     */
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    /**
     * @return the misCubiculos
     */
    public LinkedList<Cubiculo> getMisCubiculos() {
        return misCubiculos;
    }

    /**
     * @param misCubiculos the misCubiculos to set
     */
    public void setMisCubiculos(LinkedList<Cubiculo> misCubiculos) {
        this.misCubiculos = misCubiculos;
    }
    
}
