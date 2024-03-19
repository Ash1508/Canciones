/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sismusica.Modelo;

/**
 *
 * @author Estudiante
 */
public class Cancion {
    private int id;
    private String nombre;
    private double duracion;
    private int annio;
    private String genero; 

    public Cancion(int id, String nombre, double duracion, int annio, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.annio = annio;
        this.genero = genero;
    }
    
    

    public Cancion() {
        this.id = 0;
        this.nombre = "";
        this.duracion = 0;
        this.annio = 0;
        this.genero = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
