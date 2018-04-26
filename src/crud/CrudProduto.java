package crud;

import caixa.Produto;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CrudProduto {

    Produto prod = new Produto();
    Scanner scan = new Scanner(System.in);
    int cartao = 0;
    int parar = 0;
    public int x = 0;
    int para2 = 0;
    Map<Integer, String> mapaNome = new HashMap();
    Map<Integer, Float> mapaPreco = new HashMap();
    ArrayList<Produto> vitrine = new ArrayList<>();
    ArrayList<Produto> carrinho = new ArrayList<>();

    public void cadaProduto() {

        while (parar != 1) {
            Produto prod = new Produto();
            System.out.println("Digite o codigo");
            prod.setCodigo(scan.nextInt());
            System.out.println("Digite o preco do produto");
            prod.setPreco(scan.nextFloat());
            //mapaPreco.put(prod.getCodigo(), prod.getPreco());
            System.out.println("Digite o nome");
            prod.setNome(scan.next());
            //mapaNome.put(prod.getCodigo(), prod.getNome());
            vitrine.add(prod);
            // carrinho.addAll(vitrine);
            // codigos.add(prod.getCodigo());
            System.out.println("Digite 1 para parar ");
            parar = scan.nextInt();

        }
    }

    public void vizuProduto() {
        for (int i = 0; i < vitrine.size(); i++) {
            prod = vitrine.get(i);
            System.out.println("//////////////////////////////");
            System.out.println("CODIGO:" + prod.getCodigo());
            System.out.println("[" + prod.getNome() + "]");
            System.out.println(prod.getPreco() + "R$");
        }

    }

    public void addCarrinho() {

        while (para2 != 1) {
            int i = 0;
            int j = 0;
            System.out.println("Digite o codigo do produto que quer comprar");
            prod.setCodigo(scan.nextInt());
            while (prod.getCodigo() != vitrine.get(i).getCodigo()) {

                i++;
                //
            }
            carrinho.add(vitrine.get(i));

            //carrinho.add(prod);
            //System.out.println("////////////");
            for (Produto prod : carrinho) {
                System.out.println("NO CARRINHO:");
                System.out.println(prod.getNome());

            }
            //System.out.println("////////////////");
            //vitrine.get(i).mostrarAtributos();
            System.out.println("Digite a quantidade desejada do produto");
            carrinho.get(j).setQuantidade(scan.nextInt());
            System.out.println("Deseja adcionar outro? (1) - NAO (0) - SIM");
            para2 = scan.nextInt();
            j++;
        }
    }

    public void notaFiscal() {
        float total = 0;
        float quantidade;
        System.out.println("Deseja pagar em cartao?(1) ou Dinheiro?(2) ");
        cartao = scan.nextInt();
            if (cartao == 1) {
                System.out.println("COMPRA REALIZADA COM CARTAO");
            } else {
                System.out.println("COMPRA REALIZADA COM DINEHIRO");

            }
        for (int i = 0; i < carrinho.size(); i++) {
            carrinho.get(i).mostrarAtributos();
            System.out.println(carrinho.get(i).getQuantidade());
            quantidade = carrinho.get(i).getPreco() * carrinho.get(i).getQuantidade();
            total = total + quantidade;
            System.out.println("Total :" + total);
        }
    }
}
