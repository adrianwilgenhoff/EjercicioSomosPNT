/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejersomospnt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adrian
 */
public class Concesionaria {
    
    private List<Vehiculo> consecionaria;

    public Concesionaria() {
        this.consecionaria = new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
        consecionaria.add(vehiculo);    
    }
    
    public void listarVehiculo(){
        for (Vehiculo v : consecionaria){
            System.out.println(v);
        }
    }
    
    public String vehiculoMasCaro(){
    
        return null;
    }
    
    public String vehiculoMasBarato(){
    
        return null;
    }
    
    
    public String bucarModeloPorLetra(char letra){
    
        return null;
    }
}
