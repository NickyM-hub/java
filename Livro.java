public class Livro {
    private String livro;
    private String autor;
    private boolean disponivel;

    public Livro(String livro, String autor) {
        this.livro = livro;
        this.autor = autor;
    }
      

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    
    
    public boolean emprestar() {
        return disponivel = false;
    };
    
    public boolean devolver() {
        return disponivel = true;
    };
}

class Usuario {
    private String nome;
    private float idade;

    public Usuario(String nome, float idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    
    
    
    public void apresentar() {};
}
