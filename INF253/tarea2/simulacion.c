#include <stdio.h>
#include <stdlib.h>
//#include <stdbool.h> //bool no funcionaba (? creo que es por la version de C -> **cambiado por un int 0 y 1**
#include "Animal.h"

void iteracion_temp(Animal** Mundo){
    
}
int n = 10;  //cambiar dsps
Animal** mundo; //matriz global
int main(){
    int programa = 1;
    int i;
    mundo = (Animal**)malloc(sizeof(Animal*) * n);
    for(i = 0; i < n; i++){
        mundo[i] = (Animal*)malloc(sizeof(Animal) * n);
    }
    srand(12345);  //seed del rand()

    //menu
    while (programa == 1){
        int input;
        printf("\n");
        printf("------Menú------\n");
        printf("1.- Crear animal\n");
        printf("2.- Avanzar una iteración en el tiempo\n");
        printf("3.- Mostrar el mundo\n");
        printf("4.- Terminar el programa\n");
        printf("----------------\n");
        printf("\n");
        printf("Ingrese una opcion del menu: ");
        scanf(" %d", &input);
        if (input == 1){
            int x, y;
            printf("Ingrese coordenada x: ");
            scanf(" %d", &x);
            printf("Ingrese coordenada y: ");
            scanf(" %d", &y);
            mundo[x][y].coord1 = x;
            mundo[x][y].coord2 = y;
            CrearAnimal(&(mundo[x][y]));
            continue;
        }
        if (input == 2){
            iteracion_temp(mundo);
            continue;
        }
        if (input == 3){
            MostrarMundo(mundo);
            continue;
        }
        if (input == 4){
            programa = 0;
            BorrarMundo(mundo);
            break;
        }
    }
    
    //for (i = 0; i < n; i++){  //ya no necesario, se ejecuta
    //    free(mundo[i]);       //en BorrarMundo()
    //}
    //free(mundo);
    return 0;
}