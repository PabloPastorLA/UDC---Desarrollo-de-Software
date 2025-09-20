#include<stdio.h>
#include<stdlib.h>

//prototypes
void printmenu();

int menu () {
    int opcion;

    printmenu();
    scanf("%d", &opcion);

    return opcion;
}

                supCuad();
            break;
            case 2:
                supRect();
            break;
            case 3:
                supTriRect();
            break;
            case 4:
                supCirc();



int main (){
    int opcion, salir;
    opcion = menu();
    salir = 0;


    do
        switch (opcion) {
            case 1:
                supCuad();
            break;
            case 2:
                supRect();
            break;
            case 3:
                supTriRect();
            break;
            case 4:
                supCirc();
            break;


            case 99:
                salir = 1;
            break;
            default:

            break;

        }
    while (!salir);
}




void printmenu(){
    system ("clear");
    printf("-----------------------------------------------------\n");
    printf("Bienvenido a la calculadora de superficies/volumenes.\n");
    printf("-----------------------------------------------------\n");
    printf("");

    //    ("-----------------------------------------------------\n");
    printf(" 1 <-- Superficie de cuadrado.\n");
    printf(" 2 <-- Superficie de rectangulo.\n");
    printf(" 3 <-- Superficie de triangulo rectangulo.\n");
    printf(" 4 <-- Superficie de círculo.\n");
    printf("");
    printf("99 <-- Salir.\n");

    printf("");
    printf("-----------------------------------------------------\n");

};
