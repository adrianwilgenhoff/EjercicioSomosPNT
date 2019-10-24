/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejersomospnt;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Adrian
 */
public class EjerSomosPNT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo vehiculo1 = new Auto(4,"Peugeot","206",200000.00);
        Vehiculo vehiculo2 = new Moto("125c","Honda","Titan",60000.00);
        Vehiculo vehiculo3 = new Auto(5,"Peugeot","208",250000.00);
        Vehiculo vehiculo4 = new Moto("160c","Yamaha","YBR",80500.50);
        
        Concesionaria concesionaria = new Concesionaria();
        
        concesionaria.agregarVehiculo(vehiculo1);
        concesionaria.agregarVehiculo(vehiculo2);
        concesionaria.agregarVehiculo(vehiculo3);
        concesionaria.agregarVehiculo(vehiculo4);
        
        concesionaria.listarVehiculo();
        
        System.out.println("=============================");
        
        //Usando JAVA 8.
        System.out.println("Imprimiendo usando Streams de JAVA 8");
        List <Vehiculo> myConcesionary8 = Arrays.asList(vehiculo1,vehiculo2,vehiculo3,vehiculo4);
        
        
        //myConcesionary8.forEach(vehiculo -> System.out.println(vehiculo));
        myConcesionary8.forEach(System.out::println);
        //myConcesionary8.stream().forEach(System.out::println);
        //myConcesionary8.stream().forEach(e -> System.out.println(e.getModelo()));
        //myConcesionary8.stream().forEach(e -> System.out.println(e.toString()));
        //List<String> friends = Arrays.asList("Brian", "Nate");
        //friends.forEach((name) -> System.out.println(name));
        //------------------------------------------------------------------------------------------------------------
        System.out.println("=============================");

        System.out.print("Vehículo que contiene en el modelo la letra ‘Y’: ");
        Optional<Vehiculo> optional=myConcesionary8.stream().filter(m->m.getModelo().contains("Y")).findFirst();
        if (optional.isPresent()) {
            System.out.println(optional.get().getMarca() + " " + optional.get().getModelo() + " " + optional.get().getPrecio());
        }
        else
            System.out.println("No hay ningun modelo que contenga esa letra");
    
        
        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        //myConcesionary8.stream().sorted().forEach(System.out::println);
        
        System.out.println("=============================");
        Optional<Vehiculo> max = myConcesionary8.stream().max((a1, a2) -> a2.compareTo(a1));
        System.out.println("Vehículo mas caro: " + max.get().getMarca()+ " " + max.get().getModelo());
        
        System.out.println("=============================");
        Optional<Vehiculo> min = myConcesionary8.stream().min((a1, a2) -> a2.compareTo(a1));
        System.out.println("Vehículo mas barato: " + min.get().getMarca()+ " " + min.get().getModelo());
        
        
        Optional<Vehiculo> max2 = myConcesionary8.stream().max((t, t1) -> {
            return t.getPrecio() > t1.getPrecio()? 1: -1; 
        });
        System.out.println("Vehículo mas caro: " + max2.get().getMarca()+ " " + max2.get().getModelo());
    }
    
}
