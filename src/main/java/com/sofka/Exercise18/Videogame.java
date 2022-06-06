package com.sofka.Exercise18;

/**
 * clase video juego implementa metodos de la clase interface deliverable
 *
 */
public class Videogame implements Deliverable{
    private String title;
    private int estimatedHour;
    private boolean delivered;
    private String genero;
    private String company;

    public Videogame(){
        this.company="";
        this.delivered=false;
        this.estimatedHour=0;
        this.genero="";
        this.title="";
    }
    public Videogame(String title, int  estimatedHour){
        this.title=title;
        this.estimatedHour=estimatedHour;
    }
    public Videogame(String title, int estimatedHour, String genero, String company) {
        this.title = title;
        this.estimatedHour = estimatedHour;
        this.genero = genero;
        this.company = company;
        this.delivered = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEstimatedHour() {
        return estimatedHour;
    }

    public void setEstimatedHour(int estimatedHour) {
        this.estimatedHour = estimatedHour;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * imprime en pantalla la informacion del juego
     */
    @Override
    public String toString() {
        return "Videogame{" +
                "title='" + title + '\'' +
                ", estimatedHour=" + estimatedHour +
                ", delivered=" + delivered +
                ", genero='" + genero + '\'' +
                ", company='" + company + '\'' +
                '}';
    }


    public void deliver() {
        delivered=true;
    }


    public void returnn() {
       delivered=false;
    }


    public boolean isDeliver() {
        return delivered;
    }

    /**
     * Metodo compare to compara las horas estimadas en los videojuegos
     *Como parámetro que tenga un objeto
     * @return max
     */
    public int compareTo(Object a) {
        Videogame v = (Videogame) a;
        if(this.estimatedHour<v.estimatedHour){
            return -1;
        }else if(this.estimatedHour> v.estimatedHour){
            return 1;
        }else
            return 0;
    }

}
