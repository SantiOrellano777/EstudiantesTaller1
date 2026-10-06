/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.estudiantes.modelo.mavenproject1;

/**
 *
 * @author SANTIAGO
 */
public abstract class Estudiante {
    private String nombre;
    private String codigo;

    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    
    public abstract double calcularMatricula();
    
    
    public void mostrarNombre()
    {
        System.out.println("Nombre" + nombre);
    }
    public void mostrarNombre(boolean enMayusculas){
        if(enMayusculas)
        {
            System.out.println("Nombre" + nombre.toUpperCase()); 
        }
        else{
             System.out.println("Nombre" + nombre);
        }
    }
}
