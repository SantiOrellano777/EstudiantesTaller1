/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.estudiantes.modelo.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author SANTIAGO
 */
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("=== Ligadura estática ===");
    System.out.println("Universidad: " + Estudiante.universidad());
    
    System.out.println("\n--- Estudiante de pregrado ---");
    System.out.print("Nombre: ");
    String nombre1 = sc.nextLine();
    System.out.print("Código: ");
    String codigo1 = sc.nextLine();
    System.out.print("Número de créditos: ");
    int creditos = sc.nextInt();
    sc.nextLine();
    
     System.out.println("\n--- Estudiante de posgrado ---");
     System.out.print("Nombre: ");
     String nombre2 = sc.nextLine();
     System.out.print("Código: ");
     String codigo2 = sc.nextLine();
     System.out.print("Número de materias: ");
     int materias = sc.nextInt();
     
     Estudiante a = new Pregrado(nombre1, codigo1, creditos);
     Estudiante b = new Posgrado(nombre2, codigo2, materias);
     
     System.out.println("\n=== Sobrecarga ===");
     a.mostrarNombre();       
     b.mostrarNombre(true);   

     System.out.println("\n=== Ligadura dinámica ===");
     System.out.println("Matrícula pregrado: $" + a.calcularMatricula());
     System.out.println("Matrícula posgrado: $" + b.calcularMatricula());

     sc.close();
     
    }
}
