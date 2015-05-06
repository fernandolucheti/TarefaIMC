/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 41330889
 */
public class Pessoa {
    
    
    private char genero;
    private double altura;
    private double peso;
    private double imc;

    public Pessoa() {
    }

    public Pessoa(char genero, double altura, double peso) {
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String calcularImc(){
        this.imc = this.peso/(altura * altura);
        
        if (this.genero == 'm'){
            if (this.imc < 18.9){
                return "Risco Baixo";
            }else if(this.imc < 24.9){
                return "Ideal";
            }else if (this.imc < 27.9){
                return "Risco Moderado";
            }else {
                return "Risco Alto";
            }
        }
        
        if (this.genero == 'f'){
            if (this.imc < 17.9){
                return "Risco Baixo";
            }else if(this.imc < 24.4){
                return "Ideal";
            }else if (this.imc < 27.2){
                return "Risco Moderado";
            }else {
                return "Risco Alto";
            }
        }
        
        return "Invalido";
    }
    
}
