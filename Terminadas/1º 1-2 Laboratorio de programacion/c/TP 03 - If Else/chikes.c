#include<stdio.h>

int main () {
    //variables
    int edad1, edad2, edad3, max1, max2, max3;
    
    //Ingreso de datos
    printf ("Ingrese su edad:\n");
    scanf ("%d", &edad1);
    printf ("Ingrese su edad:\n");
    scanf ("%d", &edad2);
    printf ("Ingrese su edad:\n");
    scanf ("%d", &edad3);
    
    //Instrucciones
    // este bloque esta ok
    if (edad1 > edad2 && edad1 > edad3) {
    max1 = edad1;
    if (edad2 > edad3) {
    max2 = edad2; max3 = edad3;
    } else { max2 = edad3; max3 = edad2; 
    }




    //este tiene < en vez de > y falta desarrollar como el primero
    } if (edad2 > edad1 && edad2 < edad3) {
    max2 = edad3; 


    // este esta bien y falta desarrollar como el primero
    }if (edad3 > edad1 && edad3 > edad2){
    max1 = edad3;
    }

    printf ("La edad mayor es:%d\n", max1);
    return 0;
}