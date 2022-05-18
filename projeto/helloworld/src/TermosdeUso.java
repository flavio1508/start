import java.util.Scanner;

public class TermosdeUso { 
    public static void main(String[] args) {
        boolean respostainvalida = false;
        Scanner leitor = new Scanner(System.in);
        do { 
            
           System.out.println("Leia os termos de uso disponivel nete link: http://projeto.com.br/termos-de-uso." + "você concorda com os termos?(S/N)");
           String resposta = leitor.next(); 
           if(resposta.equals("S")|| resposta.equals ("s")) { 
            System.out.println("informe seu nome completo para a licença!");
            String nomecompleto = leitor.nextLine();
            System.out.println("licenssiado para:" + nomecompleto);   
            System.out.println("software instalado com sucesso!");
           } else if (resposta.equals("N") || resposta.equals("n")){
            System.out.println("software nao instalado!");
           } else {
            System.out.println("comando invalido!"); 
              respostainvalida = true;  
           }
        } while (respostainvalida);
        leitor.close();
    }
    
}
