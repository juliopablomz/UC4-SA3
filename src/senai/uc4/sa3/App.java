package senai.uc4.sa3;
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Produto produto = new Produto("Arroz",15,1);

        Pagamento p1 = new Pagamento(1);

        p1.selecionarTipoPagamento(4);
      //  p1.realizarPagamento(p1);
        
    }



}
