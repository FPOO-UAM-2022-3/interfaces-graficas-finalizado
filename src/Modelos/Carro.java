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
public class Carro extends Vehiculo implements Serializable{
    private String transmision;

    public Carro(String placa, String marca, int año, String color, double avaluo,String transmision) {
        super(placa, marca, año, color, avaluo);
        this.transmision = transmision;
    }

    /**
     * @return the transmision
     */
    public String getTransmision() {
        return transmision;
    }

    /**
     * @param transmision the transmision to set
     */
    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    
}
