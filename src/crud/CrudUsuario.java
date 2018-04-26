/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import caixa.Usuario;
import java.util.Scanner;

public class CrudUsuario {

    Usuario usu = new Usuario();
    Scanner scan = new Scanner(System.in);
    public void cadaUsuario() {
        System.out.println("Bem vindo ao sistema de cadastros de usuários");
        System.out.println("Digite o nome do usuário");
        usu.setNomeUsuario(scan.next());
        System.out.println("Digite a senha");
        usu.setSenha(scan.next());
        System.out.println("Usuario cadastrado");
    }
    public void cadaCaixa(){
        System.out.println("Digite o nome do operador de caixa");
        usu.setNomeCaixa(scan.next());
    
    }
    public void mostrarUsuario(){
        System.out.println("Usuario:" +usu.getNomeUsuario());
        System.out.println("Caixa:" + usu.nomeCaixa);
    }
    
    
}
