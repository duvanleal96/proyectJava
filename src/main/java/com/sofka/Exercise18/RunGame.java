package com.sofka.Exercise18;


import java.util.logging.Logger;

/**
 * clase main , implementa el inicio del aplicativo , se creas dos arrays de 5 posiciones cada una
 *
 */
public class RunGame {
    public static void main(String[] args) {
        Logger log = Logger.getLogger("log");
        Serie[] s = new Serie[5];
        Videogame[] v = new Videogame[5];
        s [0] = new Serie("avengers",4,"accion","duvan spilberg");
        s [1] = new Serie("bambi",5,"infantil","disney junior");
        s [2] = new Serie("baki",7,"accion","chin-cho-ku");
        s [3] = new Serie("anabelle",5,"terror","warrend");
        s [4] = new Serie("yo robot",6,"accion","wilt smit");

        v [0] = new Videogame("halo",24,"accion","Bungie");
        v [1] = new Videogame("valorant",65,"shooter","riot games");
        v [2] = new Videogame("clash royale",19,"accion","supercell");
        v [3] = new Videogame("war robots",14,"accion","pixonic");
        v [4] = new Videogame("warcraf",50,"aventura","wilt smit");
        /**
         * cambia el estado dee entregado se las series y juegos y los devuelve
         */
        s[0].deliver();
        s[3].deliver();

        v[1].deliver();
        v[3].deliver();

        int contS=0;
        int contV=0;
        Serie max = new Serie();
        int mayor=0;
        int mayorV=0;
        Videogame maxV= new Videogame();

        /**
         * bucle for, busca cuantas series han sido entregadas y muestra cual serie ha tenido la mayor temporada
         * retornando su informacion
         */
        for (int i = 0; i <s.length ; i++) {
            if (s[i].isDeliver()){
                contS++;
                s[i].returnn();
            }
            if(mayor<s[i].getNumberTemporate()){
                mayor=s[i].getNumberTemporate();
                max=s[i];
            }
            if(i<s.length-1) {
                s[i].compareTo(s[i + 1]);
            }
        }
        max.toString();
        /**
         * bucle for, busca cuatos juegos han sido entregadas y muestra cual juego ha tenido el mayor numero de horas,
         * retornando su informacion
         */

        for (int i = 0; i <v.length ; i++) {
            if (v[i].isDeliver()){
                contV++;
                v[i].returnn();
            }
            if(mayorV<v[i].getEstimatedHour()){
                mayorV=v[i].getEstimatedHour();
                maxV=v[i];
            }
            if (i < v.length-1) {
                v[i].compareTo(v[i+1]);
            }

        }
        maxV.toString();

        log.info(""+max);
        log.info(""+maxV);

        }


    }



