package com.meli.business.boundaries;

/*Interface UseCase es el Input Boundary
que implementan todos los UseCases
y que deberian Hace USO todos los controllers
*/

import com.meli.business.boundaries.requestors.GreetRequest;

public interface UseCase {
    void execute(GreetRequest request);
}
