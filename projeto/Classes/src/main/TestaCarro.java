package main;

import fabricadecarros.Carro;

public class TestaCarro { 
    public static void main(String[]args){ 
        Carro carro = new Carro( "kwid" , "renaut" , "branco" );
        System.out.println(carro.getModelo() ); 
        carro.pintar("preto");
        carro.ligar();
        carro.acelerar(25);
        carro.acelerar(18);
        System.out.println( carro.getVelocidadeAtual());
        System.out.println(carro.getModelo());
  
    }
    
}
