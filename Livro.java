public class Livro {
    private String livro;
    private String autor;
    private boolean disponivel;

    static int livrosEmprestados = 0;
    static int totalLivros = 100;

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
        this.disponivel = true;
    }
    
    public boolean emprestar() {
        livrosEmprestados++;
        totalLivros--;
        return disponivel = false;
    };
    
    public boolean devolver() {
        livrosEmprestados--;
        totalLivros++;
        return disponivel = true;
    }
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
