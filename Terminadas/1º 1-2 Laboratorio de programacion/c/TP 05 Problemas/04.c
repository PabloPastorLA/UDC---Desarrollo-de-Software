#include<stdio.h>

int main () {
/*  4) Se quiere realizar un programa cuya entrada sean las notas del 1er parciales de los alumnos de Laboratorio de Programación.
    Se necesita que si la  nota leída es menor a 60, entonces imprimir "Reprobado va a Recuperatorio" Si la  nota leída es igual o mayor que 60, evaluar si no es mayor o igual a 70.
    En caso de ser menor que 70 imprimir "APROBADO". De lo contrario imprimir PROMOCIONADO. Informar cantidad de alumnos reprobados, aprobados y promocionados.
    El ingreso finaliza con la nota 0 Tener en cuenta la siguiente tabla:
    <   60 reprobado
    >=  60 aprobado
    >=  70 promocionado */

    const int limnotasup=70;
    const int limnotainf=60;
    
    //         char text[100];

    // printf("Enter text with spaces: ");
    // scanf("%[^\n]s", text);

    // printf("You entered: %s\n", text);


    int notaingresada, tamanio=0, cantapr=0, cantrepr=0, cantprom=0 ;
    int notas[99];
    char nombres[99][30]={};
//    char nombres[99];
    char *estado;


    printf("Procederemos a cargar las notas y nombres de los estudiantes.\n");
    for (int i=0; i<99; i++) {
        printf("Ingrese nota (0 - 100)(para salir ingrese \"0\")\n");
        scanf("%d", &notaingresada);
        while (notaingresada < 0 || notaingresada > 100) {
            printf("Error. La nota debe estar comprendida entre 0 y 100(para salir ingrese \"0\").\nReingrese\n");
            scanf("%d", &notaingresada);
        }
        if (notaingresada == 0) {break;}
        notas[i] = notaingresada;
        printf("Ahora ingrese el nombre del alumno.\n");
        scanf("%s", nombres[i]);

        tamanio++;
    }

    printf("\n------------------------------\n");
    printf("Nota  -  Estado        -  Nombre\n");
    for (int i=0;i<tamanio; i++) {
        if (notas[i] < limnotainf) {estado = "Reprobado";cantrepr++;}
        else if (notas[i] >= limnotainf && notas[i] < limnotasup ) {estado = "Aprobado";cantapr++;}
        else {estado = "Promocionado";cantprom++;}

        //print con 100
        if (notas[i] == 100) {printf(" %d  -  %s  -  %s\n", notas[i], estado, nombres[i]);}
        //print entre 70 y menor a 100
        else if (notas[i] < 100 && notas[i] >= limnotasup) {printf("  %d  -  %s  -  %s\n", notas[i], estado, nombres[i]);}
        //print entre 40 y menor a 70
        else if (notas[i] < limnotasup && notas[i] >= limnotainf) {printf("  %d  -  %s      -  %s\n", notas[i], estado, nombres[i]);}
        //print entre 0 y menor a 10
        else if (notas[i] < 10){printf("   %d  -  %s     -  %s\n", notas[i], estado, nombres[i]);}
        //print entre 10 y menor a 70
        else {printf("  %d  -  %s     -  %s\n", notas[i], estado, nombres[i]);}
    }

    printf("------------------------------\nTOTALES:\nCantidad de PROMOCIONADOS: %d\nCantidad de APROBADO: %d\nCantidad de REPROBADOS: %d\n", cantprom, cantapr, cantrepr);
    printf("------------------------------\n");
}
//OK