ancestro(p2, p1).
ancestro(p3, p1).
ancestro(p4, p1).
ancestro(p5, p1).
ancestro(p2, p10).
ancestro(p3, p10).
ancestro(p4, p10).
ancestro(p6, p10).
ancestro(p7, p10).
ancestro(p5, p2).
ancestro(p6, p2).
ancestro(p5, p3).
ancestro(p9, p3).
ancestro(p6, p4).
ancestro(p8, p5).
ancestro(p7, p6).
ancestro(p9, p6).
ancestro(p8, p7).
ancestro(p1, p9).

/*descendiente retorna true si X es descendiente de Y y false si no.
*/
descendiente(X,Y):- ancestro(X,Y).

/*ancestrocidad retorna la distancia entre 2 nodos basado en la relacion de ancestro.
*/
ancestrocidad(A,Z,X):- (ancestro(_,Z) ->  (descendiente(A,Z), X is 1; descendiente(A,B), ancestrocidad(B,Z,T), X is T + 1); X is -1).


%ancestrocidad(A,Z,-1):- ancestro(_,Z) =:= false.
%ancestrocidad2(A,Z):- descendiente(A,Z); descendiente(A,B), ancestrocidad2(B,Z).
