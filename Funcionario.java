abstract class Funcionario implements Pagamento {
    private String nome;    
    private float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
        
    }

    @Override
    public abstract processarPagamento(double valor);

    abstract double calcularBonus();

    public void mostrarDados() {};
}

class Bibliotecario extends Funcionario {
    super(nome, salario);

    @Override
    public double calcularBonus() {
        return salario * 0.01;
    }

    @Override 
    public abstract void processarPagamento(double valor) {
        valor * 0.2;
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

    @Override
    public abstract void processarPagamento(double valor);
}
