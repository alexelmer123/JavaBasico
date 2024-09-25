
package javabasico;

import java.util.Scanner;


public class Exepciones {
    public void manejoerrores(){
        Scanner sc  = new Scanner(System.in);
        
        
       try{///intentar
           System.out.println("ingrese un numero");
           int num = sc.nextInt();
       }catch(Exception e){//capturar
           System.out.println("ocurrio un error:  " + e.getMessage());
       }finally{//finalizar
           System.out.println("este bloque se ejecuta ");
           sc.close();
       }
        
    }
    
}
