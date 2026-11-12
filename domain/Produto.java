package Projeto.Marketplace.Em.Java.domain;

public class Produto {
    private String nome;
    private double precoDeCompra;
    private double precoDeVenda;
    private int quantidadeEmEstoque;
    private String categoria;
    private double lucroPotencial;
    private double lucroPotencialPorUnidade;

    public Produto(String nome, double precoDeCompra, int quantidadeEmEstoque, String categoria) {
        this.nome = nome;
        this.precoDeCompra = precoDeCompra;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.categoria = categoria;
    }

    public Produto(String nome, double precoDeCompra, double precoDeVenda, int quantidadeEmEstoque, String categoria) {
        this(nome, precoDeCompra, quantidadeEmEstoque, categoria);
        this.precoDeVenda = precoDeVenda;
    }

    public void informacoesProduto() {
        System.out.println("------------------------------------------------------");
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço de compra: " + precoDeCompra);
        if (precoDeVenda > 0) {
            System.out.println("Preço de venda: " + precoDeVenda);
        }
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
        System.out.println("Categoria: " + categoria);
        System.out.println("------------------------------------------------------");
    }

    public void totalInvestido() {
        double dinheiroInvestido = (quantidadeEmEstoque * precoDeCompra);
        System.out.println("------------------------------------------------------");
        System.out.println("Total investido no produto " + nome + " : R$" + dinheiroInvestido);
        System.out.println("------------------------------------------------------");
    }

    public void lucroEstimado() {
        if (precoDeVenda > 0) {
            lucroPotencial = (precoDeVenda * quantidadeEmEstoque) - (quantidadeEmEstoque * precoDeCompra);
        }
    }

    public void lucroEstimadoPorUnidade() {
        if (precoDeVenda > 0) {
            lucroPotencialPorUnidade = (precoDeVenda - precoDeCompra);
        }
    }

    public void informacoesLucroGeral() {
        lucroEstimado();
        lucroEstimadoPorUnidade();
        System.out.println("------------------------------------------------------");
        System.out.println("Lucro estimado do " + nome + " por unidade : R$" + lucroPotencialPorUnidade);
        System.out.println("Lucro estimado do " + nome + " : R$" + lucroPotencial);
        System.out.println("------------------------------------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoDeCompra() {
        return precoDeCompra;
    }

    public void setPrecoDeCompra(double precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
