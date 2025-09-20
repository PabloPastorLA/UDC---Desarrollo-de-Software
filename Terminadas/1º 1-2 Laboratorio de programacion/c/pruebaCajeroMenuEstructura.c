#include<stdio.h>

typedef struct{
    int id;
    char *usr;
    int pin;
    char nombre;
    char apellido;
    float disponible;
    float mov1;
    float mov2;
    float mov3;
    char email;
    char calle;
    int altura;
}Usuario;

//void init();

int login();
int main () {
    //init();





    Usuario usr1;
    Usuario usr2;
    Usuario usr3;
    usr1.usr = "popito";//{'p','o','p','i','t','o'};
    usr1.pin = 1234;
    usr1.disponible = 1000000;
    usr2.usr = "bombo123";
    usr2.pin = 1033;
    usr2.disponible = 1000000;
    usr3.usr = "Paulito88";
    usr3.pin = 1234;
    usr3.disponible = 1000000;    

    int logid;

    logid=login(usr1, usr2, usr3);
    printf("id: %d", logid);



}


int login(Usuario us1, Usuario us2, Usuario us3){
    int c; //p limpiar el buffer
    int logged=0, errlog=0, lectpin;
    char lectusr;

    printf("Sr. usuario, a continuación ingrese sus credenciales:\n");
    while (!logged || errlog <= 3){
        if (errlog != 0) printf("Error, reingrese sus credenciales:\n");
        errlog++;
        printf("Usuario?:\n");
        scanf("%c\n", &lectusr);
        while ((c = getchar()) != '\n' && c != EOF); //limpiar buffer
        printf("Pin?:\n");
        scanf("%d", &lectpin);
//if (lectusr == us1.nombre) {printf("usrusrusr");}
//if (lectpin == us1.pin) {printf("pinpinpin");}
        printf("popito: %c", us1.nombre);
        if (lectusr == us1.nombre && lectpin == us1.pin) {return us1.id;}
        if (lectusr == us2.nombre && lectpin == us2.pin) {return us2.id;}
        if (lectusr == us3.nombre && lectpin == us3.pin) {return us3.id;}
    };

    printf("Error, sistema bloqueado. Espere.");
    printf("aca va delay...");//delay(5000);
    return login(us1, us2, us3);
}


/*void init(){
    Usuario usr1;
    Usuario usr2;
    Usuario usr3;
    usr1.usr = "popito";
    usr1.pin = 1234;
    usr1.disponible = 1000000;
    usr2.usr = "bombo123";
    usr2.pin = 1033;
    usr2.disponible = 1000000;
    usr3.usr = "Paulito88";
    usr3.pin = 1234;
    usr3.disponible = 1000000;    
};*/



void menu(){
    do{
        printf("1 -> Extraccion FT");
        printf("2 -> Cambio de clave");
        printf("3 -> Transferencia a CBU/Alias");
        printf("4 -> ");

    } while (1);
    
}
