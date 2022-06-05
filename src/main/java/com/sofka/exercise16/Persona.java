package com.sofka.exercise16;


import java.util.Random;
/**
 * @author Duvan Enrique Leal Marin
 * @version 1.0
 */

public class Persona {
    private String nombre ;
    private  int edad ;

    private int dni ;
    private char sexo ;
    private int peso ;
    private int altura;


    public Persona(String nombre, int edad, char sexo) {
        this.nombre=nombre;
        this.edad=edad;
        this.sexo =sexo;
        this.peso=90;
        this.altura=65;
    }
    public  Persona(String nombre,int edad,char sexo,int dni,int peso,int altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.dni=dni;
        this.peso=peso;
        this.altura=altura;
    }
    public Persona(){
        this.nombre="";
        this.edad=0;
        this.sexo='H';
        this.dni=0;
        this.peso=0;
        this.altura=0;
    }

    /**
     * metodo calcular imc , calcula el indice de masa corporal con el peso y la altura
     * si el resultado es < a 20 es bajo peso , si esta entre 20 y 25 el peso es ideal , si es mayot a 25
     * esta en sobrepeso
     * @return message
     */
    public String calcularIMC(){
        var resul = (peso/ Math.pow((altura*0.01), 2));
        int sobrePeso = 1;
        if(resul<20){
            int bajoPeso = -1;
            return "bajo peso " + bajoPeso;
        }
        else if((resul >= 20) && (resul <= 25)) {
            int buenPeso = 0;
            return  "peso ideal " + buenPeso;

        } else
            return "sobre peso " + sobrePeso;

    }

    /**
     * metodo verificar edad , si la edad es <a 18 muestra mensaje de es mejor de edad , de lo contrario
     * es mayor de edad
     * @return mensaje
     */
    public String mayorDeEdad(){
        boolean validate = false;
        if(edad>18){
            validate = true;
            return "es mayor de edad " + validate;
        }else {
            return "es menor de edad " + validate;
        }
    }

    /**
     * Metodo comprobar sexo, verifica si el sexo ingresado es el mismo por defecto
     * @return sexo
     */
    public char comprobarSexo(char sexo) {
        char finalSexo = 'H';
        if (sexo == 'M') {
            return sexo;
        } else return finalSexo;
    }

    /**
     * Metodo mostrar mensaje , muestra toda la informacion obtenida por los metodos y atributos
     * @return String
     */
    public String toString(){
      return "La pesona " + this.nombre + "\n con la edad " + this.edad +"\n"+ mayorDeEdad()+ "\n sexo " + comprobarSexo('h')+
                "\n DNI " + generarDNI() + " \n peso " + peso + " \n altura " + altura + "\n " + calcularIMC();
    }

    /**
     * Metodo generar dni , genera un identificador aleatorio
     * @return dni
     */
    public int generarDNI(){
        Random ran = new Random();
        dni= ran.nextInt(10000000+90000000);
        return dni;
    }

    /**
     * Metodos set , para guaras las instancias
     *
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


}
