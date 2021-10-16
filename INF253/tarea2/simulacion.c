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
    mundo = (Animal**)malloc(n*sizeof(Animal*));
    for(i = 0; i < n; i++){
        mundo[i] = (Animal*)malloc(n*sizeof(Animal));
    }
    srand(12345);  //seed del rand()

    //menu
    while (programa == true){
        int input;
        printf("------Menú------\n");
        printf("1.- Crear animal\n");
        printf("2.- Avanzar una iteración en el tiempo\n");
        printf("3.- Mostrar el mundo\n");
        printf("4.- Terminar el programa\n");
        printf("----------------\n");
        input = scanf("Ingrese una opcion del menu: %d");
        if (input == 1){
            
        }
        if (input == 2){
            iteracion_temp(mundo);
        }
        if (input == 3){
            MostrarMundo(mundo);
        }
        if (input == 4){
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