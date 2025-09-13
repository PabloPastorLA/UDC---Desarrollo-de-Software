// Online C compiler to run C program online
#include <stdio.h>
#include <string.h>

    typedef struct{
        char nombre[20];
        char apellido[20];
        int edad;
        int sexo;
        float nota;
    }Alumno;
    
    int main() {
       int cantAlum;
       int i;
       int cantMujer=0; 
       int cantMasc=0;
       int apro=0; int desa=0;int totaledad=0;
       double promedio;
       
     printf("Ingrese la cant de alumnos:\n");
     scanf ("%d", &cantAlum);
     Alumno alumnos[cantAlum];
     for(int i=0; i<cantAlum; i++){
         printf("Ingrese nombre del alumno:\n ");
         scanf("%s", alumnos[i].nombre);
         printf("Ingrese el apellido:\n");
         scanf("%s", alumnos[i].apellido);
         printf("Ingrese edad del alumno:\n");
         scanf("%d", &alumnos[i].edad);
         totaledad+= alumnos[i].edad;
     
         do{
         
            printf("Ingrese 1 para Masculino o 2 para femenino:\n");
             scanf("%d", alumnos[i].sexo);

             if(alumnos[i].sexo<1||alumnos[i].sexo>2){
             printf("Sexo fuero de rango,intente nuevamente.\n");
             }
     }while (alumnos[i].sexo<1||alumnos[i].sexo>2);
     
     if(alumnos[i].sexo==2){
         cantMujer++;
    if(alumnos[i].sexo==1){
        cantMasc++;
    }
    }
     }
     do{
         printf("Ingrese la nota del alumno:\n");
         scanf("%f", &alumnos[i].nota);
         if(alumnos[i].nota<1||alumnos[i].nota>10);
         printf("Nota fuera de rango.");
         
         if(alumnos[i].nota>=6){
    
         apro++;
         } else {
             desa++;
         }
         }
         
    
    return 0;
}
