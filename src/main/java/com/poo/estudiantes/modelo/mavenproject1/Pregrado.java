/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.estudiantes.modelo.mavenproject1;

/**
 *
 * @author SANTIAGO
 */
public class Pregrado extends Estudiante {
    private int creditos;

    public Pregrado(String nombre, String codigo, int creditos) {
    super(nombre, codigo);
    this.creditos = creditos;
}
   

    @Override
    public double calcularMatricula() {
        return creditos*150000; 
    }
}
