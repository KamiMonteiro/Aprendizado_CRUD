import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Doce> listaDeDoces = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n📋 MENU DE DOCES:");
            System.out.println("1 - Adicionar doce");
            System.out.println("2 - Listar doces");
            System.out.println("3 - Atualizar doce");
            System.out.println("4 - Remover doce");
            System.out.println("0 - Sair");

            opcao = Teclado.lerInteiro("Escolha uma opção:");

            switch (opcao) {
                case 1:
                    // Adicionar doce
                    String nome = Teclado.lerString("Digite o nome do doce:");
                    double preco = Teclado.lerDouble("Digite o preço do doce:");

                    Doce novoDoce = new Doce(); // cria um novo doce vazio
                    novoDoce.nomeDoce = nome;
                    novoDoce.preco = preco;

                    listaDeDoces.add(novoDoce); // adiciona o novo doce na lista

                    System.out.println("✅ Doce adicionado com sucesso!");
                    //break;
                    break;
                case 2:
                    // Listar doces

                    System.out.println(" 📃 Lista de Doces: ");
                    //Pega cada doce da lista um por um e mostra
                    for (Doce d : listaDeDoces) {
                        //d.mostrarNomeLoja();
                        d.mostrarInfoDoce();
                        System.out.println("________*____________");

                    }
                    break;
                case 3:
                    // Atualizar doce

                    String nomeBuscado = Teclado.lerString("Digite o dooce que procura: ");

                    boolean encontrado = false;

                    for (Doce doceAtual : listaDeDoces) {
                        if (doceAtual.nomeDoce.equalsIgnoreCase(nomeBuscado)) {
                            System.out.println("✨ Doce encontrado: ");
                            doceAtual.mostrarInfoDoce();
                            encontrado = true;


                            String novoNome = Teclado.lerString("Digite novo doce a ser adicionado: ");
                            double novoPreco = Teclado.lerDouble("Digite novo preço");

                            doceAtual.nomeDoce = novoNome;
                            doceAtual.preco = novoPreco;

                            System.out.println("Doce atualizado com sucesso");
                            doceAtual.mostrarInfoDoce();

                            break;
                        }
                    }
                    break;
                case 4:
                    // Remover doce
                    //Lê o nome do doce que o usuário deseja remover e armazena na variável nomeDoceRemover
                    String nomeDoceRemover = Teclado.lerString("Digite o doce que deseja excluir da lista: ");
                    //Primeiro, declara a variável e deixa ela vazia, Depois, dentro do for, se encontrar o doce com o nome digitado nós colocamos o doce dentro da variável
                    Doce doceParaRemover = null; //variavel declarada como null para iniciar com algum valor (null neste caso)
                    //olhando para lista de doces, ele compara o nome (var: doceAtual) com o que o usuario digitou (doceParaRemover) e se encontrar, guarda o doce e para de buscar
                    for (Doce doceAtual1 : listaDeDoces) {
                        if (doceAtual1.nomeDoce.equalsIgnoreCase(nomeDoceRemover)) {
                            doceParaRemover = doceAtual1;
                            break;
                        }
                    }
                    if (doceParaRemover != null) {
                        listaDeDoces.remove(doceParaRemover);
                        System.out.println("✅ Doce removido da lista com sucesso\n");
                    } else {
                        System.out.println("❌ Doce não encontrado\n");
                    }
                    break;
                case 0:
                    System.out.println("👋 Saindo do programa.");
                    break;
                default:
                    System.out.println("⚠️ Opção inválida!");
            }
        }while (opcao != 0) ;
    }
}

