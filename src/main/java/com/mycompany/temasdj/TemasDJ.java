/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.temasdj;

/**
 *
 * @author PUPY
 */
public class TemasDJ {
    //Atributos
    private int codigo;
    private String nombreMusica;
    private String tiempo;
    private Artista artista;
    private TipoGenero tipoGenero;

    //Constructores

    public TemasDJ(int codigo, String nombreMusica, String tiempo, String artista, String tipoGenero, String nombre, String nombreArtistico, int edad) {
        this.codigo = codigo;
        this.nombreMusica = nombreMusica;
        this.tiempo = tiempo;
        this.artista = new Artista(nombre,nombreArtistico,edad,codigo,tipoGenero);
        this.tipoGenero = new TipoGenero(codigo,nombre);
    }
   
    public TemasDJ() {
        this.codigo = 0;
        this.nombreMusica = "";
        this.tiempo = "";
        artista = new Artista();
        tipoGenero = new TipoGenero();
        
    }
     
    //Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreMusica() {
        return nombreMusica;
    }

    public void setNombreMusica(String nombreMusica) {
        this.nombreMusica = nombreMusica;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombreArtistico() {
        return artista.getNombreArtistico();
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.artista.setNombreArtistico(nombreArtistico);
    }

    public String getNombre() {
        return tipoGenero.getNombre();
    }

    public void setNombre(String nombre) {
        this.tipoGenero.setNombre(nombre);
    }
    
    
    
    //Metodos propios:
    public String toString() {
        return "TemasDJ{" + "codigo=" + codigo + ", nombreMusica=" + nombreMusica + ""
                + ", tiempo=" + tiempo + ", artista=" + artista + ", tipoGenero=" + tipoGenero.toString() + '}';
    }
   
     
    private String tipoGenero(String tipoGenero){
        boolean Genero = false;
        final String [] arreglo = {"Musica clasica","Blues","Jazz",
            "Rock and Roll","Rock","Metal","Country","Funk","Disco","Pop","Salsa",
            "Hip Hop","Reggaeton","Rap","Trap","Cumbia Villera","Cumbia"};
        for (int i = 0; i < 20; i++){
            if (tipoGenero == arreglo[i]){
                Genero = true;
                
            }
        }
        if(Genero){
            return tipoGenero;
        }else{
            return "Tipo de genero no existente";
            
        }
    }

}
