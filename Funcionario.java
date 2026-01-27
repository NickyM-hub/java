abstract class Funcionario implements Pagamento {
    private String nome;    
    private float salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public void processarPagamento(double valor) {
    }

    abstract double calcularBonus();

    public void mostrarDados() {};
}

class Bibliotecario extends Funcionario {

    public Bibliotecario(String nome, float salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.1;
    }

    @Override
    public void processarPagamento(double valor) {
        double total = getSalario() + calcularBonus() - valor;
        System.out.println("Pagamento total: " + total);
    }

    @Override
    public void mostrarDados() {
        System.out.println("O bibliotecário se chama: " + getNome() + ", e o seu salário é: R$" + getSalario());
    }
}


class Gerente extends Funcionario {

    public Gerente(String nome, float salario) {
        super(nome, salario);
    }

    @Override
    double calcularBonus() {
        return getSalario() * 0.5;
    }

    @Override
    public void processarPagamento(double valor) {
        double total = getSalario() + calcularBonus() - valor;
        System.out.println("Pagamento total: " + total);
    }

    @Override
    public void mostrarDados() {
        System.out.println("O gerente se chama: " + getNome() + ", e o seu salário é: R$" + getSalario());
    }
}