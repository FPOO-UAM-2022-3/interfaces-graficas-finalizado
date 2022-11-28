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
public class Cubiculo implements Serializable{
    private String id;
    private String nombre;
    private Kit miKit;
    private LinkedList<Vehiculo> misVehiculos;
    public Cubiculo(String id,String nombre) {
        this.id = id;
        this.nombre=nombre;
        this.misVehiculos=new LinkedList<>();
    }
    public int calcularCarros(){
        int respuesta=0;
        for(Vehiculo actual:this.getMisVehiculos()){
            if (actual instanceof Carro) {
                respuesta+=1;
            }
  
        }
        return respuesta;
    }
    public void agregarKit(Kit nuevoKit){
        this.setMiKit(nuevoKit);
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
     * @return the miKit
     */
    public Kit getMiKit() {
        return miKit;
    }

    /**
     * @param miKit the miKit to set
     */
    public void setMiKit(Kit miKit) {
        this.miKit = miKit;
    }

    /**
     * @return the misVehiculos
     */
    public LinkedList<Vehiculo> getMisVehiculos() {
        return misVehiculos;
    }

    /**
     * @param misVehiculos the misVehiculos to set
     */
    public void setMisVehiculos(LinkedList<Vehiculo> misVehiculos) {
        this.misVehiculos = misVehiculos;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
