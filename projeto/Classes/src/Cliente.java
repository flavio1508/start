public class Cliente {
    DadosPessoais dadosPessoais; 
    void informarDadosPessoais(DadosPessoais dadosPessoais){
        this.dadosPessoais = dadosPessoais;
    }
    void mostrarDadosPessoais(){
        if(this.dadosPessoais != null){

            System.out.println("nome:" + dadosPessoais.nome);
            System.out.println("cpf:" + dadosPessoais.cpf);
            System.out.println("sexo:" + dadosPessoais.sexo);
            System.out.println("Data de Nascimento" + dadosPessoais.dataDeNascimento);
            System.out.println("email:" + this.dadosPessoais.contato.email);
            System.out.println("telefone" + this.dadosPessoais.contato.telefone);
            System.out.println("endereço" + this.dadosPessoais.endereco.rua + " , " + this.dadosPessoais.endereco.numerocasa + " , " + this.dadosPessoais.endereco.bairro + " , " + this.dadosPessoais.endereco.cp);
        } else{
            System.out.println("o cliente ainda nao possui dados pessoais.");
        }
    }
}
