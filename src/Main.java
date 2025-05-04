
import java.util.ArrayList;
//import java.util.Scanner; //apenas caso de usar classe gloal

public class Main {
    public static void main(String[] args) {
        ArrayList<Doce> listaDeDoces = new ArrayList<>(); //Lista que só aceita objetos da classe Doce


        Doce doce1  = new Doce ();
        doce1 .nomeDoce = "Bem Casado";
        doce1 .preco = 3.45;

        Doce doce2 = new Doce();
        doce2.nomeDoce = "Beijinho";
        doce2.preco = 2.00;

        Doce doce3 = new Doce();
        doce3.nomeDoce = "Brigadeiro";
        doce3.preco = 1.55;

        Doce doce4 = new Doce();
        doce4.nomeDoce = "Coxinha de Morango";
        doce4.preco = 8.50;

        //Comando que coloca um doce dentro da lista
        listaDeDoces.add(doce1);
        listaDeDoces.add(doce2);
        listaDeDoces.add(doce3);
        listaDeDoces.add(doce4);

/*
        //Scanner para ler entrada do usuário
        String nomeBuscado = Teclado.lerString("Digite o dooce que procura: ");

        boolean encontrado = false;

        for (Doce doceAtual : listaDeDoces) {
            if (doceAtual.nomeDoce.equalsIgnoreCase(nomeBuscado)){
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

        if (!encontrado) {
            System.out.println("😔 Doce não encontrado");
        }

 */
        //Código que pede ao usuário o deoce que será removido e quarda na variável nomeDoceRemover para excluir posteriormente
    String nomeDoceRemover = Teclado.lerString("Digite o doce que deseja excluir da lista: ");

      Doce doceParaRemover = null;

      for(Doce doceAtual : listaDeDoces) {
          if (doceAtual.nomeDoce.equalsIgnoreCase(nomeDoceRemover)) {
              doceParaRemover = doceAtual;
              break;
          }
      }

      if (doceParaRemover != null) {
          listaDeDoces.remove(doceParaRemover);
          System.out.println("✅ Doce removido da lista com sucesso\n");
      } else {
          System.out.println("❌ Doce não encontrado\n");
      }

        System.out.println(" 📃 Lista de Doces: ");
        //Pega cada doce da lista um por um e mostra
        for (Doce d : listaDeDoces) {
            //d.mostrarNomeLoja();
            d.mostrarInfoDoce();
            System.out.println("________*____________");

        }

    }
}