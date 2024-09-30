public class Funcionario extends Pessoas {
    //Definição do atributo privado específico
    private double salario_base;

    //Definição dos construtores públicos
    public Funcionario(){}

    public Funcionario(String nome, String cpf, String data_nasc, double salario_base){
        super(nome, cpf, data_nasc);
        this.salario_base=salario_base;
    }

    //Getter e setter dos atributo privados específico 
    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    //Método string que retorna as informações da superclasse adicionando as informações dos atributos específicos
    public String descricaoF(){
        return super.descricao() + "Salário base: R$"+getSalario_base() +"\n";
    }
}
