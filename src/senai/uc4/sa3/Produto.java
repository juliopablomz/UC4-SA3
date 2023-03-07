package senai.uc4.sa3;

public class Produto {
    //ELmanoel

    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private int quantidade;
    private String descricao;

    public Produto() {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void adicionarEstoque(int quantidade){
        this.quantidadeEstoque += quantidade;
    }
    
    public void removerEstoque(int quantidade){
        this.quantidadeEstoque -= quantidade;
    }
    
    public void imprimirEstoque(){
        System.out.printf("Estoque atual: %d\n", this.quantidadeEstoque);
    }
    
    public void imprimirPreco(){
        System.out.printf("Preço: R$ %.2f\n", this.preco);
    }
    
    public void imprimirNome(){
        System.out.printf("Nome: %s\n", this.nome);
    }
    
    public void imprimirQuantidade(){
        System.out.printf("Quantidade: %d\n", this.quantidadeEstoque);
    }
    
    public void imprimirTotal(){
        System.out.printf("Total: R$ %.2f\n", this.preco * this.quantidadeEstoque);
    }
    
    public boolean verificarPreco(){
        if(this.preco <= 0) return false;
        return true;
    }
    
    public boolean verificarNome(){
        if(this.nome == null) return false;
        return true;
    }
    
    public boolean verificarQuantidade(){
        if(this.quantidadeEstoque <= 0) return false;
        return true;
    }
    
    public boolean verificarTotal(){
        if(this.preco <= 0 || this.quantidadeEstoque <= 0) return false;
        return true;
    }
    
    public boolean verificarProduto(){
        if(verificarPreco() && verificarNome() && verificarQuantidade() && verificarTotal())
            return true;
        return false;
    }

    public boolean verificarEstoque(){
        if(this.quantidadeEstoque == 0) return false;
        if(this.quantidadeEstoque >= 100 ) {
            System.out.printf("Produtos suficiente em Estoque.");
        } else if (this.quantidadeEstoque <100 && this.quantidadeEstoque > 50) {
            System.out.printf("Estoque chegou na metade, Por favor repor.");
        } else if (this.quantidadeEstoque <=10) {
            System.out.printf("Repor o estoque urgente!");
        }
        return true;
    }

    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }



}
