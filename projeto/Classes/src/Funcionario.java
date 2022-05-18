public class Funcionario { 
    String cargo;
    double salario;
    DadosPessoais dadosPessoais;
    
    void informarSalario(double salario){
        this.salario = salario;
    } double calcularSalarioLiquido(){
        double salarioLiquido = 0;
        if(this.salario <= 1903.98){
            System.out.println("Isento.");
        } else{
           salarioLiquido = this.salario - 7.5/100;
        } return salarioLiquido;
    }
    
}  


