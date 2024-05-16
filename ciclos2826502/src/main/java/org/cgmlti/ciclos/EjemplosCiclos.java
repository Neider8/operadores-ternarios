package org.cgmlti.ciclos;

public class EjemplosCiclos {

    public static void main(String[] args) {
        
        int contador = 1;

        int total = 0;

        for(contador = 0;
        contador<= 10;
        contador++){

            total =+ contador;
            System.out.println(contador);
        }

        //imprimir variable acumuladora
        //siempre despues del ciclo
        System.out.println("el total es:" + total);


        
        /*int contador = 100;
        int total = 0;
        while ( contador >= 1 ) {
            total =+ contador;
             
             
        }

        System.out.println("el total es:" + total);/* */
            


    }

}
