
package javabasico;


public class TipoDato {
    public void Dato (){
               int myInteger = 10;
               String myString ="hola";
               double mydouble = 0;
               boolean esVerdadero = true;
               Object myobject = 20;
               
               System.out.println("bienvenidos tipo de datos " );
               System.out.println("1, int es de tipo"+ ((Object)myInteger).getClass().getSimpleName());
               System.out.println("2, String es de tipo"+ ((Object)myString).getClass().getSimpleName());
               System.out.println("3, double es de tipo"+ ((Object)mydouble).getClass().getSimpleName());
               System.out.println("4, boleano es de tipo"+ ((Object)esVerdadero).getClass().getSimpleName());
               System.out.println("1, object es de tipo"+ ((Object)myobject).getClass().getSimpleName());
               
        
    
}
    
}
