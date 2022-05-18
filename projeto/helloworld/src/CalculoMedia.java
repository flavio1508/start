import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class CalculoMedia {
  public static void main(String[] args) {
    double nota1;
    double nota2;
    double media;
    boolean notainvalida;
    Scanner leitor = new Scanner(System.in);
    System.out.println("quantos alunos");
    int numealunos = leitor.nextInt();
    leitos.nextline();
    for (inti = 1; i <= numalunos; i++) {
      do {
        notainvalida = false;
        // leia a nota1
        System.out.println("informe o valor da nota 1");
        // atribua o valor para nota1
        nota1 = leitor.nextDouble();
        if (nota1 > 10d || nota1 < 0d) {
          System.out.println("nota invalida");
          notainvalida = true;
        }
      } while (notainvalida);

      do {
        notainvalida = false;
        // leia a nota1
        System.out.println("informe o valor da nota 2");
        // atribua o valor para nota1
        nota2 = leitor.nextDouble();
        if (nota1 > 10d || nota2 < 0d) {
          System.out.println("nota invalida!");
          notainvalida = true;
        }
      } while (notainvalida);
      media = (nota1 + nota2) / 2;
      if (media >= 7) {
        System.out.println("Aprovado");
      } else {
        System.out.println("Reprovado");
      }
    }
    leitor.close();
  }

}
