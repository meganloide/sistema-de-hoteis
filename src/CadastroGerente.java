import java.util.ArrayList;
import java.util.Scanner;

public class CadastroGerente {

    public static void main(String[] args) {
        ArrayList<Gerente> gerentes = new ArrayList<>();
        GerenteDAO gerenteDAO = new GerenteDAO(new ArrayList<>());
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar gerente");
            System.out.println("2 - Excluir gerente");
            System.out.println("3 - Atualizar gerente");
            System.out.println("4 - Listar gerente");
            System.out.println("5 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do gerente: ");
                    String nome = scanner.next();

                    System.out.println("Digite o Cpf do gerente:");
                    String cpf = scanner.next();

                    System.out.println("Digite o email do gerente: ");
                    String email = scanner.next();

                    System.out.println("Digite o telefone do gerente: ");
                    String telefone = scanner.next();

                    Gerente gerente = new Gerente(nome, cpf, email, telefone);
                    gerenteDAO.adicionarGerente(gerente);

                    System.out.println("Gerente cadastrado...");
                    break;
                case 2:
                    gerenteDAO.listarGerentes();
                    System.out.println("Digite o informações do gerente");
                    int numero1 = scanner.nextInt();
                    gerenteDAO.excluirGerente(gerenteDAO.getGerenteByIndex(numero1));
                    break;

                case 3:
                    gerenteDAO.listarGerentes();
                    System.out.println("Digite as informações do gerente");
                    int numero2 = scanner.nextInt();

                    System.out.println("Cpf: ");
                    String cpf1 = scanner.next();

                    System.out.println("Email do gerente: ");
                    String email1 = scanner.next();

                    System.out.println("Telefone para contato");
                    String telefone1 = scanner.next();

                    System.out.println("numero do gerente");
                    String numerogerente = scanner.next();

                    Gerente gerente1 = new Gerente(cpf1, numerogerente,email1, telefone1);

                    gerenteDAO.atualizarGerente(gerenteDAO.getGerenteByIndex(numero2), gerente1);
                    break;

                case 4:
                    System.out.println(gerenteDAO.listarGerentes());
                    System.out.println("Lista dos gerentes");
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




