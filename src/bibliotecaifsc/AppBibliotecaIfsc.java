/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaifsc;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class AppBibliotecaIfsc {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        
        int menu;
        int vInicial, vFinal;
        //referencia para a classe LivroBiblioteca
        LivroBiblioteca objLivro;
        
        String Titulo, Autor, Editora, Assunto;
        int AnoPublicacao;
        
        //loop menu exibicao
        
        do{
            exibirMenu();
            menu = entrada.nextInt();
            
            switch(menu){
                case 1: //cadastro do Livro
                    System.out.println("===> Cadastrar Livro");
                    System.out.println("Digite o Título: ");
                    Titulo = entradaString.nextLine();
                    System.out.println("Digite o Autor: ");
                    Autor = entradaString.nextLine();
                    System.out.println("Digite o Editora: ");
                    Editora = entradaString.nextLine();
                    System.out.println("Digite o Ano Publicação: ");
                    AnoPublicacao = entrada.nextInt();
                    System.out.println("Digite o Assunto: ");
                    Assunto = entradaString.nextLine();
                    
                    //cria objeto da classe
                    objLivro = new LivroBiblioteca(Titulo, Autor, Editora, AnoPublicacao, Assunto);
                    
                    //guardar no ArrayList;
                    Acervo.adicionar(objLivro);
                    
                    break;
                case 2:
                    System.out.println("===> Listagem de Livros");
                    System.out.println( Acervo.lista() );
                    break;
                case 3:
                    System.out.println("===> Exclusão do Livro");
                    System.out.println("Digite o título do livro");
                    Titulo = entradaString.nextLine();
                    
                    if( ! (Acervo.getListaLivros().isEmpty())){
                        if( Acervo.remover(Titulo)){
                            System.out.println("Livro removido com sucesso!!");
                        }else{
                            System.out.println("Título não encontrado!!");
                        }
                    }else{
                        System.out.println("Não existem livros cadastrados na biblioteca");
                        }
                    break;
                case 4:
                    System.out.println("===> Pesquisar por Título (Digite o Título Completo)");
                    System.out.println("Digite o Título: ");
                    Titulo = entradaString.nextLine();
                    System.out.println("Existem " + Acervo.pesquisar(Titulo)
                            + " livro(s) com esse título " + Titulo);
                    break;
                case 5:
                    System.out.println("===> Pesquisar pelo Assunto");
                    System.out.println("Digite o Assunto: ");
                    Assunto = entradaString.nextLine();
                    System.out.println("Existem " + Acervo.pesquisar(Assunto)
                            + " livro(s) com esse Assunto " + Assunto);
                    break;
                case 6:
                    System.out.println("Saindo da Biblioteca IFSC...");
                    break;
                
                default:
                    System.out.println("Opção de menu inválida! \nEscolha entre as opções válidas 1 à 6: ");
            }
            
        }while(menu !=6);
        
    }//fim mains
    
    static void exibirMenu(){
        System.out.println("======= BIBLIOTECA IFCS =======");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - LISTAR");
        System.out.println("3 - EXCLUIR LIVRO");
        System.out.println("4 - PESQUISAR POR TÍTULO");
        System.out.println("5 - PESQUISAR POR ASSUNTO");
        System.out.println("6 - SAIR");
        System.out.println("=======> Escolha uma opção: ");
        
    }
    
}
