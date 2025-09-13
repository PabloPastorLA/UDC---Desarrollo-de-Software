#include <stdio.h>
//#include <string.h>
//#include <ctype.h>

int main(){
    //Un psiquiatra tiene un paciente que habla invirtiendo las frases completas
    //(por ejemplo: si quiere decir “hola caracola”, lo que realmente dice es: “alocarac aloh”)
    //Para poder comunicarse con el paciente decide hacer un programa que traduzca lo que él
    //dice al lenguaje del paciente. Implementar dicho programa. Hacer dos versiones:
    char frase[200]={};
    int primerletra=0;
    printf("Ingrese la frase del paciente\n");
    fgets(frase, 200, stdin);
    
    printf("La frase es:\n");
    
    for (int i =199; i >= 0 ; i--){
        if (frase[i] != ' '  || primerletra == 1){
            printf("%c", frase[i]);
            primerletra=1;
        }
    }
    printf("\n\n");
    return 0;
}