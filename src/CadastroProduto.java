import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        double custoTotal = 0.0;

        while (option != 3) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar ou criar item");
            System.out.println("2 - Listar carrinho");
            System.out.println("3 - Finalizar pedido");
            System.out.println("4 - Remover ou deletar item");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Selecione um item:");
                    System.out.println("1 - Café - R$5.00");
                    System.out.println("2 - Sanduíche - R$10.00");
                    System.out.println("3 - Refrigerante - R$7.00");
                    System.out.println("4 - Cerveja - R$8.00");
                    int item = scanner.nextInt();
                    switch (item) {
                        case 1:
                            custoTotal += 5.0;
                            System.out.println("Café adicionado");
                            break;
                        case 2:
                            custoTotal += 10.0;
                            System.out.println("Sanduiche adicionado");
                            break;
                        case 3:
                            custoTotal += 7.0;
                            System.out.println("Refrigerante adicionado");
                            break;
                        case 4:
                            custoTotal += 8.0;
                            System.out.println("Cerveja adicionado");
                            break;
                        default:
                            System.out.println("Não existe esse tipo de item");
                    }
                    break;
                case 2:
                    System.out.println("Carrinho:");
                    System.out.println("Total: R$" + custoTotal);
                    break;
                case 3:
                    System.out.println("Total: " + custoTotal);
                    System.out.println(" Pedido finalizado ");
                    break;



        case 4:
        switch (option) {
            case 1:
                custoTotal -= 5.0;
                System.out.println("Café removido");
                break;
            case 2:
                custoTotal -= 10.0;
                System.out.println("Sanduiche removido");
                break;
            case 3:
                custoTotal -= 7.0;
                System.out.println("Refrigerante removido");
                break;
            case 4:
                custoTotal -= 8.0;
                System.out.println("Cerveja removido");
                break;
            default:
                System.out.println("Não existe esse tipo de item");
        }
                    System.out.println("Item removido");
                default:
                    System.out.println("Negado");

            }
        }
    }
}