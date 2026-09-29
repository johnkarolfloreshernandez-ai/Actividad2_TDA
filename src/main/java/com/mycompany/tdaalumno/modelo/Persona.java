/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdaalumno.modelo;

/**
 * john karol flores hernandez
 * @author johnf
 */
public class Persona {
      private String nombre;

    public Persona(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            this.nombre = "Sin nombre";
        } else {
            this.nombre = nombre;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }
    
}
