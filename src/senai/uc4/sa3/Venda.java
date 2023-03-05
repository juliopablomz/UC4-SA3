package senai.uc4.sa3;

import java.util.ArrayList;

public class Venda {

    private double virTotal;
    private ArrayList<Produto> listavenda;

    public Venda() {
        this.virTotal = 0;
        this.listavenda = new ArrayList<>();
    }

    public void adicionarItemVenda(Produto prod) {
        // TODO não implementado.
    }

    public void visualizarVenda() {
        // TODO não implementado.
    }

    // Faltando classe pagamento
    public void concluirVenda(Object pag) {
        // TODO não implementado.
    }


    // Getters and Setters

    public double getVirTotal() {
        return virTotal;
    }

    public void setVirTotal(double virTotal) {
        this.virTotal = virTotal;
    }

    public ArrayList<Produto> getListavenda() {
        return listavenda;
    }

    public void setListavenda(ArrayList<Produto> listavenda) {
        this.listavenda = listavenda;
    }

}
