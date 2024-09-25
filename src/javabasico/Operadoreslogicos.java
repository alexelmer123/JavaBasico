
package javabasico;
public class Operadoreslogicos {
    
    public void operdor(){
        boolean esVerdadero = true;
        boolean esfalse = false;
        
        
        //opredor and (&&)
        
        boolean resultado = esVerdadero && esfalse;
        System.out.println("resultado AND " + resultado); 
        
        
        // operador or (||)
        boolean resultado1 = esVerdadero || esfalse;
        System.out.println("resultado or " + resultado1);  
        // operador not (!)
        boolean resultado2 = !esVerdadero;
        System.out.println("resultado not " + resultado2);  
        
    }
}
