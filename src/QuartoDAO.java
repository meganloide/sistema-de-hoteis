import java.util.List;

public class QuartoDAO {
    private List<Quarto> quartos;

    public QuartoDAO(List<Quarto> quartos) {
        quartos.add(new Quarto(1, "casal", 200.00));
        quartos.add(new Quarto(2, "casal", 200.00));
        quartos.add(new Quarto(3, "casal", 200.00));
        quartos.add(new Quarto(4, "casal", 200.00));
        quartos.add(new Quarto(5, "casal", 200.00));
        quartos.add(new Quarto(6, "casal", 200.00));
        quartos.add(new Quarto(7, "suite", 600.00));
        quartos.add(new Quarto(8, "suite", 600.00));
        this.quartos = quartos;
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void atualizarQuarto(Quarto quarto1, Quarto quarto2) {
        quartos.remove(quarto1);
        quartos.add(quarto2);
    }

    public void excluirQuarto(Quarto quarto) {
        quartos.remove(quarto);
    }

    public Quarto getQuartoByIndex(int index){
        return quartos.get(index);
    }

    public List<Quarto> listarQuartos() {
        return quartos;
    }


}
