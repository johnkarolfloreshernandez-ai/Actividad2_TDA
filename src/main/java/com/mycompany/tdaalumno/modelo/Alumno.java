/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdaalumno.modelo;

/**
 *
 * @author johnf
 */

public class Alumno extends Persona {

    private int edad;
    private double calificacion;

    // Constructor
    public Alumno(String nombre, int edad, double calificacion) {

        super(nombre);

        if (edad > 0) {
            this.edad = edad;
        } else {
            this.edad = 1;
        }

        if (calificacion >= 0 && calificacion <= 10) {
            this.calificacion = calificacion;
        } else {
            this.calificacion = 0;
        }
    }

    // Getter de edad
    public int getEdad() {
        return edad;
    }

    // Setter de edad
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    // Getter de calificación
    public double getCalificacion() {
        return calificacion;
    }

    // Setter de calificación
    public void setCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <= 10) {
            this.calificacion = calificacion;
        }
    }

    // Método de lógica 1
    public boolean estaAprobado() {

        return calificacion >= 6;
    }

    // Método de lógica 2
    public String obtenerNivel() {

        if (calificacion >= 9) {
            return "Excelente";
        } else if (calificacion >= 8) {
            return "Muy bueno";
        } else if (calificacion >= 6) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    // Método de lógica 3
    public double puntosParaDiez() {

        return 10 - calificacion;
    }

    // Método de lógica 4
    public boolean esMayorDeEdad() {

        return edad >= 18;
    }

    // Método de lógica 5
    public String obtenerMensaje() {

        if (estaAprobado()) {
            return "El alumno aprobó.";
        } else {
            return "El alumno reprobó.";
        }
    }

    // Método recursivo
    public int contarRegresivo(int numero) {

        // Caso base
        if (numero <= 0) {
            return 0;
        }

        // Llamada recursiva
        return 1 + contarRegresivo(numero - 1);
    }

    // Método para mostrar los datos
    public String mostrarDatos() {

        return "Nombre: " + getNombre()
                + "\nEdad: " + edad
                + "\nCalificación: " + calificacion
                + "\nNivel: " + obtenerNivel()
                + "\nMayor de edad: "
                + (esMayorDeEdad() ? "Sí" : "No");
    }
}