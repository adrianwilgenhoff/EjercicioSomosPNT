/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejersomospnt;

/**
 *
 * @author Adrian
 */
public class Auto extends Vehiculo{
    
    private int puertas;

    public Auto(int puertas, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Marca:" + super.getMarca() + " // Modelo: " + super.getModelo()+ " // Puertas: "+ puertas + " // Precio: " + super.getPrecio();
    }
    
    
}
