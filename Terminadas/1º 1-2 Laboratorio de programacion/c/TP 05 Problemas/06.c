#include<stdio.h>
#include<stdlib.h>

int main () {
/*  6) REALIZAR UN PROGRAMA QUE DADO EL SUELDO BASICO DE UN EMPLEADO QUE ES DE $90.000. Calcule su sueldo neto con los siguientes parámetros
    Asignaciones / parametros de ingreso (preguntas al usuario):
    1) Por cada año de antiguedad suma 5 mil pesos
    2) Suma 10 mil pesos como asignacion por cada hijo
    3) Suma 50 mil pesos por título (1 solo título)
    4) Suma 15 mil pesos por dedicación funcional (1 sola dedicación)
    Y tiene los siguientes descuentos: 
    a) Por obra social se le descuenta el 5% del sueldo
    b) Para jubilación se le descuenta el 10 % del sueldo.
    ACLARACIÓN: Las asignaciones se deben consultar por teclado.*/   

    //A continuacion puede ajustar el aporte jubilatorio, el descuento por jubilación y el sueldo básico:
    const int os = 5;
    const int jub = 10;
    const int basico = 90000;


    int antiguedad, hijos, titulo, dedic;
    float bruto, neto, desc;

    do {
        printf("Ingrese la antiguedad laboral (Valores aceptados: Positivos).\n");
        scanf("%d", &antiguedad);
    } while (antiguedad < 0);
    do {
        printf("Ahora ingrese la cantidad de hijos que posee (Valores aceptados: Positivos).\n");
        scanf("%d", &hijos);
    } while (hijos < 0);
    do {
        printf("Posee titulo? (0 --> No, 1 --> Si).\n");
        scanf("%d", &titulo);
    } while (titulo != 0 && titulo != 1);
    do {
        printf("Corresponde Dedicacion Funcional? (0 --> No, 1 --> Si).\n");
        scanf("%d", &dedic);
    } while (dedic != 0 && dedic != 1);
    
    bruto = basico + 5000 * antiguedad + 10000 * hijos + 50000 * titulo + 15000 * dedic;
    desc = bruto * os / 100 + bruto * jub / 100;
    neto = bruto - desc;

    printf("Su sueldo neto es: $%.2f\n", neto);
    printf("el descuento fue de: $%.2f (sobre un bruto de: $%.2f)\n", desc, bruto);
}
//OK