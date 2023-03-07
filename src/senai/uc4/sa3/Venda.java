package senai.uc4.sa3;

import java.util.ArrayList;

public class Venda {

    private double virTotal;
    private ArrayList<Produto> listavenda;

    public Venda() {
        this.virTotal = virTotal;
        this.listavenda = listavenda;
    }

    public void adicionarItemVenda(Produto prod) {
        virTotal += prod.getPreco();
        listavenda.add(prod);
        System.out.println(prod.getNome());
        System.out.println(prod.getPreco());
        System.out.println(prod.getDescricao());
        System.out.println(prod.getQuantidade());
    }
    public void visualizarVenda(){
        System.out.println(listavenda);
        System.out.println(virTotal);
    }

    public void concluirVenda(Pagamento prod ){
        System.out.println("Venda concluída com sucesso!"
         + "\nVir Total: " + virTotal);
        System.out.println(listavenda);
        listavenda.clear();
        virTotal = 0;
        System.out.println(listavenda);
        System.out.println(prod.toString());
    }

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

    public String toString() {
        return "Venda{" + "virTotal=" + virTotal + ", listavenda=" + listavenda + '}';
    }


    public void adicionarProduto(Produto produto) {
        virTotal += produto.getPreco();
        listavenda.add(produto);
    }
}
