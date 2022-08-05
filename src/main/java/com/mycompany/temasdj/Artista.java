/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.temasdj;

/**
 *
 * @author PUPY
 */
public class Artista {
    //Atributos:
    private String nombre;
    private String nombreArtistico;
    private int edad;
    private int codigo;
    private TipoGenero tipoGenero;
    
    //Constructores:

    public Artista(String nombre, String nombreArtistico, int edad, int codigo, String tipoGenero) {
        this.nombre = nombre;
        this.nombreArtistico = nombreArtistico;
        this.edad = edad;
        this.codigo = codigo;
        this.tipoGenero = new TipoGenero(codigo,nombre);
    }
    
    public Artista() {
        this.nombre = "";
        this.nombreArtistico = "";
        this.edad = 0;
        this.codigo = 0;
        tipoGenero = new TipoGenero();
        
    }
    
    //Getters y Setters:

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public TipoGenero getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(TipoGenero tipoGenero) {
        this.tipoGenero = tipoGenero;
    }
    
    
    //Metodos propios:
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ","
                + " nombreArtistico=" + nombreArtistico + ","
                + " edad=" + edad + ", codigo=" + codigo + ","
                + " tipoGenero=" + tipoGenero + '}';
    }
    
}
