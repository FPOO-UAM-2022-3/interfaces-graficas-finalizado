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
public class Taller implements Serializable{
    private String id;
    private String nombre;
    private String direccion;
    private LinkedList<Tecnico> misTecnicos;
    private LinkedList<Cubiculo> misCubiculos;
    public Taller(String id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.misTecnicos=new LinkedList<>();
        this.misCubiculos=new LinkedList<>();
    }
    public void crearTecnico(String cedula,
                            String nombre, 
                            String telefono,
                            String especializacion,
                            int añosExperiencia){
        
        Tecnico nuevoTecnico=new Tecnico(cedula, nombre, telefono, especializacion, añosExperiencia);
        this.misTecnicos.add(nuevoTecnico);
    }
    public void eliminarTecnico(Tecnico despedido){
        this.misTecnicos.remove(despedido);
    }
    public void crearCubiculo(String id,String nombre){
        Cubiculo nuevoCubiculo=new Cubiculo(id,nombre);
        this.misCubiculos.add(nuevoCubiculo);
    }
    public Vehiculo vehiculoAntiguo(){
        Vehiculo antiguo=null;
        int menor=Integer.MAX_VALUE;
        for(Cubiculo cubiculoActual:this.misCubiculos){
            for(Vehiculo vehiculoActual:cubiculoActual.getMisVehiculos()){
                if(vehiculoActual.getAño()<menor){
                    menor=vehiculoActual.getAño();
                    antiguo=vehiculoActual;
                }
            }
        }
        return antiguo;
    }
    public int contarCarros(){
        int respuesta=0;
        for(Cubiculo cubiculoActual:this.misCubiculos){
            respuesta+=cubiculoActual.calcularCarros();
        }
        return respuesta;
    }
    public Tecnico buscarTecnico(String cedula){
        Tecnico encontrado=null;
        for (Tecnico actual:this.misTecnicos) {
            if (actual.getCedula().equals(cedula)) {
                encontrado=actual;
            }
        }
        return encontrado;
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

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the misTecnicos
     */
    public LinkedList<Tecnico> getMisTecnicos() {
        return misTecnicos;
    }

    /**
     * @param misTecnicos the misTecnicos to set
     */
    public void setMisTecnicos(LinkedList<Tecnico> misTecnicos) {
        this.misTecnicos = misTecnicos;
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
