/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author Soporte
 */
public class EstructuraControl {
    private int edad;
//constructor//

    /**
     *
     * @param edad
     */
    public EstructuraControl(int edad) {
        this.edad = edad;
    }
  
  
    //......................................................//
    public  void estructura(){
        //int edad = 18;
        
        if(this.edad >= 18 && this.edad < 45){
            System.out.println ("es mayor de edad");
            
        }else if(this.edad >= 45){
            System.out.println ("es adulto");
        }else{
            System.out.println ("es menor de edad");
        
        
            
            
        
        }  
        
    }
    public void TablaDeMultipicar(int d){
            for(int i = 1;i <= 10; i++){
            System.out.println(i +" x "+d+" = "+ i*d);
            
            
        }
    }
    
}
