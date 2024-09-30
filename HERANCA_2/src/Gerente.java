public class Gerente extends Funcionario {
    //Definição do atributo privado específico
    private String departamento;


    //Definição dos construtores públicos
    public Gerente(){}

    public Gerente(String nome, String cpf, String data_nasc, double salario_base, String departamento){
        super(nome, cpf, data_nasc, salario_base);
        this.departamento=departamento;
    }

    //Getter e setter do atributo privado específico
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //Método string que retorna as informações da superclasse adicionando as informações dos atributos específicos
    public String descricaoG(){
        return "Dados do gerente: \n" +super.descricaoF() + "Departamento: "+getDepartamento()+"\n";
    }
}
