tamL([_], 1):- !.
tamL([_|L], T):- tamL(L, X), T is X + 1.

encontrarElem(0, [H|_], H):- !.
encontrarElem(I, [_|T], E):- X is I - 1, encontrarElem(X, T, E).

par(N):- N mod 2 =:= 0.
impar(N):- N mod 2 =:= 1.

suma([],0).
suma([H|T],S):- suma(T,G),S is H+G.


promedio(L,M):- suma(L, S), tamL(L,T), M is S / T.

mediana(L, M):- tamL(L, T), par(T), X is (T / 2) - 1, encontrarElem(X, L, E1), X2 is X + 1, encontrarElem(X2, L, E2), M is (E1 + E2) / 2,!.
mediana(L, M):- tamL(L, T), impar(T), X is (T - 1) / 2, encontrarElem(X, L, M),!.



bondad([_], false) :- !.
bondad([_|L], V):- mediana(L, M), promedio(L,P), (P>M -> V is "true"; V is "false").

