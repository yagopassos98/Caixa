package caixa;
//GRUPO: PEDRO HENRIQUE PINHO, FELIPE REGIS, JOAO MARCELO, YAGO PASSOS
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import crud.CrudUsuario;
import crud.CrudProduto;

public class Caixa {

    public static void main(String[] args) {
        // senha do administrador = 1234

        //variaveis 
        CrudUsuario user = new CrudUsuario();
        CrudProduto pro = new CrudProduto();
        int op;
        String senhaAdministrador;
        int opcao2;
        opcao2 = 0;
        float total = 0;
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("H:m:s");
        String dataFormatada = formatar.format(data);
        Scanner entrada = new Scanner(System.in);

        System.out.println("(100)Usuario ou (200)administrador?");
        op = entrada.nextInt();
        while (op != 3) {
            switch (op) {
                case 100: {
                    ////////// //USUARIO///////////////
                    user.cadaUsuario();
                    System.out.println("===Vitrine===");

                    while (opcao2 != 3) {
                        System.out.println("====Menu====");
                        System.out.println("1 - Mostrar vitrine produto");
                        System.out.println("2 - ver carrinho");
                        System.out.println("3 - sair");

                        opcao2 = entrada.nextInt();
                        switch (opcao2) {
                            case 1: {
                                System.out.println("\n \n \n \n \n");
                                pro.vizuProduto();
                            }break;
                           
                            case 2: {
                                System.out.println("Carrinho");
                                pro.addCarrinho();
                            }
                            System.out.println("Nota Fiscal:");

                            user.mostrarUsuario();
                            pro.notaFiscal();
                            System.out.println("HORA DA COMPRA :" + dataFormatada);
                            opcao2 = 3;
                        }
                    }

                }break;
            
        
    

          case 200: {

                    ////////////////////ADMIN///////////////////////
                    user.cadaCaixa();
                    
                    
                    System.out.println("Digite a senha de administrador");
                    senhaAdministrador = entrada.next();
                    if ("1234".equals(senhaAdministrador)) {
                        System.out.println("Bem vindo admnistrador");
                        System.out.println("(1) Adicionar produtos a vitrine");
                        System.out.println("(2) sair de administrador ");
                        int op4;

                        op4 = entrada.nextInt();
                        while (op4 != 3) {

                            switch (op4) {

                                case 1: {
                                 pro.cadaProduto();
                                 }
                                
                            
                        case 2:{
                                System.out.println("\n \n \n \n");
                                System.out.println("Digite 100 para voltar a area de usuario");
                                System.out.println("Digite 3 para sair");
                                System.out.println("\n \n \n \n");
                                op = entrada.nextInt();
                                op4 = 3;
                            }break;
                        
                                    }
                        
                                }
                        
                    
                    }else{
                        System.out.println("Senha incorreta");
                        
                    
                    
                    }

                    }break;
                    
                
            
        
    

case 3:{
                        
                    op = 3;    
                        
                        
                    }break;
                }

                
                }
    }
    } 
                


