#include<stdio.h>

int main() {
    int valor; // declaramos la variable
    int *ptr = &valor;//Creamos una apuntador a la posición en memoria de la "variable"
    printf("%p\n\n",ptr);
    printf("%i\n\n",ptr);
    printf("%p\n\n",*ptr);
    printf("%i\n\n",*ptr);
    printf("%i\n\n",&valor);

    printf("%p\n\n",ptr);

}