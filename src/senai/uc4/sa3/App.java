package senai.uc4.sa3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /*
        * Ola professor, você pode executar o programa por essa classe,
        * Oque vai acontecer aqui e um pequeno programa de demonstração
        * Que vai criar as classes e mostrar os resultados de acordo com oque a atividade pede
        * */
        System.out.println("Iniciando Programa Demo...\n");
        esperar(3);

        Venda venda = new Venda();
        System.out.println("Classe venda foi criada:");
        System.out.println(venda + "\n");
        esperar(3);

        System.out.println("Criando 3 produtos (Arroz, Feijão, Macarrão)...\n");
        Produto arroz = new Produto("Arroz", 10.50, 23);
        Produto feijao = new Produto("Feijão", 10.99, 56);
        Produto macarrao = new Produto("Macarrão", 12.99, 1);
        System.out.println(arroz + "\n" + feijao + "\n" + macarrao + "\n");
        esperar(3);

        System.out.println("Adicionando produtos na lista de compras...");
        venda.adicionarItemVenda(arroz);
        venda.adicionarItemVenda(feijao);
        venda.adicionarItemVenda(macarrao);
        esperar(3);
        System.out.println("Mostrando informações da classe venda:\n");
        System.out.println(venda + "\n");
        esperar(5);

        esperar(3);
        System.out.println("Executando função de visualização da venda:");
        venda.visualizarVenda();

        esperar(4);
        System.out.println("\n(Você no controle) escolhendo o metodo de pagamento:");

        Scanner scanner = new Scanner(System.in);
        int tipo;
        System.out.println("1 - Dinheiro\n2 - Cheque\n3 - Cartão de débito\n4 - Cartão de crédito\n5 - Pix");
        System.out.print("insira o número desejado: ");
        tipo = scanner.nextInt();

        Pagamento pagamento = new Pagamento();
        pagamento.selecionarTipoPagamento(tipo);
        esperar(3);

        System.out.println("Executando a função para terminar a venda: ");
        esperar(1);
        venda.concluirVenda(pagamento);
        esperar(3);

        System.out.println("Demonstração finalizada, mostrando informações finais da classe venda:");
        esperar(2);
        System.out.println(venda);
    }

    private static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
