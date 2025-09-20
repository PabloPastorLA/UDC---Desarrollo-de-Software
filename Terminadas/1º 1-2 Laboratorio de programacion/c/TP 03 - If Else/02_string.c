#include<stdio.h>
#include<stdlib.h>
#include <string.h>

const int largoMaxArray= 9;
const char storPsw[largoMaxArray] = "1234" ;
int main () {
    char psw[largoMaxArray] = "";
    system("clear && echo");
    
    printf("Ingrese su contraseña:\n");
    scanf("%s", &psw);

    int comparar = strcmp(storPsw, psw);   
    
    if (comparar == 0) {printf("Bienvenido!\n");}
    else {printf("CONTRASEÑA INCORRECTA.\n");}



}
