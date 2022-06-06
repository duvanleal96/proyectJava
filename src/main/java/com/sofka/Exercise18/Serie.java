package com.sofka.Exercise18;

public class Serie {
    private String title;
    private int numberTemporate;
    private boolean delivered;
    private String gender;
    private String creator;

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
    }
    public Serie(String title, String creator){
        this.creator=creator;
        this.title = title;
    }

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

}
