#include<stdio.h>
#include<stdlib.h>
#include<time.h>



//estructuras
typedef struct{
    int id, puntaje;
    char nombre[50];
    float prom;
}Player;

//prototypes:
void mostrarMenu();




void definirJugador(int lastid, Player jugadores){
    system("clear");
    
    printf("Ingrese el nombre del jugador nro %d", lastid);
    //scanf("%s", jugadores[0].nombre);


}



int main () {
    //Generar nro aleatorio:
    int min = 1, max = 6;
    srand(time(NULL));
    int aleatorio = (rand() % (max - min +1)) + min;
    int opt, salir=0, lastid=0, cantJugadores=0;
    
 
    mostrarMenu();
    do
        switch (opt){
            case 6:
                salir = 1;
            break;
            case 1: //Ingresar Jugadores (Nombre)
                if (cantJugadores==0) {
                    printf("Cuantas personas van a jugar?");
                    scanf("%d", &cantJugadores);
                    Player jugadores[cantJugadores];
                }
                if (cantJugadores >= lastid){
                    lastid++; 
                    definirJugador(lastid, jugadores);
                }
            break;
            case 2: //Ingrese nro de jugador que tira
            case 3: //Puntaje de todos los jugadores
            case 4: //Ganador! (Nombre y puntos)
            case 5: //Jugadores por encima del promedio.

            default:
                printf("Error en la opcion ingresada. Reintente.");
            break;
    } while (!salir);


    printf("%i", aleatorio);
    return 0;

}



void mostrarMenu(){
    system("clear");
    printf("Bienvenido a DadiTop!!\n");

    printf("1 -> Ingresar Jugadores (Nombre)\n");
    printf("2 -> Ingrese nro de jugador que tira.\n");
    printf("3 -> Puntaje de todos los jugadores\n");
    printf("4 -> Ganador! (Nombre y puntos)\n");
    printf("5 -> Jugadores por encima del promedio.\n");
    printf("6 -> Salir\n");
}