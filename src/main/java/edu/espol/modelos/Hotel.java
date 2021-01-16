/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.espol.modelos;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Hotel{
    private int numeroPisos;
    public String nombre;
    public double estrellas;
    public String telefono;
    public String ciudad;
    public String direccion;
    public static ArrayList<String> pisos = new ArrayList<>();
    public static ArrayList<Habitacion> habitaciones = new ArrayList<>();

    public Hotel(int numeroPisos, String nombre, double estrellas, String telefono, String ciudad, String direccion) {
        this.numeroPisos = numeroPisos;
        this.nombre = nombre;
        this.estrellas = estrellas;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.direccion = direccion;
        for(int i=1; i<=numeroPisos;i++){
            pisos.add(Integer.toString(i));
        }
    }
}
