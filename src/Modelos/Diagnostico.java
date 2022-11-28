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
public class Diagnostico implements Serializable{
    private String id;
    private String descripcion;
    private Tecnico miTecnico;
    private Vehiculo miVehiculo;
    public Diagnostico(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the miTecnico
     */
    public Tecnico getMiTecnico() {
        return miTecnico;
    }

    /**
     * @param miTecnico the miTecnico to set
     */
    public void setMiTecnico(Tecnico miTecnico) {
        this.miTecnico = miTecnico;
    }

    /**
     * @return the miVehiculo
     */
    public Vehiculo getMiVehiculo() {
        return miVehiculo;
    }

    /**
     * @param miVehiculo the miVehiculo to set
     */
    public void setMiVehiculo(Vehiculo miVehiculo) {
        this.miVehiculo = miVehiculo;
    }
    
}
