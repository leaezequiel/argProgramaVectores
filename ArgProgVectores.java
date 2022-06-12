package com.mycompany.argprogvectores;

import java.util.Scanner;
import java.util.Arrays; 

public class ArgProgVectores {

    public static void main(String[] args) {
        /*
        Práctica Vectores
        Te dejamos algunas propuestas de prácticas que puedes realizar como desafío, 
        para que pongas en práctica lo aprendido. Estos ejercicios no son obligatorios y no tienes que entregarlos.
        Te invitamos a que los compartas en tus redes con tus compañeros y observes cómo otros lo han resuelto.


        1.Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100.
        Realizar un programa que permita la carga por teclado de los 10 números solicitados.
        
        int ejercicio1 [] = new int [10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese numero a agregar: ");
            Scanner sc = new Scanner(System.in);
            int numAgregado = sc.nextInt();
            ejercicio1 [i] = numAgregado;
            System.out.println("Quedan "+ (9-i) +" intentos");
        }
        System.out.println("Fueron agregados los siguientes numeros: "+Arrays.toString(ejercicio1));
        */
        /*
        2.En un vector de 15 posiciones se almacenan las edades de 15 alumnos. Se desea un programa que sea capaz de determinar
        cuál es la mayor edad y cuál es la menor edad que se encuentra entre los estudiantes.
        
        int ejercicio2 [] = new int [15];
        ejercicio2 [0]=14;
        ejercicio2 [1]=13;
        ejercicio2 [2]=13;
        ejercicio2 [3]=12;
        ejercicio2 [4]=15;
        ejercicio2 [5]=16;
        ejercicio2 [6]=12;
        ejercicio2 [7]=14;
        ejercicio2 [8]=15;
        ejercicio2 [9]=9;
        ejercicio2 [10]=12;
        ejercicio2 [11]=15;
        ejercicio2 [12]=16;
        ejercicio2 [13]=18;
        ejercicio2 [14]=12;
        //Para comenzar el array asigno los valores que sean la posición 0
        int numMax = ejercicio2 [0];
        int numMin = ejercicio2 [0];
        
        for (int i = 0; i < 15; i++) {            
            if(ejercicio2 [i]<= numMin){
                numMin = ejercicio2 [i] ;
            }
        }
        for (int i = 0; i < 15; i++) {            
            if(ejercicio2 [i]>= numMax){
               numMax = ejercicio2 [i] ;
            }
        }        
        
        System.out.println("Edad mínima: "+numMin);
        System.out.println("Edad máxima: "+numMax);
        */
        /*
        3.Se tienen tres vectores. En el primero de ellos se guarda un número de dni, en el segundo un nombre y en el tercero un apellido. 
        Se desea un programa que sea capaz de recorrer los tres vectores AL MISMO TIEMPO y mostrar cada uno de estos datos por pantalla.
        Pista: tener en cuenta que el índice de cada vector es correspondiente al índice de los demás, es decir, 
        los datos contenidos en el índice cero del vector de dni, se corresponde con el índice cero del vector de nombres y el de apellidos.
        */
        
    }
}
