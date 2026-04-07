
package main;

import model.Caneta;

public class Main {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setCor("Azul");
        c1.setPonta(0.5);
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.setCor("Preta");
        c2.setPonta(0.7);
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
