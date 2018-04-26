/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa;

/**
 *
 * @author mocsa
 */
public class Produto {
        private float preco;
    public String nome;
    private int codigo;
    public int quantidade;

    
    public void mostrarAtributos(){
        System.out.println("Codigo :" + this.codigo);
        System.out.println(this.preco + "R$");
        System.out.println("[" + this.nome + "]");
        System.out.println("Qnt :" + this.quantidade);
        
    
    }
    
    
    public static void mostrarVitrine(){
        System.out.println("1 - Mostrar vitrine produto");
        System.out.println("2 - ver carrinho");
        System.out.println("3 - sair");

    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}