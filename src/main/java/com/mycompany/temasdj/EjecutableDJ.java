/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.temasdj;

import java.util.Scanner;

/**
 *
 * @author PUPY
 */
public class EjecutableDJ {
     public static void main(String[] args){
         //Atributos:
         String nomMusica;
         String tiempo;
         String genero;
         String nomArtista;
         
         Scanner input = new Scanner(System.in);
         //El usuario ingresa el nombre de la cancion:
         System.out.println("Ingrese el nombre de la cancion: ");
         nomMusica = input.nextLine();
         
         //El usuario ingresa el tiempo de la cancion:
         System.out.println("Ingrese el tiempo de la cancion: ");
         tiempo = input.nextLine();
         
         //El usuario ingresa el tipo de genero de la cancion:
         System.out.println("Ingrese el tipo de genero de la cancion: ");
         genero = input.nextLine();
         
         //El usuario ingresa el nombre del artista:
         System.out.println("Ingrese el nombre del artista: ");
         nomArtista = input.nextLine();
         
        //Crear una tema con los valores por defecto:
        TemasDJ c1 = new TemasDJ();
        c1.setCodigo(789);
        c1.setNombreMusica(nomMusica);
        c1.setTiempo(tiempo);
        c1.setNombre(genero);
        c1.setNombreArtistico(nomArtista);
        System.out.println("Los datos del tema 1 son: " + c1.toString());
    
}
}
