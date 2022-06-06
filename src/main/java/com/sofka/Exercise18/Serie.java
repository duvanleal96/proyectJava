package com.sofka.Exercise18;

/**
 * Clase serie implementa de la interface deliveable
 */
public class Serie implements Deliverable{
    private String title;
    private int numberTemporate;
    private boolean delivered;
    private String gender;
    private String creator;

    /**
     * Constructores inicializan las variables
     */
    public Serie(){
        this.title = "";
        this.numberTemporate = 3;
        this.delivered = false;
        this.gender = "";
        this.creator = "";
    }

    public Serie(String title, int numberTemporate,  String gender, String creator) {
        this.title = title;
        this.numberTemporate = numberTemporate;
        this.gender = gender;
        this.creator = creator;
        this.delivered = false;
    }
    public Serie(String title, String creator){
        this.creator=creator;
        this.title = title;
    }

    /**
     * metodos get y set
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberTemporate() {
        return numberTemporate;
    }

    public void setNumberTemporate(int numberTemporate) {
        this.numberTemporate = numberTemporate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * imprime en pantalla la informacion se la serie
     */
    @Override
    public String toString() {
        return "Serie{" +
                "title='" + title + '\'' +
                ", numberTemporate=" + numberTemporate +
                ", delivered=" + delivered +
                ", gender='" + gender + '\'' +
                ", creator='" + creator + '\'' +
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
     * Metodo compare to compara las horas estimadas  en las series el numero de temporadas.
     * Como parámetro que tenga un objeto
     * @return max
     */
    public  int compareTo(Object a) {
        Serie s = (Serie)a;
       if(this.numberTemporate<s.numberTemporate){
           return -1;
       }else if(this.numberTemporate>s.numberTemporate){
           return 1;
       }else
           return 0;
    }
}
