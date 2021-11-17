


def modificar(identificador, lista):
    esta = False
    for item in lista:
        if item[0] == identificador:
            print("Nombre: "+item[1])
            print("Estado: "+item[2])
            print("Fecha de inicio: "+str(item[3]))
            print("Fecha de termino: "+str(item[4]))
            cambio = input("Indique el nuevo estado de la tarea: ")
            item[2] = cambio
            esta = True
    
    if esta == True:
        return
    else:
        return print("Tarea no encontrada, ingrese un ID válido.")

def consultar(estado, lista):
    pendiente = []
    for elemten in lista:
        if elemten[2] == estado:
            pendiente.append(elemten)

    for i in range(len(pendiente)-1):
        for j in range(0, len(pendiente) - i - 1):  #[7,2,35,8,12]
            if pendiente[j][3][0] > pendiente[j + 1][3][0]:
                pendiente[j], pendiente[j + 1] = pendiente[j+1], pendiente[j]

    for i in range(len(pendiente)-1):
        for j in range(0, len(pendiente) - i - 1):
            test = pendiente[j][3][0] == pendiente[j+1][3][0] 
            if pendiente[j][3][1] > pendiente[j + 1][3][1] and test == True :
                pendiente[j], pendiente[j + 1] = pendiente[j+1], pendiente[j]  

    
    for i in range(len(pendiente)-1):
        for j in range(0, len(pendiente) - i - 1):
            test = pendiente[j][3][1] == pendiente[j+1][3][1] 
            test2 = pendiente[j][3][0] == pendiente[j+1][3][0] 
            if pendiente[j][3][2] > pendiente[j + 1][3][2] and (test == True and test2 == True) :
                pendiente[j], pendiente[j + 1] = pendiente[j+1], pendiente[j] 
    
    print("Tareas que se encuentran en estado "+estado)
    print("---------------------------------------------")
    for elemento in pendiente:
        print("Tarea: "+str(elemento[0])+"  - "+elemento[1]+"  Inicio: "+str(elemento[3])+"  Fin: "+str(elemento[4]))
    print("---------------------------------------------")
    return



flag = True
tareas = []
id_tarea = 0
while flag:
    print("Menú de opciones")
    print("1.- Crear tarea")
    print("2.- Modificar tarea")
    print("3.- Consultar tarea")
    print("4.- Salir")
    p = int(input("Ingrese opción:"))
    if p == 1:
        id_tarea = id_tarea + 1
        n_tarea = input("Nombre de la tarea:")
        d_inicio = int(input("Día de inicio de la tarea:"))
        m_inicio = int(input("Mes de inicio de la tarea:"))
        a_inicio = int(input("Año de inicio de la tarea:"))
        temp1 = [a_inicio, m_inicio, d_inicio]
        d_termino = int(input("Dia de termino de la tarea:"))
        m_termino = int(input("Mes de termino de la tarea:"))
        a_termino = int(input("Año de termino de la tarea:"))
        temp2 = [a_termino, m_termino, d_termino]
        tareas.append([id_tarea, n_tarea, "Pendiente", temp1, temp2])
        print("Tarea creada correctamente.")
        print("El ID de esta tarea es: "+str(id_tarea))
    elif p == 2:
        ingreso = int(input("Ingrese el ID de la tarea a modificar: "))
        modificar(ingreso, tareas)
    elif p == 3:
        estadoss = input("Ingrese el estado a consultar:")
        consultar(estadoss, tareas)
    elif p == 4:
        flag = False

