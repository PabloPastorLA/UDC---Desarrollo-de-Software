#include<stdio.h>
#include<stdlib.h>

const int storPsw = 1234;
int main () {
    int psw;
    //system("clear && echo");
    
    printf("Ingrese su contraseña:\n");
    scanf("%i", &psw);
    
    
    if (storPsw == psw) {printf("Bienvenido!\n");}
    else {printf("CONTRASEÑA INCORRECTA.\n");}

}
