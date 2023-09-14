package carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> itemList = new ArrayList<>();
    // Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }
    //Remove um item do carrinho com base no seu nome.
    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        for(Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)) {
                itemRemover.add(i);
            }
        }
        itemList.removeAll(itemRemover);
    }
    // Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item i : itemList) {
           valorTotal += i.getQuantidade() * i.getPreco();
        }
        return valorTotal;
    }
    // Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
    public void exibirItens(){
        System.out.println(itemList);
    }

}
