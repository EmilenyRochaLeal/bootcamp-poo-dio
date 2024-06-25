package br.com.dio.desafio.dominio;

import java.sql.Date;

public class Artigo {
        private String titulo;
        private String tecnologias;
        private String texto;
        private String status;
        private Date dataSubmissao;
    
        public Artigo(String titulo, String tecnologias, String texto) {
            this.titulo = titulo;
            this.texto = texto;
            this.status = " ";
            this.tecnologias = tecnologias;
            this.dataSubmissao = new Date(0);
        }

        public void publicar(){
            this.status = "Publicado ";
        }

        public String toString(){
            return this.titulo + "\n" + 
            this.tecnologias + "\n" +
            this.texto + 
            "\n\n" + this.status + " em " + this.dataSubmissao;
        }
        
}
