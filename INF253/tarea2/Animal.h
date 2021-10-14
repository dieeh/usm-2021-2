

typedef struct Animal{
    void* fuerza;
    char tipo_fuerza;
    void* velocidad;
    char tipo_velocidad;
    void* resistencia;
    char tipo_resistencia;
    void (*reproduccion)(Animal*, Animal*, Animal*);
    void (*comerHuir)(Animal*, Animal*);
} Animal;


void CrearTransimperativer(Animal* a);
void Borrar(Animal* a);
void MostrarAnimal(Animal* a);
void Reproducir(Animal* padre, Animal* madre, Animal* hijo);
void Combatir(Animal* a1, Animal* a2);
int Comparar(Animal* a1, Animal* a2);
void BorrarMundo(Animal** Mundo);
void MostrarMundo(Animal** Mundo);
void ReproduccionSimple(Animal* padre, Animal* madre, Animal* hijo);
void ReproduccionCruzada(Animal* padre, Animal* madre, Animal* hijo);
void ComerSiempre(Animal* a1, Animal* a2);
void HuirSiempre(Animal* a1, Animal* a2);
void ComerAleatorio(Animal* a1, Animal* a2);

