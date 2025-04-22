package CarrinhoDeCompras;

import java.util.List;
import java.util.Scanner;

public class CarrinhoDeCompras {

    private List<Item> listaItens;

    Scanner scanner = new Scanner(System.in);

    public void adicionarItem(String nome, double preco, int quantidade){

        Item item = new Item(nome, preco, quantidade);
        listaItens.add(item);
    }

    public void removerItem(String nome){


    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Sabonete", 2.50, 4);

    }
}
