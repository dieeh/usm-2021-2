#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include "Animal.h"


void CrearAnimal(Animal* a){
    char tipoF;
    scanf("Tipo de fuerza: %c", &tipoF);
    a->tipo_fuerza = tipoF;
    if (tipoF == 'e'){
        int valorF;
        scanf("Valor de fuerza: %d", &valorF);
        a->fuerza = (int*)malloc(sizeof(int));
        a->fuerza = valorF;
    }
    if (tipoF == 'c'){
        char valorF;
        scanf("Valor de fuerza: %c", &valorF);
        a->fuerza = (char*)malloc(sizeof(char));
        a->fuerza = valorF;
    }
    if (tipoF == 'f'){
        float valorF;
        scanf("Valor de fuerza: %f", &valorF);
        a->fuerza = (float*)malloc(sizeof(float));
        a->fuerza = &valorF;
    }
    
    char tipoV;
    scanf("Tipo de velocidad: %c", &tipoV);
    a->tipo_velocidad = tipoV;
    if (tipoV == 'e'){
        int valorV;
        scanf("Valor de velocidad: %d", &valorV);
        a->velocidad = (int*)malloc(sizeof(int));
        a->velocidad = valorV;
    }
    if (tipoV == 'c'){
        char valorV;
        scanf("Valor de velocidad: %c", &valorV);
        a->velocidad = (char*)malloc(sizeof(char));
        a->velocidad = valorV;
    }
    if (tipoV == 'f'){
        float valorV;
        scanf("Valor de velocidad: %f", &valorV);
        a->velocidad = (float*)malloc(sizeof(float));
        a->velocidad = &valorV;
    }

    char tipoR;
    scanf("Tipo de resistencia: %c", &tipoR);
    a->tipo_resistencia = tipoR;
    if (tipoR == 'e'){
        int valorR;
        scanf("Valor de resistencia: %d", &valorR);
        a->resistencia = (int*)malloc(sizeof(int));
        a->resistencia = valorR;
    }
    if (tipoV == 'c'){
        char valorR;
        scanf("Valor de resistencia: %c", &valorR);
        a->resistencia = (char*)malloc(sizeof(char));
        a->resistencia = valorR;
    }
    if (tipoV == 'f'){
        float valorR;
        scanf("Valor de resistencia: %f", &valorR);
        a->resistencia = (float*)malloc(sizeof(float));
        a->resistencia = &valorR;
    }
    int func1, func2;
    scanf("Funcion reproducción: %d", &func1);
    scanf("Funcion comerHuir: %d", &func2);

    if (func1 == 1){
        a->reproduccion = ReproduccionSimple;
    }
    if (func1 == 2){
        a->reproduccion = ReproduccionCruzada;
    }
    if (func2 == 1){
        a->comerHuir = ComerSiempre;
    }
    if (func2 == 2){
        a->comerHuir = HuirSiempre;
    }
    if (func2 == 3){
        a->comerHuir = ComerAleatorio;
    }
}

void Borrar(Animal* a){
    free(a->fuerza);
    free(a->velocidad);
    free(a->resistencia);
    //free(a);
}

void MostrarAnimal(Animal* a){
    int fuerza, velocidad, resistencia;
    if (a->tipo_fuerza = 'e'){
        fuerza = *(int*)a->fuerza;
    }
    if (a->tipo_fuerza = 'c'){
        char temp = *(char*)a->fuerza;
        fuerza = (int)temp;
    }
    if (a->tipo_fuerza = 'f'){
        float temp = *(float*)a->fuerza;
        fuerza = (int) round(temp);
    }

    if (a->tipo_velocidad = 'e'){
        velocidad = *(int*)a->velocidad;
    }
    if (a->tipo_velocidad = 'c'){
        char temp = *(char*)a->velocidad;
        velocidad = (int)temp;
    }
    if (a->tipo_velocidad = 'f'){
        float temp = *(float*)a->velocidad;
        velocidad = (int) round(temp);
    }

    if (a->tipo_resistencia = 'e'){
        resistencia = *(int*)a->resistencia;
    }
    if (a->tipo_resistencia = 'c'){
        char temp = *(char*)a->resistencia;
        resistencia = (int)temp;
    }
    if (a->tipo_resistencia = 'f'){
        float temp = *(float*)a->resistencia;
        resistencia = (int) round(temp);
    }

    printf("fuerza: %d", fuerza);
    printf("velocidad: %d", velocidad);
    printf("resistencia: %d", resistencia);
}

void Reproducir(Animal* a1, Animal* a2, Animal* hijo){
    int r = rand();
    if (r%2 == 0){
        printf("Usando funcion reproducir de a1");
        a1->reproduccion(a1, a2, hijo);
    }else{
        printf("Usando funcion reproducir de a2");
        a2->reproduccion(a2, a1, hijo);
    }
}

void ComerOHuir(Animal* a1, Animal* a2){
    int r = rand();
    if (r%2 == 0){
        printf("Usando funcion ComerOHuir de a1");
        a1->comerHuir(a1, a2);
    }else{
        printf("Usando funcion ComerOHuir de a2");
        a2->comerHuir(a2, a1);
    }
}

int Comparar(Animal* a1, Animal* a2){
    int an1, an2;
    int fuerza1, fuerza2;
    if (a1->tipo_fuerza = 'e'){
        fuerza1 = *(int*)a1->fuerza;
    }
    if (a1->tipo_fuerza = 'c'){
        char temp = *(char*)a1->fuerza;
        fuerza1 = ((int) temp)/4;
    }
    if (a1->tipo_fuerza = 'f'){
        float temp = *(float*)a1->fuerza;
        fuerza1 = (int) round(temp);
    }
    if (a2->tipo_fuerza = 'e'){
        fuerza2 = *(int*)a2->fuerza;
    }
    if (a2->tipo_fuerza = 'c'){
        char temp = *(char*)a2->fuerza;
        fuerza2 = ((int) temp)/4;
    }
    if (a2->tipo_fuerza = 'f'){
        float temp = *(float*)a2->fuerza;
        fuerza2 = (int) round(temp);
    }

    int velocidad1, velocidad2;
    if (a1->tipo_velocidad = 'e'){
        velocidad1 = *(int*)a1->velocidad;
    }
    if (a1->tipo_velocidad = 'c'){
        char temp = *(char*)a1->velocidad;
        velocidad1 = ((int) temp)/4;
    }
    if (a1->tipo_velocidad = 'f'){
        float temp = *(float*)a1->velocidad;
        velocidad1 = (int) round(temp);
    }
    if (a2->tipo_velocidad = 'e'){
        velocidad2 = *(int*)a2->velocidad;
    }
    if (a2->tipo_velocidad = 'c'){
        char temp = *(char*)a2->velocidad;
        velocidad2 = ((int) temp)/4;
    }
    if (a2->tipo_velocidad = 'f'){
        float temp = *(float*)a2->velocidad;
        velocidad2 = (int) round(temp);
    }

    int resistencia1, resistencia2;
    if (a1->tipo_resistencia = 'e'){
        resistencia1 = *(int*)a1->resistencia;
    }
    if (a1->tipo_resistencia = 'c'){
        char temp = *(char*)a1->resistencia;
        resistencia1 = ((int) temp)/4;
    }
    if (a1->tipo_resistencia = 'f'){
        float temp = *(float*)a1->resistencia;
        resistencia1 = (int) round(temp);
    }
    if (a2->tipo_resistencia = 'e'){
        resistencia2 = *(int*)a2->resistencia;
    }
    if (a2->tipo_resistencia = 'c'){
        char temp = *(char*)a2->resistencia;
        resistencia2 = ((int) temp)/4;
    }
    if (a2->tipo_resistencia = 'f'){
        float temp = *(float*)a2->resistencia;
        resistencia2 = (int) round(temp);
    }
    
    if (fuerza1 > fuerza2){
        an1 +=1;
    }
    if (fuerza1 < fuerza2){
        an2 +=1;
    }
    if (fuerza1 == fuerza2){
        an1 +=1;
        an2 +=1;
    }
    
    if (velocidad1 > velocidad2){
        an1 +=1;
    }
    if (velocidad1 < velocidad2){
        an2 +=1;
    }
    if (velocidad1 == velocidad2){
        an1 +=1;
        an2 +=1;
    }

    if (resistencia1 > resistencia2){
        an1 +=1;
    }
    if (resistencia1 < resistencia2){
        an2 +=1;
    }
    if (resistencia1 == resistencia2){
        an1 +=1;
        an2 +=1;
    }

    if (an1 > an2){
        return 1;
    }else{
        return 0;
    }
}

void BorrarMundo(Animal** Mundo){
    int i, j;
    for (i = 0; i < 1000; i++){
        for (j = 0; j < 1000; j++){
            free(Mundo[i][j].fuerza);
            free(Mundo[i][j].velocidad);
            free(Mundo[i][j].resistencia);
        }
        free(Mundo[i]);
    }
    free(Mundo);
}

void MostrarMundo(Animal** Mundo){
    printf("0 significa vacío, X significa animal");
    int i, j;
    for (i = 0; i < 1000; i++){
        for (j = 0; j < 1000; j++){
            if (Mundo[i][j].fuerza == NULL){
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

void ComerSiempre(Animal* a1, Animal* a2){
    int f1, r2;
    if (a1->tipo_fuerza = 'e'){
        f1 = *(int*)a1->fuerza;
    }
    if (a1->tipo_fuerza = 'c'){
        char temp = *(char*)a1->fuerza;
        f1 = (int) temp;
    }
    if (a1->tipo_fuerza = 'f'){
        float temp = *(float*)a1->fuerza;
        f1 = (int) round(temp);
    }
    if (a2->tipo_resistencia = 'e'){
        r2 = *(int*)a1->resistencia;
    }
    if (a2->tipo_resistencia = 'c'){
        char temp = *(char*)a1->resistencia;
        r2 = (int) temp;
    }
    if (a2->tipo_resistencia = 'f'){
        float temp = *(float*)a1->resistencia;
        r2 = (int) round(temp);
    }
    if (f1 > r2){
        Borrar(a1);
    }else{
        Borrar(a2);
    }
}

void HuirSiempre(Animal* a1, Animal* a2){}

void ComerAleatorio(Animal* a1, Animal* a2){}