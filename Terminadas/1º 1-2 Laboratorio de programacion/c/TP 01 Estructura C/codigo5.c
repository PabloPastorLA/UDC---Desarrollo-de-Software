#include<stdio.h>

int main () {
    char categoriaLibro = 'A';
    char categoriaPelicula = 'B';
    double precioTicket = 150.50;
    double precioLibro = 1900.99;

    categoriaLibro = categoriaPelicula;
    precioTicket = precioLibro;

    printf("La categoria del libro es %c con un costo de $%.2f\n", categoriaLibro, precioLibro);
    printf("La categoria de la película es %c y tiene un costo de %.2f\n", categoriaPelicula, precioTicket);

    return 0;
    
}