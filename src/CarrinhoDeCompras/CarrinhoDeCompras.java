package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrinhoDeCompras {

    private List<Item> listaItens;

    public CarrinhoDeCompras(){
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){

        Item item = new Item(nome, preco, quantidade);
        this.listaItens.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        if (!listaItens.isEmpty()) {
            for(Item i : listaItens) {
                if(i.getName().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            listaItens.removeAll(itensParaRemover);
        } else {
            System.out.println("Lista vazia");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!listaItens.isEmpty()){
            for(Item item : listaItens){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public void exibirItens(){
        if (!listaItens.isEmpty()){
            System.out.println(this.listaItens);
        } else {
            System.out.println("Lista vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "listaItens=" + listaItens +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Sabonete", 2.50, 4);
        carrinhoDeCompras.adicionarItem("Balde", 25.00, 1);
        carrinhoDeCompras.adicionarItem("iPhone", 5000.00, 1);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("iPhone");

        carrinhoDeCompras.exibirItens();

        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());

    }
}
