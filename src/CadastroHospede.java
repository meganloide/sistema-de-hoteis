import java.util.ArrayList;
import java.util.Scanner;

public class CadastroHospede {

    public static void main(String[] args) {
        ArrayList<Hospede> hospedes = new ArrayList<>();
        HospedeDAO hospedeDAO = new HospedeDAO(new ArrayList<>());
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Hospede");
            System.out.println("2 - Excluir Hospede");
            System.out.println("3 - Atualizar Hospede");
            System.out.println("4 - Listar Hospede");
            System.out.println("5 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do Hospede:");
                    String nome = scanner.next();

                    System.out.println("Digite o Cpf do Hospede:");
                    String cpf = scanner.next();

                    System.out.println("Digite o email do Hospede:");
                    String email = scanner.next();

                    System.out.println("Digite o telefone do Hospede:");
                    String telefone = scanner.next();

                    Hospede hospede = new Hospede(nome, cpf, email, telefone);
                    hospedeDAO.adicionarHospede(hospede);

                    System.out.println("Hospede cadastrado com sucesso!");
                    break;

                case 2:
                    hospedeDAO.listarHospedes();
                    System.out.println("Digite o index do hospede que fará o CheckOut");
                    int numero1 = scanner.nextInt();
                    hospedeDAO.excluirHospede(hospedeDAO.getHospedeByIndex(numero1));
                    break;

                case 3:
                    hospedeDAO.listarHospedes();
                    System.out.println("Digite o index do hospede a ser atualizado");
                    int numero2 = scanner.nextInt();

                    System.out.println("Digite o CPF do hospede:");
                    String cpf1 = scanner.next();

                    System.out.println("Digite o Email do hospede:");
                    String email1 = scanner.next();

                    System.out.println("Digite o Telefone do hospede:");
                    String telefone1 = scanner.next();

                    System.out.println("Digite o número do quarto que ele irá deixar vago:");
                    String numeroquarto = scanner.next();

                    Hospede hospede1 = new Hospede(cpf1, numeroquarto,email1, telefone1);

                    hospedeDAO.atualizarHospede(hospedeDAO.getHospedeByIndex(numero2), hospede1);
                    break;

                case 4:
                    System.out.println(hospedeDAO.listarHospedes());
                    System.out.println("Lista de Hospedes:");
                    break;

                case 5:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 5);

        scanner.close();
    }
}




