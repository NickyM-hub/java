class Main {
    static void main() {
        Funcionario bibliotecario = new Bibliotecario("Ana", 3000);
        bibliotecario.mostrarDados();
        bibliotecario.processarPagamento(3000);

        Funcionario gerente = new Gerente("Carlos", 5000);
        gerente.mostrarDados();
        gerente.processarPagamento(5000);
    }
}
