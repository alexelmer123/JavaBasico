
package javabasico;

import java.util.Scanner;


public class Practica {
   //Swicht case
    public void menu(){
        System.out.println("elige una opcion");
        System.out.println("1, desayuno");
        System.out.println("2, alumerzo");
        System.out.println("3, cena");
        System.out.println("4, extras");
        System.out.println("5, salir");
        
        System.out.print("elige una opcion");
        Scanner sc = new Scanner (System.in);
        int ValorQueInsertaElUsuario = sc.nextInt();
        switch(ValorQueInsertaElUsuario){
            case 1:
               System.out.println("jugo de papaya");
               System.out.println("calado de cabeza");
               System.out.println("lomo saltado");
               break;
            case 2:
               System.out.println("estofado");
               break;
            case 3:
                System.out.println("pollo a la braza");
                break;
            case 4:
                System.out.println("no tenemos extras");
                break;
            case 5:
                System.out.println("gracias por visitarnos");
                break;
            
            default:
                System.out.println("vuelva pronto");
                break;

               
            
        }
    }

}
