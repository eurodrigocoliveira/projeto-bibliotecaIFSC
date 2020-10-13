/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaifsc;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class Acervo {
    private static ArrayList<LivroBiblioteca> listaLivros = new ArrayList<>();
    
    //metodo get
    public static ArrayList<LivroBiblioteca> getListaLivros() {
        return listaLivros;
    }
    
    //adicionar objeto a lista
    public static void adicionar(LivroBiblioteca l){
        listaLivros.add(l);
    }
    
    //listar todos objetos da lista
    static public String lista(){
        String saida = "";
        int i = 1;
        for(LivroBiblioteca l : listaLivros){
            saida += "\n======= LIVRO Nº " + (i++) + " =====\n";
            saida += l.imprimir() + "\n";
        }
        return saida;
    }
    
    //listra livros por assunto
    static public int pesquisar(String Assunto){
        int qtd = 0;
        
        for (LivroBiblioteca l : listaLivros){
            if(l.getAssunto().equalsIgnoreCase(Assunto)){
                qtd++;
            }
        }
        
        return qtd;
    }
    
    //remover um livro pelo título
    static public boolean remover(String Titulo){
        for(LivroBiblioteca l : listaLivros){
            if(l.getTitulo().equalsIgnoreCase(Titulo)){
                listaLivros.remove(l);
                return true;
            }        
            
        }
        return false;
    }    
}
