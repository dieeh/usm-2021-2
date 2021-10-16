#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h> //bool no funcionaba (? creo que es por la version de C
#include "Animal.h"

void iteracion_temp(Animal** Mundo){

}

int main(){
    bool programa = true;
    int i, n = 1000;
    Animal** mundo;
    mundo = (Animal**)malloc(sizeof(Animal*) * n);
    for(i = 0; i < n; i++){
        mundo[i] = (Animal*)malloc(sizeof(Animal) * n);
    }
    srand(12345);  //seed del rand()

    //menu
    while (programa == true){
        char input;
        printf("------Menú------\n");
        printf("1.- Crear animal\n");
        printf("2.- Avanzar una iteración en el tiempo\n");
        printf("3.- Mostrar el mundo\n");
        printf("4.- Terminar el programa\n");
        printf("----------------\n");
        scanf("Ingrese una opcion del menu: %c", &input);
        if (input == '1'){
            int x, y;
            scanf("Ingrese coordenada x: %d", &x);
            printf("\n");
            scanf("Ingrese coordenada y: %d", &y);
            mundo[x][y].coord1 = x;
            mundo[x][y].coord2 = y;
            CrearAnimal(&(mundo[x][y]));
        }
        if (input == '2'){
            iteracion_temp(mundo);
        }
        if (input == '3'){
            MostrarMundo(mundo);
        }
        if (input == '4'){
            programa = false;
            BorrarMundo(mundo);
        }
    }
    



    //for (i = 0; i < n; i++){  //ya no necesario, se ejecuta
    //    free(mundo[i]);       //en BorrarMundo()
    //}
    //free(mundo);
    return 0;
}