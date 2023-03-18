import java.util.ArrayList;
import java.util.Scanner;

public class CadastroQuarto {

    public static void main(String[] args) {
        ArrayList<Hospede> hospedes = new ArrayList<>();
        QuartoDAO quartoDAO = new QuartoDAO(new ArrayList<>());
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Quarto");
            System.out.println("2 - Excluir Quarto");
            System.out.println("3 - Atualizar Quarto");
            System.out.println("4 - Listar Quarto");
            System.out.println("5 - Sair");
            System.out.println("6 - Quartos disponiveis");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o numero do quarto:");
                    int numero = scanner.nextInt();

                    System.out.println("Digite o tipo do quarto:");
                    String tipo = scanner.next();

                    System.out.println("Digite o preco do quarto:");
                    double preco = scanner.nextDouble();

                    Quarto quarto = new Quarto(numero, tipo, preco);
                    quartoDAO.adicionarQuarto(quarto);

                    System.out.println("Quarto cadastrado com sucesso!");
                    break;

                case 2:
                    quartoDAO.listarQuartos();
                    System.out.println("Digite o index do quarto a ser excluido");
                    int numero1 = scanner.nextInt();
                    quartoDAO.excluirQuarto(quartoDAO.getQuartoByIndex(numero1));
                    break;

                case 3:
                    quartoDAO.listarQuartos();
                    System.out.println("Digite o index do quarto a ser atualizado");
                    int numero2 = scanner.nextInt();

                    System.out.println("Digite o numero do quarto:");
                    int numero3 = scanner.nextInt();

                    System.out.println("Digite o tipo do quarto:");
                    String tipo1 = scanner.next();

                    System.out.println("Digite o preco do quarto:");
                    double preco1 = scanner.nextDouble();

                    Quarto quarto1 = new Quarto(numero3, tipo1, preco1);

                    quartoDAO.atualizarQuarto(quartoDAO.getQuartoByIndex(numero2), quarto1);
                    break;

                case 4:
                    System.out.println("Lista de quartos:");
                    quartoDAO.listarQuartos();
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




