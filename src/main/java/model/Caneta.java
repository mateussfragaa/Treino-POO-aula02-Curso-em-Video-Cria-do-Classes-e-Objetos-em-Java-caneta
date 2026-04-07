
package model;

public class Caneta {
    private String modelo;
    private String cor;
    private double ponta;
    int carga;
    boolean tampada;

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public double getPonta() {
        return ponta;
    }

    public int getCarga() {
        return carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    
    
    public void status(){
        System.out.println("A cor é " + this.cor);
        System.out.println("A ponta é "+ this.ponta);
        System.out.println("Tampada "+ this.tampada);
    }
    
    public void rabiscar(){
        if (this.tampada){
            System.out.println("A caneta está tampada");
        } else {
            System.out.println("Rabiscando");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}