#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include "Animal.h"

void CrearAnimal(Animal* a){}

void Borrar(Animal* a){
    a = NULL;
}

void MostrarAnimal(Animal* a){
    int fuerza, velocidad, resistencia;
    if (a->tipo_fuerza = 'e'){
        fuerza = (int*)a->fuerza;
    }
    if (a->tipo_fuerza = 'c'){
        char temp = (char*)a->fuerza;
        fuerza = (int)temp;
    }
    if (a->tipo_fuerza = 'f'){
        float temp = *(float*)a->fuerza;
        fuerza = (int) roundf(temp);
    }

    if (a->tipo_velocidad = 'e'){
        velocidad = (int*)a->velocidad;
    }
    if (a->tipo_velocidad = 'c'){
        char temp = (char*)a->velocidad;
        velocidad = (int)temp;
    }
    if (a->tipo_velocidad = 'f'){
        float temp = *(float*)a->velocidad;
        velocidad = (int) roundf(temp);
    }

    if (a->tipo_resistencia = 'e'){
        resistencia = (int*)a->resistencia;
    }
    if (a->tipo_resistencia = 'c'){
        char temp = (char*)a->resistencia;
        resistencia = (int)temp;
    }
    if (a->tipo_resistencia = 'f'){
        float temp = *(float*)a->resistencia;
        resistencia = (int) roundf(temp);
    }

    printf("fuerza: %d", fuerza);
    printf("velocidad: %d", velocidad);
    printf("resistencia: %d", resistencia);
}

void Reproducir(Animal* a1, Animal* a2, Animal* hijo){}

void ComerOHuir(Animal* a1, Animal* a2){}

int Comparar(Animal* a1, Animal* a2){
    int an1, an2;
    int fuerza1, fuerza2;
    if (a1->tipo_fuerza = 'e'){
        fuerza1 = (int*)a1->fuerza;
    }
    if (a1->tipo_fuerza = 'c'){
        char temp = (char*)a1->fuerza;
        fuerza1 = (int) temp;
    }
    if (a1->tipo_fuerza = 'f'){
        float temp = *(float*)a1->fuerza;
        fuerza1 = (int) roundf(temp);
    }
    if (a2->tipo_fuerza = 'e'){
        fuerza2 = (int*)a2->fuerza;
    }
    if (a2->tipo_fuerza = 'c'){
        char temp = (char*)a2->fuerza;
        fuerza2 = (int) temp;
    }
    if (a2->tipo_fuerza = 'f'){
        float temp = *(float*)a2->fuerza;
        fuerza2 = (int) round(temp);
    }

    int velocidad1, velocidad2;
    if (a1->tipo_velocidad = 'e'){
        velocidad1 = (int*)a1->velocidad;
    }
    if (a1->tipo_velocidad = 'c'){
        char temp = (char*)a1->velocidad;
        velocidad1 = (int) temp;
    }
    if (a1->tipo_velocidad = 'f'){
        float temp = *(float*)a1->velocidad;
        velocidad1 = (int) roundf(temp);
    }
    if (a2->tipo_velocidad = 'e'){
        velocidad2 = (int*)a2->velocidad;
    }
    if (a2->tipo_velocidad = 'c'){
        char temp = (char*)a2->velocidad;
        velocidad2 = (int) temp;
    }
    if (a2->tipo_velocidad = 'f'){
        float temp = *(float*)a2->velocidad;
        velocidad2 = (int) round(temp);
    }

    int resistencia1, resistencia2;
    if (a1->tipo_resistencia = 'e'){
        resistencia1 = (int*)a1->resistencia;
    }
    if (a1->tipo_resistencia = 'c'){
        char temp = (char*)a1->resistencia;
        resistencia1 = (int) temp;
    }
    if (a1->tipo_resistencia = 'f'){
        float temp = *(float*)a1->resistencia;
        resistencia1 = (int) roundf(temp);
    }
    if (a2->tipo_resistencia = 'e'){
        resistencia2 = (int*)a2->resistencia;
    }
    if (a2->tipo_resistencia = 'c'){
        char temp = (char*)a2->resistencia;
        resistencia2 = (int) temp;
    }
    if (a2->tipo_resistencia = 'f'){
        float temp = *(float*)a2->resistencia;
        resistencia2 = (int) round(temp);
    }
    

    if (fuerza1 > fuerza2){
        an1 +=1;
    }else{
        an2 +=1;
    }
    if (velocidad1 > velocidad2){
        an1 +=1;
    }else{
        an2 +=1;
    }
    if (resistencia1 > resistencia2){
        an1 +=1;
    }else{
        an2 +=1;
    }
    if (an1 > an2){
        return 1;
    }else{
        return 0;
    }
}

void BorrarMundo(Animal** Mundo){
    int i;
    for (i = 0; i < 1000; i++){
        free(Mundo[i]);
    }
    free(Mundo);
    exit(1);
}

void MostrarMundo(Animal** Mundo){
    printf("0 significa vacío, X significa animal");
    int i, j;
    for (i = 0; i < 1000; i++){
        for (j = 0; i < 1000; i++){
            if (Mundo[i] == NULL){
                printf("0 ");
            }
            else{
                printf("X ");
            }
        }
        printf("\n");
    }
}

void ReproduccionSimple(Animal* a1, Animal* a2, Animal* hijo){}

void ReproduccionCruzada(Animal* a1, Animal* a2, Animal* hijo){}

void ComerSiempre(Animal* a1, Animal* a2){}

void HuirSiempre(Animal* a1, Animal* a2){}

void ComerAleatorio(Animal* a1, Animal* a2){}