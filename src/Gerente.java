public class Gerente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;


    public Gerente(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Gerentes Cadastrados {" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void add(Gerente gerentes) {
    }
}
