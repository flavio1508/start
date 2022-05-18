package fabricadecarros;

import javax.lang.model.util.ElementScanner14;

public class Carro { 
    private String marca;
    private String modelo;
    private int anodefabricacao;
    private String tipo;
    private int quantidadedeportas;
    private String tipodecombustivel;
    private String nomedocarro;
    private double quilometragem;
    private boolean ligado = false;
    private String cor; 
    private int velocidadeAtual; 
    public Carro(String modelo, String marca , String cor){ 
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;

    }
   
    public void ligar(){ 
        if(!this.isligado()){ 
        this.ligado  = true;
        System.out.println("carro ligado!");

    } else { 
        System.out.println("o carro jah estah ligado");

    }
   }
   public void desligar(){ 
       if(this.isligado()){ 
           this.ligado = false;
           System.out.println("carro desligado!");
       } else { 
           System.out.println("o carro jah estah desligado");
       }
   }
public boolean isligado() { 
    return ligado;
} 
public void acelerar(int velocidadeAtual){ 
    this.velocidadeAtual = velocidadeAtual;
} 
public int pegarMarchar() { 
    if(this.velocidadeAtual <= 0) { 
        return 0;
    } 
    if (this.velocidadeAtual > 0 && this.velocidadeAtual <= 15) {
        return 1;
    } 
    if(this.velocidadeAtual > 15 && this.velocidadeAtual <= 30){ 
           return 2;
    } 
    return 3;
} 
public void pintar(String novaCor){ 
    if(novaCor.equals(this.cor))
    this.cor = novaCor;
    else 
    System.out.println("Não pode pintar de cor diferente de Branco.");

}
public int getVelocidadeAtual() {
    return this.velocidadeAtual;
}
public String getModelo() { 
    return this.modelo;
}
public String getCor() {
    return cor;
} 

public String getTipodecombustivel() {
    return tipodecombustivel;
} 
public void setTipodecombustivel(String tipodecombustivel) {
    this.tipodecombustivel = tipodecombustivel;
}  

 }
 