package carrinho;

public class App {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Coca", 2.90, 5);
        carrinho.adicionarItem("Guaraná", 2.49, 3);
        carrinho.adicionarItem("Biscoito", 1.99, 10);
        carrinho.exibirItens();
        carrinho.removerItem("Coca");
        carrinho.exibirItens();
        System.out.printf("Valor total do carrinho: %.2f" , carrinho.calcularValorTotal());

    }
}
