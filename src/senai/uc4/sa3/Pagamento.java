package senai.uc4.sa3;
public class Pagamento {

    private int tipoPagamento;
    private double valor;
    private String descricao;
    private String dataPagamento;


    public Pagamento() {
        this.tipoPagamento = tipoPagamento;
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getTipoPagamento() {
        return tipoPagamento;
    }
    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
        System.out.println("Escolha a Forma de Pagamento:");
        if (this.tipoPagamento == 1){
            System.out.println("1 - Dinheiro");
        } else if (tipoPagamento == 2) {
            System.out.println("2 - Cartão Debito");
        } else if (tipoPagamento == 3) {
            System.out.println("3 - Cartão Credito");
        } else if (tipoPagamento == 4) {
            System.out.println("4 - Pix");
        }
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String toString() {
        return "Pagamento{" + "tipoPagamento=" + tipoPagamento + ", valor=" + valor +
                ", descricao=" + descricao + ", dataPagamento=" + dataPagamento + '}';
    }




}
