import java.util.List;

public class HospedeDAO {
    private List<Hospede> hospedes;

    public HospedeDAO(List<Hospede> hospedes) {
        hospedes.add(new Hospede("Gustavo", "11491403223", "83991234324","gustavo@uol.com"));
        this.hospedes = hospedes;
    }

    public void adicionarHospede(Hospede hospede) {
        hospedes.add(hospede);
    }

    public void atualizarHospede(Hospede hospede1, Hospede hospede2) {
        hospedes.remove(hospede1);
        hospedes.add(hospede2);
    }

    public void excluirHospede(Hospede hospede) {
        hospedes.remove(hospede);
    }

    public Hospede getHospedeByIndex(int index){
        return hospedes.get(index);
    }

    public List <Hospede> listarHospedes() {
        return hospedes;
    }


}
