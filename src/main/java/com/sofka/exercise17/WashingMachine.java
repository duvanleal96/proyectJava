package com.sofka.exercise17;

public class WashingMachine extends Appliance {
    private int burden= 5;
    private int basePrice=0;
    private int peso=0;

    public WashingMachine(){}

    public WashingMachine(int basePrice, int peso){
    this.basePrice=basePrice;
    this.peso=peso;
    }

    public WashingMachine(int burden,int basePrice,String color,char energyConsumption,int weight){
        super(basePrice,color,energyConsumption,weight);
        this.burden=burden;
    }

    public int getBurden() {
        return burden;
    }

    public double priceFinal(){
        double precio = super.priceFinal();
        if(burden>30){
            return precio + 50;
        }else return precio;
    }
}
