/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.espol.modelos;

/**
 *
 * @author josue
 */
public class HDoble extends Habitacion{
    private double precio = 45.00; 

    public HDoble(String detalles, String numeroHabitacion, String piso, String tipo) {
        super(detalles, numeroHabitacion, piso, tipo);
    }

    
    public double getPrecio() {
        return precio;
    }
}
