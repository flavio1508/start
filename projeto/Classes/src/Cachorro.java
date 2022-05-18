public class Cachorro { 
    Pessoa tutor;
    String raça;
    String sexo;
    String nomedopet;
    Vacina vacina;
    boolean cadastro;
    boolean adestrado;
    int idade;

    void latir(){
        System.out.println("Au!"); 
     }
     void pedircarinho(){
         this.latir();
         this.latir(); 
     }
     void rosnar(){ 
         System.out.println("grrrrrr!");
         
     }
}
