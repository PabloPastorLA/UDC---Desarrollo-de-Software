#include<stdio.h>
#include<stdlib.h>

int main () {
//Del apunte “Introducción a Loops” realice el Ejercicio 2 de la página 9
/*El primer programa que se ejecutó en una computadora como programa
almacenado (el EDSAC). Fue escrito y ejecutado por David Wheeler en el
laboratorio de computación de la Universidad de Cambridge, Inglaterra, el 6
de mayo de 1948, para calcular e imprimir una lista simple de exponentes
como la imágen.
Puede realizar un loop que logre dicho output?*/
    system("clear && echo");
    int hasta = 9;
    int desde = 0;
    do
    {
        printf("%i %i\n",desde, desde * desde);
        desde++;
    } while (desde<hasta + 1);
    
}