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


abstract class Funcionario {
    private String nome;    
    private float salario;
    
    
    
    abstract double calcularBonus();

    public void mostrarDados() {};
}

class Bibliotecario extends Funcionario {
    private String nome;
    private float salario;
    
    public Bibliotecario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    @Override
    double calcularBonus() {
        return 0;
    }
}


class Gerente extends Funcionario {
    private String nome;
    private float salario;
    
    public Gerente(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    @Override
    double calcularBonus() {
        return salario * 0.1;
    }
}
