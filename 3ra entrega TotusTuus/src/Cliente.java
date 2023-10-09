/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maria Cospin
 */
public class Cliente {
  private String nombre;
  private String Nit;
  private String direccion;

    public Cliente() {
        this.nombre = "";
        this.Nit = "";
        this.direccion = "";
    }
    
    public Cliente(String nombre, String Nit, String direccion){
        this.nombre = nombre;
        this.Nit = Nit;
        this.direccion = direccion;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

 
}
