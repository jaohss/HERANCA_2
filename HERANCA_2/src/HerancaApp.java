public class HerancaApp{
    public static void main(String[] args) {

        //Entrada de dados do cliente
        Cliente c1 = new Cliente();
        c1.setNome("Alana Esther Figueiredo");
        c1.setCpf("555.802.528-03");
        c1.setTelefone("(21) 3528-1173");
        c1.setNumeroCartao("5222 6593 7496 0981");
        c1.setData_nasc("20/09/1952");

        //Entrada de dados do gerente
        Gerente g1 = new Gerente();
        g1.setNome("Benício Nathan Augusto Viana");
        g1.setCpf("241.909.404-29");
        g1.setDepartamento("Financeiro");
        g1.setSalario_base(4500.99);
        g1.setData_nasc("14/01/1956");

        //Entrada de dados do vendedor
        Vendedor v1 = new Vendedor();
        v1.setNome("Iago Thiago Farias");
        v1.setCpf("401.127.171-36");
        v1.setSalario_base(2550.89);
        v1.setPer_comissao(0.23);
        v1.setData_nasc("13/08/1959");

        //Saída de dados do cliente e dos funcionários
        System.out.println(c1.descricaoC());
        System.out.println(g1.descricaoG());
        System.out.println(v1.descricaoV());
        
    }
}