package senai.uc4.sa3;

import java.util.ArrayList;

public class Venda {

    private double virTotal;
    private ArrayList<Produto> listavenda;

    public Venda() {
        virTotal = 0;
        listavenda = new ArrayList<>();
    }

    public void adicionarItemVenda(Produto prod) {
        listavenda.add(prod);
        virTotal += prod.getPreco();
    }

    public void adicionarItemVenda(Produto prod, double preco) {
        listavenda.add(prod);
        virTotal += preco;
    }

    public void adicionarItemVenda(Produto prod, double preco,
                                   int quantidade, String descricao, double valorUnitario,
                                   int qtdEstoque) {
        listavenda.add(prod);
        virTotal += preco * quantidade;
    }
    public void adicionarItemVenda(Produto prod, double preco,
                                   int quantidade, String descricao, double valorUnitario,
                                   int qtdEstoque, double valorTotal) {
        listavenda.add(prod);
        virTotal += preco * quantidade;
        this.virTotal += valorTotal;
        this.virTotal += valorUnitario * qtdEstoque;


    }

    public double getVirTotal() {
        return virTotal;
    }
    public ArrayList<Produto> getListavenda() {
        return listavenda;
    }
    public void setVirTotal(double virTotal) {
        this.virTotal = virTotal;
    }
    public void setListavenda(ArrayList<Produto> listavenda) {
        this.listavenda = listavenda;

    }

    public String toString() {
        return "Venda{" + "virTotal=" + virTotal + ", listavenda=" + listavenda + '}';
    }


    public void adicionarProduto(Produto produto) {
        virTotal += produto.getPreco();
        listavenda.add(produto);
    }
}
