/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.estudiantes.modelo.mavenproject1;

/**
 *
 * @author SANTIAGO
 */
public class Posgrado extends Estudiante{
    private int materias;

    public Posgrado(int materias, String nombre, String codigo) {
        super(nombre, codigo);
        this.materias = materias;
    }

   

    @Override
    public double calcularMatricula() {
         return materias*300000;
    }
    
    
}
