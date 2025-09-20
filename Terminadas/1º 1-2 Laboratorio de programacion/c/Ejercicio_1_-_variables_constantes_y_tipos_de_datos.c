#include <stdio.h>
#include <stdbool.h>





int ejercicio (){
    /*Ejercicio 1: Declaración de Variables y Constantes
    Declara variables para almacenar:
    Un nombre (cadena de caracteres).
    Una edad (número entero).
    Una estatura en metros (número real).
    Un valor booleano que indique si es estudiante o no.
    Declara una constante para almacenar el valor de PI (3.1416).
    Muestra los valores en pantalla.*/

    char nombre1_1[] = "Pedro";
    char *nombre2_1 = "Pablo";
    int edad_1 = 36;
    float estatura_1 = 1.79;
    bool estudiante_1 = false;
    const float pi_1 = 3.1416;

    printf("Variable nombre11: %s\n", nombre1_1);
    printf("Variable nombre12: %s\n", nombre2_1);
    printf("Variable edad1: %d\n", edad_1);
    printf("Variable estatura1: %1.2f\n", estatura_1);
    printf("Variable estudiante1: %d\n", estudiante_1);
    printf("Variable pi1: %1.4f\n", pi_1);



    printf("\n\nFin de Ejercicio 1\n\n\n\n");
}




int main(){
//ejercicio ();
//ejercicio2 ();
ejercicio3 ();
//ejercicio4 ();
//ejercicio5 ();
//ejercicio6 ();
//ejercicio7 ();
}



int ejercicio2 (){
    /*Ejercicio 2: Operaciones Aritméticas
    Escribe un algoritmo que:
    Pida al usuario dos números enteros.
    Calcule y muestre la suma, resta, multiplicación, división y módulo de los números ingresados.*/

    int nro1_2;
    int nro2_2;
    
    printf("Ingrese el primer nro entero:\n");
    scanf("%d", &nro1_2);
    printf("Ahora ingrese el segundo nro:\n");
    scanf("%d",&nro2_2);

    printf("La suma de los valores ingresados es: %d\n", nro1_2 + nro2_2);
    printf("La resta del segundo al primero es: %d\n", nro1_2 - nro2_2);
    printf("La multiplicacion de los valores ingresados es: %d\n", nro1_2 * nro2_2);
    printf("El cociente entre los valores ingresados es: %d\n", nro1_2 / nro2_2);
    printf("La de los valores ingresados es: %d\n", nro1_2 % nro2_2);
    


    printf("\n\nFin de Ejercicio 2\n\n\n\n");

}

int ejercicio3 (){
    /*Ejercicio 3: Cálculo del Área de un Círculo
    Escribe un pseudocódigo que:
    Pida al usuario el radio de un círculo.
    Use la constante PI para calcular el área (A = PI * radio**2).
    Muestre el resultado en pantalla.*/

    const float pi_3= 3.14159265349;
    float r_3;

    printf("Ingrese el radio de un circulo:\n");
    scanf("%f",&r_3);

    printf("\nEl area es igual a: %f", pi_3 * r_3 *r_3);

    printf("\n\nFin de Ejercicio 3\n\n\n\n");

}

int ejercicio4 (){
    ;
}

int ejercicio5 (){
    ;
}

int ejercicio6 (){
    ;
}

int ejercicio7 (){
    ;
}


/*
Ejercicio 1: Declaración de Variables y Constantes
Declara variables para almacenar:
Un nombre (cadena de caracteres).
Una edad (número entero).
Una estatura en metros (número real).
Un valor booleano que indique si es estudiante o no.
Declara una constante para almacenar el valor de PI (3.1416).
Muestra los valores en pantalla.

Ejercicio 2: Operaciones Aritméticas
Escribe un algoritmo que:
Pida al usuario dos números enteros.
Calcule y muestre la suma, resta, multiplicación, división y módulo de los números ingresados.

Ejercicio 3: Cálculo del Área de un Círculo
Escribe un pseudocódigo que:
Pida al usuario el radio de un círculo.
Use la constante PI para calcular el área (A = PI * radio**2).
Muestre el resultado en pantalla.

Ejercicio 4: Conversión de Temperaturas
Escribe un pseudocódigo que:
Pida al usuario una temperatura en grados Celsius.
Convierta la temperatura a grados Fahrenheit usando la fórmula: F = (C * 9/5) + 32.
Muestre el resultado en pantalla.

Ejercicio 5: Cálculo de Promedio
Escribe un pseudocódigo que:
Pida al usuario tres números reales.
Calcule el promedio de estos números.
Muestre el resultado en pantalla.

Ejercicio 6: Intercambio de Valores (sin variable auxiliar)
Escribe un pseudocódigo que:
Pida al usuario dos números enteros A y B.
Intercambie los valores de A y B sin usar una tercera variable.
Muestre los valores intercambiados en pantalla.

Ejercicio 7: Intercambio de Valores (con variable auxiliar)
Escribe un pseudocódigo que:
Pida al usuario dos números enteros A y B.
Intercambie los valores de A y B utilizando una variable auxiliar.
Muestre los valores intercambiados en pantalla.

*/