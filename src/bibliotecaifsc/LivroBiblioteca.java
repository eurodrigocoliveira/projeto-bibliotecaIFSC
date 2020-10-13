/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaifsc;

/**
 *
 * @author Rodrigo
 */
public class LivroBiblioteca {
    //atributos
    private String Titulo;
    private String Autor;
    private String Editora;
    private int AnoPublicacao;
    private String Assunto;
    
    //construtores
    public LivroBiblioteca() { } // padrao default
    //sobrecarregado
    public LivroBiblioteca(String Titulo, String Autor, String Editora, int AnoPublicacao, String Assunto) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Editora = Editora;
        this.AnoPublicacao = AnoPublicacao;
        this.Assunto = Assunto;
    }
    
    //métodos de acesso - get - set
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public int getAnopublicacao() {
        return AnoPublicacao;
    }

    public void setAnoPublicacao(int AnoPublicacao) {
        this.AnoPublicacao = AnoPublicacao;
    }

    public String getAssunto() {
        return Assunto;
    }

    public void setAssunto(String Assunto) {
        this.Assunto = Assunto;
    }
    
    //metodos de classe impressao
    public String imprimir(){
        return "Título: " + Titulo + "\nAutor: " + Autor +
               "\nAno Publicação: " + AnoPublicacao + "\nEditora: " + Editora +
               "\nAssunto: " + Assunto;
    }
}