/*tamanoLista es una 'funcion' que retorna el tamaño de una lista
por ejemplo: tamanoLista([1,3,7,8,9,4],X). -> X = 6
*/
tamanoLista([],0).
tamanoLista([_], 1):- !.
tamanoLista([_|L], T):- tamanoLista(L, X), T is X + 1.

/*encontrarElem es una 'funcion' que retorna elementos
de una lista según su indice
*/
encontrarElem(0, [H|_], H):- !.
encontrarElem(I, [_|T], E):- X is I - 1, encontrarElem(X, T, E).

/* par e impar retornan true o false dependiendo si
el numero es par o impar respectivamente
*/
par(N):- N mod 2 =:= 0.
impar(N):- N mod 2 =:= 1.

/* suma() suma todos los elementos de una lista
*/
suma([],0).
suma([H|T],S):- suma(T,G),S is H+G.


/*promedio saca el promedio de los elementos de una lista
*/
promedio(L,M):- suma(L, S), tamanoLista(L,T), M is S / T.

/*mediana retorna la mediana de una lista
*/
mediana(L, M):- tamanoLista(L, T), par(T), X is (T / 2) - 1, encontrarElem(X, L, E1), X2 is X + 1, encontrarElem(X2, L, E2), M is (E1 + E2) / 2,!.
mediana(L, M):- tamanoLista(L, T), impar(T), X is (T - 1) / 2, encontrarElem(X, L, M),!.

/*proceso saca la mediana y el promedio y los compara y le da valores a Q dependiendo del resultado
de la comparacion
*/
proceso(L,Q):- mediana(L,M), promedio(L,P), (P>M -> Q is 1; Q is -1).

/* bondad calcula si una lista es bondadosa si el promedio es mayor que la mediana de la lista
*/
bondad(H,V,Vnew):- member(X,H), proceso(X,Q), (Q>0 -> append([true], V, Vnew); append([false], V, Vnew)), fail ; true.  %como asignar Vnew a V para iteracion??


