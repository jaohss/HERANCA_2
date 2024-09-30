import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoas {
    //Definição dos atributos privados
    private String nome;
    private String cpf;
    private String data_nasc;

    //Definição dos construtores
    public Pessoas(){}

    public Pessoas(String nome, String cpf, String data_nasc){
        this.nome=nome;
        this.cpf=cpf;
        this.data_nasc=data_nasc;
    }

    //getters e  setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    //Método que converte a data de nascimento tipo String para o tipo data no formato dd/MM/yyyy
    private String converteData(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(this.data_nasc, formatter);
        return data.format(formatter);
    }

    public String getData_nasc() {
        return converteData();
    }

    //Método que retorna as informações dos atributos comuns 
    public String descricao(){
        return "Nome: "+getNome() +"\n" +
        "CPF: "+getCpf() + "\n"+
        "Data de nascimento: "+getData_nasc()+"\n";
    }
    
}
