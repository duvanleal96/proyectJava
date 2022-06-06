package com.sofka.Exercise18;

public interface Deliverable {
    /**
     *cambia el atributo prestado a true.
     */
    void deliver();

    /**
     * cambia el atributo prestado a false.
     *
     */
    void returnn();

    /**
     * devuelve el estado del atributo prestado.
     *
     */
    boolean isDeliver();

    /**
     * compara las horas estimadas en los videojuegos y en las series el numero de temporadas.
     * Como parámetro que tenga un objeto
     */
    int compareTo(Object a);
}
