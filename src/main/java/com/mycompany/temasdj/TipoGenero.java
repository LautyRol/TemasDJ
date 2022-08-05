/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.temasdj;

/**
 *
 * @author PUPY
 */
public class TipoGenero {
    //Atributos:
    private int codigo;
    private String nombre;
    
    
    //Constructores:

    public TipoGenero(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public TipoGenero() {
        this.codigo = 0;
        this.nombre = "";
    }
    
    //Getters y Setters:

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    //Metodos propios:
    public String toString() {
        return "TipoGenero{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
    
}
