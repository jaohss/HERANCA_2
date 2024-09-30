public class Cliente extends Pessoas {
    //Definição dos atributos privados
    private String email;
    private String numeroCartao;
    private String telefone;

    //Definição dos construtores
    public Cliente(){}

    public Cliente(String nome, String cpf, String data_nasc, String email, String numeroCartao, String telefone ){
        super(nome, cpf, data_nasc);
        this.email=email;
        this.numeroCartao=numeroCartao;
        this.telefone=telefone;
    }

    //Getters e setters dos atributos privados
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //método que gera um email a partir do nome e sobrenome do usuário
    private String gerarEmail(){
        setNome(getNome().trim().toLowerCase());
        String[]partesNome = getNome().split(" "); //Delimita e separa o nome a partir de espaços
        String primeiroNome = partesNome[0]; //Definição do nome
        String ultimoNome = partesNome[partesNome.length - 1]; //Definição do último sobrenome
        email = primeiroNome + "." + ultimoNome + "@email.com"; //Definição do modelo do email com nome e sobrenome
        return email;//retorna o email
    }

    public String getEmail() {
        return gerarEmail();
    }

    //Método string que retorna as informações da superclasse adicionando as informações dos atributos específicos
    public String descricaoC(){
        return "Dados do cliente: \n" +super.descricao() + "E-mail: "+getEmail() +"\n" +
        "Número do cartão fidelidade: "+getNumeroCartao() + "\n"+
        "Telefone: "+getTelefone()+"\n";
    }


    
}
