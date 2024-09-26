
package javabasico;

import java.util.Scanner;


public class JavaBasico {
    
    public void Principal(){
               System.out.println("bienvenidos java basico");
               System.out.println("1, operaciones logicas");
               System.out.println("2, tipo de datos");
               System.out.println("3, estructuras de control");
               System.out.println("4, escepciones");
               System.out.println("5, estructura de datos");
               //
               
               
               
                
         System.out.print("elige una opcion");
        Scanner sc = new Scanner (System.in);
        int data = sc.nextInt();
        
        switch(data){
            case 1:
              Operadoreslogicos o1  = new Operadoreslogicos ();
              o1.operdor();
              
               break;
               
               case 2:
              TipoDato tp  = new TipoDato ();
              tp.Dato();
              
               break;
               
               case 3:
               EstructuraControl ec = new EstructuraControl (40);
               //ec.estructura();3
               ec.TablaDeMultipicar(10000);

               break;
               case 4:
                   Exepciones ex = new Exepciones ();
                   ex.manejoerrores();
                   
                   break;
               case 5:
                   EstructuraDatos et = new EstructuraDatos();
                   //et.array();
                   //et.list();
                   et.map();
                   
    }
}

    
    public static void main(String[] args) {
        
        
      
      //Practica pra = new Practica();
      JavaBasico jb = new JavaBasico();
      jb.Principal();
      //pra.menu();
      
    }
    
}
