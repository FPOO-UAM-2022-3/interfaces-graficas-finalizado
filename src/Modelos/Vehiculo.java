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
public abstract class Vehiculo implements Serializable{
    private String placa;
    private String marca;
    private int año;
    private String color;
    private double avaluo;
    private Motor miMotor;
    private Cliente miCliente;
    private LinkedList<Diagnostico> misDiagnosticos;
    public Vehiculo(String placa, String marca, int año, String color, double avaluo) {
        this.placa = placa;
        this.marca = marca;
        this.año = año;
        this.color = color;
        this.avaluo = avaluo;
        this.misDiagnosticos=new LinkedList<>();
    }
    public void crearMotor(String id,double peso,int caballosFuerza){
        Motor nuevoMotor=new Motor(id, peso, caballosFuerza);
        this.setMiMotor(nuevoMotor);
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the avaluo
     */
    public double getAvaluo() {
        return avaluo;
    }

    /**
     * @param avaluo the avaluo to set
     */
    public void setAvaluo(double avaluo) {
        this.avaluo = avaluo;
    }

    /**
     * @return the miMotor
     */
    public Motor getMiMotor() {
        return miMotor;
    }

    /**
     * @param miMotor the miMotor to set
     */
    public void setMiMotor(Motor miMotor) {
        this.miMotor = miMotor;
    }

    /**
     * @return the misDiagnosticos
     */
    public LinkedList<Diagnostico> getMisDiagnosticos() {
        return misDiagnosticos;
    }

    /**
     * @param misDiagnosticos the misDiagnosticos to set
     */
    public void setMisDiagnosticos(LinkedList<Diagnostico> misDiagnosticos) {
        this.misDiagnosticos = misDiagnosticos;
    }

    /**
     * @return the miCliente
     */
    public Cliente getMiCliente() {
        return miCliente;
    }

    /**
     * @param miCliente the miCliente to set
     */
    public void setMiCliente(Cliente miCliente) {
        this.miCliente = miCliente;
    }
    
}
