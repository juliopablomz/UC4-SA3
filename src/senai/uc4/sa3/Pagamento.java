package senai.uc4.sa3;
import java.util.Scanner;
public class Pagamento {

    private int tipoPagamento;

    public Pagamento (int Pagamento){
        this.tipoPagamento = tipoPagamento;
       
    }
    
    public int getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    public void selecionarTipoPagamento(int pag){
        this.tipoPagamento = pag;
        switch(pag){
            case 1:
            System.out.println("1 - Dinheiro. ");
            break;

            case 2: 
            System.out.println("2 - Cheque. ");
            break;

            case 3:
            System.out.println("3 - Cartão de débito. ");
            break;

            case 4:
            System.out.println("4 - Cartão de crédito. ");
            break;

            case 5:
            System.out.println("5 - Pix. ");
            break;

            default : System.out.println("Nenhum meio de pagamento selecionado!");
            
        }

    }
      
    public void realizarPagamento(Pagamento pagamento){
        System.out.println("Pagamento realizado com a opção " +tipoPagamento);
    }
}
