package org.cgmlti.ciclos;

public class CicloBasico {

    public static void main(String[] args) {
        //contador es de tipo entero
        int contador = 10;

        //TIP: el valor de la condicional
        //      deberia ser el valor final
        //      del ciclo
        while ( contador >= 1 ) {
             //instructor del ciclo:
             System.out.println(contador);

             //instructor de incremento
             //se asigna a la variable de control
             //el mismo valor de la variable de control
             //mas el valor de incremento
             //instruccion de incremento
             //se ubica al final del
             // bloque de codigo
            contador -= 1;
        }

    }

}
