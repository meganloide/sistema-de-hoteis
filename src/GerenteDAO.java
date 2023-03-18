import java.util.List;

public class GerenteDAO {
    private List<Gerente> gerentes;

    public GerenteDAO(List<Gerente> gerentes) {
        gerentes.add(new Gerente("gustavo pereira", "41234-91", "993505888","gustavo10@gmail.com"));
        this.gerentes = gerentes;
    }

    public void adicionarGerente(Gerente gerentes) {
        gerentes.add(gerentes);
    }

    public void atualizarGerente(Gerente gerente1, Gerente gerente2) {
        gerentes.remove(gerente1);
        gerentes.add(gerente2);
    }

    public void excluirGerente(Gerente gerente) {

        gerentes.remove(gerente);
    }

    public Gerente getGerenteByIndex(int index){

        return gerentes.get(index);
    }

    public List <Gerente> listarGerentes() {
        return gerentes;
    }


}
