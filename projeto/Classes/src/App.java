import fabricadecarros.Carro;

public class App {
    public static void main(String[] args) throws Exception {
       Cachorro cachorro = new Cachorro();
       
       cachorro.latir();

       cachorro.rosnar();

       cachorro.pedircarinho();

       Endereco endereco = new Endereco();
       endereco.rua = "sei lá";
       endereco.cp = "1111111";
       endereco.numerocasa = "985435689388";
       endereco.bairro = "qual um";

       Contato contato =new Contato();
       contato.email = "flavioaugusto1508@gmail.com";
       contato.telefone = "67 987988768";

       DadosPessoais dadosPessoais = new DadosPessoais();
       dadosPessoais.nome = "flavio";
       dadosPessoais.cpf = "847857874875843";
       dadosPessoais.dataDeNascimento = "15/08/2002";
       dadosPessoais.sexo = "M";
       dadosPessoais.informarDadosParaContato(contato);
       dadosPessoais.informarEndereco(endereco);

       Cliente cliente = new Cliente();
       cliente.informarDadosPessoais(dadosPessoais);
       cliente.mostrarDadosPessoais();

       Estagiario estagiario = new Estagiario();
       estagiario.salario = 2000;
       double valor = estagiario.calcularSalarioLiquido();
       System.out.println("o salario liquido é:" + valor);

       Funcionario funcionario = new Funcionario();
       funcionario.salario = 2900;
       double valor2 = funcionario.calcularSalarioLiquido();
       System.out.println("o salario liquido é" + valor2);

       Carro carro = new Carro();
       carro.valor = 3000;
       double valorIPI = carro.calcularIPI(5.7);
       

    }
}
