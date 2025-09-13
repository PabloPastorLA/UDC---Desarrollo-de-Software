#include <stdio.h>

int main () {
    int librosVendidos = 100;
    double precioLibro = 900.99;
    double totalDeVentas ;


    totalDeVentas = librosVendidos * precioLibro;
    printf("Vendiste %d libros y ganaste un total de $%.2f\n", librosVendidos, totalDeVentas);


}