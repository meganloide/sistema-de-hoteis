import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private String endereco;
    private String cidade;
    private List<Quarto> quartosDisponiveis;
    private List<Hospede> hospedes;

    public Hotel(String nome, String endereco, String cidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.quartosDisponiveis = new ArrayList<>();
        this.hospedes = new ArrayList<>();
    }


}
