/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maria Cospin
 */
public class Velas {
  private String categoría;
  private String temporada;
  private int numeroVela;
  private double precio;
  private int existencias;
  private double cantidadLaminaUsada;

    public Velas() {
        this.categoría = "";
        this.temporada = "";
        this.numeroVela = 0;
        this.precio = 0.0;
        this.existencias = 0;
        this.cantidadLaminaUsada = 0.0;
    }

    
    
    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public int getNumeroVela() {
        return numeroVela;
    }

    public void setNumeroVela(int numeroVela) {
        this.numeroVela = numeroVela;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public double getCantidadLaminaUsada() {
        return cantidadLaminaUsada;
    }

    public void setCantidadLaminaUsada(double cantidadLaminaUsada) {
        this.cantidadLaminaUsada = cantidadLaminaUsada;
    }
  
  
}


