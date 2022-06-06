package com.sofka.exercise17;

public class Tv extends Appliance{
    private int resolution=20;
    private boolean tunerTdt=false;
    private int basePrice;
    private String color;
    private char energyConsumption;
    private int weight ;



    public Tv(){
        super();

    }
    public  Tv(int basePrice,int weight){
        this.basePrice=basePrice;
        this.weight=weight;
    }
    public  Tv(int resolution,boolean tunerTdt,int basePrice,String color,char energyConsumption,int weight){
        super(basePrice,color,energyConsumption,weight);
        this.resolution=resolution;
        this.tunerTdt=tunerTdt;

    }

    public int getResolution() {
        return resolution;
    }

    public boolean isTunerTdt() {
        return tunerTdt;
    }
    public double priceFinal(){
        double precio = super.priceFinal();
        if(resolution>40){
            precio=precio*0.30;
        }
        if (tunerTdt){
            precio+=50;
        }
        return precio;
    }
}
