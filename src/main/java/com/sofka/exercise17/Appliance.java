package com.sofka.exercise17;

public class Appliance {
    private double basePrice;
    private String color;
    private char energyConsumption;
    private int weight;

    /**
     * Metodos constructores inicializa las variables
     */
    public Appliance(){
        this.basePrice=100;
        this.color = "blanco";
        this.energyConsumption='F';
        this.weight = 5;

    }
    public Appliance(double basePrice,int weight){
        this.basePrice=basePrice;
        this.weight=weight;
        this.color="blanco";
        this.energyConsumption='F';
    }
    public Appliance(double basePrice,String color, char energyConsumption,int weight){
        this.basePrice=basePrice;
        this.weight=weight;
        this.color=color;
        this.energyConsumption=energyConsumption;
    }
    /**
     * metodos get , para obtener los datos
     */
    public double getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public int getWeight() {
        return weight;
    }

    /**
     * comprueba que la letra es correcta, sino es correcta usara la letra por defecto.
     * Se invocará al crear el objeto y no será visible.
     * @return energyConsumption
     */
    public char checkEnergyConsum(char energyConsumption){
        if(energyConsumption=='A' || energyConsumption == 'B' || energyConsumption=='C' || energyConsumption == 'D'||energyConsumption=='E' || energyConsumption == 'F'){
            return getEnergyConsumption();
        }
        char energyConsumption1 = getEnergyConsumption();
        return energyConsumption1;
    }

    /**
     * metodo verificar color comprueba que el color es correcto, sino lo es usa el color por defecto.
     * Se invocará al crear el objeto y no será visible.
     * @return getColor()
     */
    public String checkColor(String color){
        if(color.equals("blanco") || color.equals("negro")|| color.equals("rojo") || color.equals("gris") || color.equals("azul")){
            return color;
        }else return  getColor();
    }

    public double priceFinal(){
        int weight=getWeight();
        switch (getEnergyConsumption()){
            case 'A':
                basePrice+=100;
                break;
            case 'B':
                basePrice+=80;
                break;
            case 'C':
                basePrice+=60;
                break;
            case 'D':
                basePrice+=50;
                break;
            case 'E':
                basePrice+=30;
                break;
            case 'F':
                basePrice+=10;
                break;
            default:
                basePrice+=0;
                break;
        }
        if(weight>0 && weight <=19){
            basePrice+=10;
        } else if (weight>=20 && weight <=49) {
            basePrice+=50;
        } else if (weight>=50 && weight <=79) {
            basePrice+=80;
        } else if (weight>=80) {
            basePrice+=100;
        }
        return basePrice;
    }

}
