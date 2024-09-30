public class Vendedor extends Funcionario {
    //Definição do atributo privado específico
    double per_comissao;

    //Definição dos construtores públicos
    public Vendedor(){}

    public Vendedor(String nome, String cpf, String data_nasc, double salario_base, double per_comissao){
        super(nome, cpf, data_nasc, salario_base);
        this.per_comissao=per_comissao;
    }

    //getter e setter do atributo privado específico
    public double getPer_comissao() {
        return per_comissao*100;
    }

    public void setPer_comissao(double per_comissao) {
        this.per_comissao = per_comissao;
    }

    //Método string que retorna as informações da superclasse adicionando as informações dos atributos específicos
    public String descricaoV(){
        return "Dados do vendedor: \n" + super.descricaoF() + "Percentual de comissão: "+getPer_comissao()+"% \n";
    }
    
}
