import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> itens = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String entrada;
        int opcao;

        itens.add("sabonete");
        itens.add("arroz");
        itens.add("suco");
        itens.add("carne");

        do {
            //opções do menu
            System.out.println("Escolha as seguintes opções: ");
            System.out.println("1- Adicionar um item a lista ");
            System.out.println("2- Remover um item da lista ");
            System.out.println("3- Visualizar lista ");
            System.out.println("4- sair ");
            opcao = sc.nextInt();
            sc.nextLine();

            //Adicionando um item
            if (opcao == 1) {
                System.out.println("Digite o item que deseja adicionar: ");
                entrada = sc.nextLine();
                if (itens.add(entrada)) {
                    System.out.println("Item adicionado com sucesso");
                }
            }

            //Removendo um item
            else if (opcao == 2) {
                System.out.println("Digite o item que deseja remover" + itens);
                entrada = sc.nextLine();
                if (itens.remove(entrada)) {
                    System.out.println("Item removido com sucesso");
                }
                else {
                    System.out.println("Item não encontrado!");
                }
            }

            //Visualizando lista
            else if (opcao == 3) {
                System.out.println("Visualizar lista");
                for (int i = 0; i < itens.size(); i++) {
                    System.out.println(itens.get(i));
                }
            }

            //Saindo do programa
            else if (opcao == 4) {
                System.out.println("Você está saindo do programa, aguarde... ");
                break;
            }

            //opção inexistente
            else {
                System.out.println("Opção inválida");
            }

        } while (opcao != 4);

        sc.close();
    }
}
