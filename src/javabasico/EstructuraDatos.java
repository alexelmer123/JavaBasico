/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Soporte
 */
public class EstructuraDatos {
    public void array(){
        String apellido = "lipa";
        
        Object[] datos ={"Alex","jose","Daniel", 23,"SENATI",false,23,12};
        ///obtener la cantidad de datos.
        //Iterando usar este control if () si encuentras la palabra senati print print por consola 
        //se encuentra la palabra "[?]"
        int cantidad = datos.length;
        System.out.println("cantidad de datos de mi array: "+ cantidad);
            for (int i = 0; i < cantidad; i++) {
            if (datos[i].equals("SENATI") || datos[i].equals("[?]")) {
                System.out.println("Se encuentra la palabra : " + datos[i]);
            } else {
                System.out.println(datos[i]);
            }
            
            
        
            }
       
        
    }  
    public void list(){
        List<String> nombre = new ArrayList<>() ;
        nombre.add("Marco");
        nombre.add("pedro");
        nombre.add("Alex");
        
        
        List<String> nombresNuevo = new ArrayList<>() ;
        nombresNuevo.add("Maria");
        nombresNuevo.add("juan");
        nombresNuevo.add("ana");
        
        ///
        nombre.addAll(nombresNuevo);
        
        //111111111111111111111111111111111111
        int cantidad = nombre.size();
        System.out.println("cantidad de datos: "+ cantidad);
        
        //
        System.out.println("el dato:" + nombre.get(0)); 
        
       for (int i = 0; i <= nombre.size()-1; i++) {
         System.out.println("el dato es : " + nombre.get(i));
         if (nombre.get(i) == (Object)"Maria") {
         System.out.println("Se encuentra la palabra : " +nombre.get(i));
            
            }
         
       }
       ///renmover 
    nombre.remove("alex");
    //encontrar una lista 
    nombre.contains("alex");
    //
    nombre.indexOf("alex");
    //
    Collections.sort(nombre);
    //
    Collections.reverse(nombre);
    //
    nombre.set(1, "mmmmm");
    
        System.out.println("--------------------------------------------");
        for(String item:nombre){
        System.out.println("el dato es: " + item);
        }
        System.out.println("---------------------------------------------");
    //
    
    nombre.clear();
   
    
    
    // revertir una lista
    
    //
        
        
        
    }
    
     public void map() {
    Map<String, Integer> edades = new HashMap<>();
    edades.put("Marco", 50);
    edades.put("alex", 1000000);
    edades.put("juan", 20);
    edades.put("pedro", 100);

    // Remove data
    edades.remove("Marco");

    // Check if each person is an adult or a minor
    for (Map.Entry<String, Integer> entry : edades.entrySet()) {
        String nombre = entry.getKey();
        int edad = entry.getValue();
        System.out.println("clave: " + nombre + " valor" + edad);
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " es menor de edad.");
        }
    }

    // Cantidad de datos
    int cantidad = edades.size();
    System.out.println("Cantidad de datos: " + cantidad);
            }
         
}
    

    

         

         
         
         
     
    
    

