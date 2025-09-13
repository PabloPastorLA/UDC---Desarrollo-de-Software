#include<stdio.h>
#include<stdlib.h>
//prototipos
void menu();
void menuVenta();
void cierreCaja();
// estructras

typedef struct Helados{
    int cantbochas;
    int precioVaso;
};

int main() {

    

    menu();

    return 0;        
    
}

void menu () {
    int opc, nro, salir = 0;
    do{
        printf ("Bienvenido! a la heladeria bla bla bla\n");
        // scanf("%d", &nro);

        printf("1 -> Venta de helado\n");
        printf("2 -> Cierre de Caja\n");
        printf("3 -> zzz\n");
        
        printf("9 -> Salir\n");

        scanf("%d", &opc);

        switch (opc){
            case 1:
                system("clear");
                menuVenta();
                
            break;
            case 2:
                cierreCaja();
            break;
        
            case 9:
                salir= 1;
            break;
        
        default:
            printf("Opcion no válida. Reintente\n");
            break;
        }
    } while (!salir);
}

void menuVenta(){
    int opc, salir=0;
    
    printf("1 -> 1 Bocha en vasito\n");
    printf("2 -> 2 Bochas en vasito\n");
    printf("3 -> 3 Bochas en vasito\n");
    printf("4 -> 2 Bochas en Cucurucho\n");
    printf("5 -> 3 Bochas en Cucurucho\n");

    printf("9 -> Volver\n");
    scanf("%d", &opc);
        switch (opc){
            case 1:
//                system("clear");
                
            break;
            case 2:
  
            break;
        
            case 9:
                salir= 1;
            break;
        
            default:
                printf("Opcion no válida. Reintente\n");
            break;
        }
    
}

void cierreCaja(){}
