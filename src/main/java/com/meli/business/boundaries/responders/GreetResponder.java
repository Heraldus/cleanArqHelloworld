package com.meli.business.boundaries.responders;
/*
Define el output boundary que deben implementar  todos aquellos
clases externas que quieran hacer uso del caso de uso.
en general a travez
* */

public interface GreetResponder {

    void present(GreetResponse response);
}
