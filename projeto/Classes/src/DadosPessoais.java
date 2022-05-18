public class DadosPessoais {
    String sexo;
    String cpf;
    String dataDeNascimento;
    String idade;
    String nome;
    String cargo;
    Endereco endereco;
    Contato contato;

    void informarDadosParaContato(Contato contato){
          this.contato = contato;
           
    }
    void informarEndereco(Endereco endereco){
        this.endereco = endereco;
    }
}
